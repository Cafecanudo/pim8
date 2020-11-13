package com.unip.pim8.daos;

import com.unip.pim8.entities.Pessoa;
import com.unip.pim8.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class PessoaDaoImpl implements PessoaDao {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public List<Pessoa> listarTodos() {
        return StreamSupport.stream(pessoaRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Pessoa obter(int id) {
        return pessoaRepository.findById(id).get();
    }

    @Override
    public Pessoa obterPorCPF(long cpf) {
        return pessoaRepository.findByCpf(cpf);
    }

    @Override
    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public void deletar(int id) {
        pessoaRepository.deleteById(id);
    }
}
