package com.monitorar.monitorarClientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monitorar.monitorarClientes.model.Dimensionamento;

@Repository
public interface DimensionamentoRepository extends JpaRepository<Dimensionamento, Long> {
    
}
