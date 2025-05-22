package com.monitorar.monitorarClientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monitorar.monitorarClientes.model.Limpeza;

@Repository
public interface LimpezaRepository extends JpaRepository<Limpeza, Long> {
    
}
