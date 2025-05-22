package com.monitorar.monitorarClientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monitorar.monitorarClientes.model.Kit;

@Repository
public interface KitRepository  extends JpaRepository<Kit, Long>{
    
}
