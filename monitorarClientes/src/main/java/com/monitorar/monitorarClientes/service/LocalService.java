package com.monitorar.monitorarClientes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exception.NaoEncontrado;
import com.monitorar.monitorarClientes.model.Local;
import com.monitorar.monitorarClientes.repository.LocalRepository;

@Service
public class LocalService {
    private final LocalRepository localRepository;

    public LocalService(LocalRepository localRepository) {
        this.localRepository = localRepository;
    }

    public List<Local> listarLocal() {
        return localRepository.findAll();
    }

    public Optional<Local> buscarPorId(Long id) {
        if (!localRepository.existsById(id)) {
            throw new NaoEncontrado("Local não encontrado");
        }
        return localRepository.findById(id);
    }

    public Local save(Local local) {
        return localRepository.save(local);
    }

    public void delete(Long id) {
        if (!localRepository.existsById(id)) {
            throw new NaoEncontrado("Local não existente");
        }
        localRepository.deleteById(id);
    }
}
