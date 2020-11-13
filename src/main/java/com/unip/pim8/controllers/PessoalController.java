package com.unip.pim8.controllers;

import com.unip.pim8.daos.PessoaDao;
import com.unip.pim8.entities.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoa", produces = MediaType.APPLICATION_JSON_VALUE)
public class PessoalController {

    @Autowired
    private PessoaDao pessoaDao;

    @GetMapping
    public ResponseEntity<List<Pessoa>> getAll() {
        return ResponseEntity.ok(pessoaDao.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> get(@PathVariable("id") int id) {
        return ResponseEntity.ok(pessoaDao.obter(id));
    }

    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<Pessoa> getForCPF(@PathVariable("cpf") int cpf) {
        return ResponseEntity.ok(pessoaDao.obterPorCPF(cpf));
    }

    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(pessoaDao.salvar(pessoa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable("id") int id) {
        pessoaDao.deletar(id);
        return ResponseEntity.ok(true);
    }

}
