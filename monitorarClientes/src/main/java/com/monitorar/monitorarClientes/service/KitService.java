package com.monitorar.monitorarClientes.service;

import org.springframework.stereotype.Service;

import com.monitorar.monitorarClientes.dto.KitDTO;
import com.monitorar.monitorarClientes.model.Kit;
import com.monitorar.monitorarClientes.repository.KitRepository;

@Service
public class KitService {
    private KitRepository kitRepository;

    public KitService(KitRepository kitRepository) {
        this.kitRepository = kitRepository;
    }
    
    public Kit save(KitDTO dto) {
        if (dto.getQtdModulo() <= 0 || dto.getPotenciaModulo() <= 0) {
            throw new IllegalArgumentException("Quantidade e potência dos módulos devem ser maiores que zero.");
        }

        Kit kit = new Kit();
        kit.setFornecedor(dto.getFornecedor());

        kit.setMarcaInversor(dto.getMarcaInversor());
        kit.setMarcaModulo(dto.getMarcaModulo());

        kit.setQtdInversor(dto.getQtdInversor());
        kit.setQtdModulo(dto.getQtdModulo());

        kit.setPotenciaInversor(dto.getPotenciaInversor());
        kit.setPotenciaModulo(dto.getPotenciaModulo());

        kit.setPotenciaKit(calcularPotenciaKit(dto));

        return kitRepository.save(kit);
    }

    private float calcularPotenciaKit(KitDTO dto) {
        float potencia = ((dto.getPotenciaModulo() * dto.getQtdModulo()) / 100);
        return potencia;
    }


}
