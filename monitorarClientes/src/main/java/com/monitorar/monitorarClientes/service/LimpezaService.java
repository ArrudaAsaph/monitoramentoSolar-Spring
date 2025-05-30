package com.monitorar.monitorarClientes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exception.NaoEncontrado;
import com.monitorar.monitorarClientes.dto.LimpezaDTO;
import com.monitorar.monitorarClientes.model.Cliente;
import com.monitorar.monitorarClientes.model.Limpeza;
import com.monitorar.monitorarClientes.repository.ClienteRepository;
import com.monitorar.monitorarClientes.repository.LimpezaRepository;

@Service
public class LimpezaService {
    private LimpezaRepository limpezaRepository;
    private ClienteRepository clienteRepository;

    public LimpezaService
    (
        LimpezaRepository limpezaRepository,
        ClienteRepository clienteRepository
    ) {
        this.clienteRepository = clienteRepository;
        this.limpezaRepository = limpezaRepository;
    }

    public Limpeza save(LimpezaDTO dto) {
        if (limpezaRepository.existsByClienteIdAndDtLimpeza(dto.getClienteId(), dto.getDtLimpeza())) {
            throw new IllegalArgumentException("Limpeza já cadastrada para este cliente nesta data!");
        }

        Cliente cliente =  clienteRepository.findById(dto.getClienteId())
            .orElseThrow(()  -> new NaoEncontrado("Cliente não existente"));;
        


        Limpeza limpeza = new Limpeza();
        limpeza.setValor(dto.getValor());
        limpeza.setCliente(cliente);
        limpeza.setDificuldade(dto.getDificuldade());
        limpeza.setDtLimpeza(dto.getDtLimpeza());
        return limpezaRepository.save(limpeza);

    }

    public List<Limpeza> findAll() {
        return limpezaRepository.findAll();
    }

    public Limpeza findById(Long id) {
        return limpezaRepository.findById(id)
            .orElseThrow(() -> new NaoEncontrado("Limpeza não encontrada!"));
    }

    public Limpeza update(Long id, LimpezaDTO dto) {
    
    Limpeza limpeza = findById(id);

    
    Cliente cliente = clienteRepository.findById(dto.getClienteId())
        .orElseThrow(() -> new NaoEncontrado("Cliente não existente"));

    if (limpezaRepository.existsByClienteIdAndDtLimpeza(dto.getClienteId(), dto.getDtLimpeza()) &&
    !dto.getDtLimpeza().equals(limpeza.getDtLimpeza())) {
    throw new IllegalArgumentException("Já existe uma limpeza com essa data para o cliente!");
}   


    limpeza.setValor(dto.getValor());
    limpeza.setDificuldade(dto.getDificuldade());
    limpeza.setDtLimpeza(dto.getDtLimpeza());
    limpeza.setCliente(cliente); 

   
    return limpezaRepository.save(limpeza);
}


    public void delete(Long id) {
        Limpeza limpeza = findById(id);
        limpezaRepository.delete(limpeza);
    }
}
