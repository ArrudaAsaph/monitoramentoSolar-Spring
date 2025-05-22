package com.monitorar.monitorarClientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monitorar.monitorarClientes.model.Geracao;

@Repository
public interface GeracaoRepository extends JpaRepository<Geracao, Long> {
    
}
