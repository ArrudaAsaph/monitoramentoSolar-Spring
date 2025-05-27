package com.monitorar.monitorarClientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monitorar.monitorarClientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    boolean existsByEmail(String email);
    boolean existsByEndereco(String endereco);
}
