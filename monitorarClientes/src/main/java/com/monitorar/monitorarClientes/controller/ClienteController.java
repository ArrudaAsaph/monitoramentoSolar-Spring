package com.monitorar.monitorarClientes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monitorar.monitorarClientes.dto.ClienteDTO;
import com.monitorar.monitorarClientes.model.Cliente;
import com.monitorar.monitorarClientes.service.ClienteService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody ClienteDTO dto) {
        Cliente cliente = clienteService.save(dto);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarCliente() {
        List<Cliente> clientes = clienteService.findAll();
        return ResponseEntity.ok(clientes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Long id, @RequestBody ClienteDTO dto) {
        Cliente clienteAtualizado = clienteService.update(id, dto);
        return ResponseEntity.ok(clienteAtualizado);
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {
        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }

    
}
