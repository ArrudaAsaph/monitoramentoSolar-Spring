package com.monitorar.monitorarClientes.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monitorar.monitorarClientes.dto.LimpezaDTO;
import com.monitorar.monitorarClientes.model.Limpeza;
import com.monitorar.monitorarClientes.service.LimpezaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/limpezas")
public class LimpezaController {
    private final LimpezaService limpezaService;

    public LimpezaController(LimpezaService limpezaService) {
        this.limpezaService = limpezaService;
    }

    @PostMapping
    public ResponseEntity<Limpeza> criarLimpeza(@RequestBody LimpezaDTO dto) {
        Limpeza limpeza = limpezaService.save(dto);
        return new ResponseEntity<>(limpeza, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<Limpeza>> listarLimpezas() {
        List<Limpeza> limpezas = limpezaService.findAll();
        return ResponseEntity.ok(limpezas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLimpeza(@PathVariable Long id) {
        limpezaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
