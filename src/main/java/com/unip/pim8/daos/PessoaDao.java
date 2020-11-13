package com.unip.pim8.daos;

import com.unip.pim8.entities.Pessoa;

import java.util.List;

public interface PessoaDao {

    List<Pessoa> listarTodos();

    Pessoa obter(int id);

    Pessoa obterPorCPF(long cpf);

    Pessoa salvar(Pessoa pessoa);

    void deletar(int id);

}
