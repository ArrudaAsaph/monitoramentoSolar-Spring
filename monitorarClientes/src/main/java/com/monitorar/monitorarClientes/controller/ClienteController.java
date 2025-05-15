package com.monitorar.monitorarClientes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monitorar.monitorarClientes.model.Cliente;
import com.monitorar.monitorarClientes.service.ClienteService;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listarCliente() {
        return clienteService.listarCliente();
    }

    @PostMapping
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }
    
    

}
