package com.monitorar.monitorarClientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monitorar.monitorarClientes.model.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {
    
}
