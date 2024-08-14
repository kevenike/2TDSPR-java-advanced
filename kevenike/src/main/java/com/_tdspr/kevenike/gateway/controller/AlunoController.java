package com._tdspr.kevenike.gateway.controller;

import com._tdspr.kevenike.domain.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {


    @GetMapping("/fiap")
    public ResponseEntity<String> getAlunos(){
            return ResponseEntity.ok("hello world");
    }

    @GetMapping("/fiap/{alunoId}")
    public ResponseEntity<String> getAluno(@PathVariable String alunoId){
        return ResponseEntity.ok("hello world o id é " + alunoId);
    }

    @PostMapping("/fiap")
    public  ResponseEntity<Aluno> postAluno(@RequestBody Aluno aluno) {
        Aluno alunoAtualizado = new Aluno();

        alunoAtualizado.setRm("1234567");
        alunoAtualizado.setRegitro(alunoAtualizado.getRegitro());

        return ResponseEntity.ok(alunoAtualizado);
    }
}
