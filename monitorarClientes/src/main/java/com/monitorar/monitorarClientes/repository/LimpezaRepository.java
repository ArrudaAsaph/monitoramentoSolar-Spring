package com.monitorar.monitorarClientes.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monitorar.monitorarClientes.model.Limpeza;


@Repository
public interface LimpezaRepository extends JpaRepository<Limpeza, Long> {
    
    boolean existsByClienteIdAndDtLimpeza(Long clienteId, LocalDate dtLimpeza);

}
