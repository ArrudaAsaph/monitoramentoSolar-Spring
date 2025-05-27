package com.monitorar.monitorarClientes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exception.NaoEncontrado;
import com.monitorar.monitorarClientes.dto.ClienteDTO;
import com.monitorar.monitorarClientes.model.Cliente;
import com.monitorar.monitorarClientes.repository.ClienteRepository;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;


    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente save(ClienteDTO dto) {
        if (clienteRepository.existsByEmail(dto.getEmail())){
            throw new IllegalArgumentException("Já existe um cliente com este email.");
        }
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        cliente.setEndereco(dto.getEndereco());
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente findById(Long id) {
        return clienteRepository.findById(id)
            .orElseThrow(() -> new NaoEncontrado("Cliente não Encontrado!"));
    }

    public Cliente update(Long id, ClienteDTO dto) {
        Cliente cliente = findById(id);

        if (!cliente.getEmail().equals(dto.getEmail()) && clienteRepository.existsByEmail(dto.getEmail())) {
            throw new IllegalArgumentException("Já existe um cliente com este email.");
            
        }
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setEndereco(dto.getEndereco());
        cliente.setTelefone(dto.getTelefone());

        return clienteRepository.save(cliente);
    }

    public void delete(Long id) {
        Cliente cliente = findById(id);
        clienteRepository.delete(cliente);
    }

}
