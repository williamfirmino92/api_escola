package br.com.escola.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.escola.api.model.aluno.Aluno;
import br.com.escola.api.model.aluno.AlunoRepository;
import br.com.escola.api.model.aluno.DadosCadastroAluno;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @PostMapping("/cadastro")
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroAluno dados) {
        repository.save(new Aluno(dados));
    }

}

// @PostMapping("/cadastro")
// public void cadastrar(@RequestBody DadosCadastroAluno dados) {
// System.out.println(dados);
// }

// @PostMapping
// public void cadastro(@RequestBody String json) {
// System.out.println(json);
// }