package com.unip.pim8.repositories;

import com.unip.pim8.entities.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

    Pessoa findByCpf(long cpf);

}
