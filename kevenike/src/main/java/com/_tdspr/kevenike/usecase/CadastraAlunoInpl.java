package com._tdspr.kevenike.usecase;

import com._tdspr.kevenike.domain.Aluno;

public class CadastraAlunoInpl implements CadastrarAluno {
    @Override
    public Aluno executar(Aluno alunoParaSerCadastrado) {

        Aluno cadastrar = new Aluno();

        cadastrar.setNome(alunoParaSerCadastrado.getNome());
        cadastrar.setSobrenome(alunoParaSerCadastrado.getSobrenome());
        cadastrar.setDocumento(alunoParaSerCadastrado.getDocumento());

        return cadastrar;
    }
}
