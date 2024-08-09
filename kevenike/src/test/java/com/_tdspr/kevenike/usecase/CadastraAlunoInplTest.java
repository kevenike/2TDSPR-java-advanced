package com._tdspr.kevenike.usecase;

import com._tdspr.kevenike.domain.Aluno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CadastraAlunoInplTest {

    CadastrarAluno cadastrarAluno  = new CadastraAlunoInpl();


    @Test
    @DisplayName("TESTA SE AS INFORMAÇÃO DE OBJETO ALUA")
    void testExecutaDeCadastrarAluno(){
        //Arrange
        Aluno alunoASerCdatrado = new Aluno();
        alunoASerCdatrado.setNome("joao");
        alunoASerCdatrado.setSobrenome("calos");
        alunoASerCdatrado.setDocumento("503.263.858-78");

        //ACT
        Aluno cadastrado = cadastrarAluno.executar(alunoASerCdatrado);


        Assertions.assertEquals(alunoASerCdatrado.getNome(), cadastrado.getNome());

    }
}