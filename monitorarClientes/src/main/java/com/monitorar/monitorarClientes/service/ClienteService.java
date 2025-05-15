package com.monitorar.monitorarClientes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exception.NaoEncontrado;
import com.monitorar.monitorarClientes.model.Cliente;
import com.monitorar.monitorarClientes.repository.ClienteRepository;

@Service
public class ClienteService {
    
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarCliente() {
        return clienteRepository.findAll(); //Listar todos os clientes
    }

    public Optional<Cliente> buscarPorId(Long id) {
        if (!clienteRepository.existsById(id)) {
            throw new NaoEncontrado("Cliente nao existente");
    
        }
        return clienteRepository.findById(id);
        
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void delete(Long id) {
        if (!clienteRepository.existsById(id)) {
            throw new NaoEncontrado("Cliente nao existente");
        }
        clienteRepository.deleteById(id);
    }
}
