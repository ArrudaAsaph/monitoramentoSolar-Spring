package com.monitorar.monitorarClientes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monitorar.monitorarClientes.model.Local;
import com.monitorar.monitorarClientes.service.LocalService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/local")
public class LocalController {
    private final LocalService localService;

    public LocalController(LocalService localService) {
        this.localService = localService;
    }

    @GetMapping
    public List<Local> listarLocal() {
        return localService.listarLocal();
    }

    @PostMapping
    public Local salvarLocal(@RequestBody Local local) {
        return localService.save(local);
    }

}
