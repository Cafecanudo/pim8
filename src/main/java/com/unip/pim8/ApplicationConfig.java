package com.unip.pim8;

import com.unip.pim8.daos.PessoaDao;
import com.unip.pim8.daos.PessoaDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public PessoaDao criarPessoaDao(){
        return new PessoaDaoImpl();
    }

}
