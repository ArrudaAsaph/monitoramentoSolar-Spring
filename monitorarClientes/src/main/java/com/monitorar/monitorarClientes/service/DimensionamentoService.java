package com.monitorar.monitorarClientes.service;

import org.springframework.stereotype.Service;

import com.exception.NaoEncontrado;
import com.monitorar.monitorarClientes.dto.DimensionamentoDTO;
import com.monitorar.monitorarClientes.model.Cliente;
import com.monitorar.monitorarClientes.model.Dimensionamento;
import com.monitorar.monitorarClientes.model.Kit;
import com.monitorar.monitorarClientes.model.Local;
import com.monitorar.monitorarClientes.repository.ClienteRepository;
import com.monitorar.monitorarClientes.repository.DimensionamentoRepository;
import com.monitorar.monitorarClientes.repository.KitRepository;
import com.monitorar.monitorarClientes.repository.LocalRepository;

@Service
public class DimensionamentoService {

    private DimensionamentoRepository dimensionamentoRepository;

    private KitRepository kitRepository;

    private ClienteRepository clienteRepository;

    private LocalRepository localRepository;

    public Dimensionamento save(DimensionamentoDTO dto) {
        Cliente cliente = clienteRepository.findById(dto.getClienteId())
            .orElseThrow(() -> new NaoEncontrado("Cliente nao encontrado"));
        
        Local local = localRepository.findById(dto.getLocalId())
            .orElseThrow(() -> new NaoEncontrado("Local não encontrado"));

        Kit kit = kitRepository.findById(dto.getKitId())
            .orElseThrow(() -> new NaoEncontrado("Kit não encontrado"));
        

        Dimensionamento dimensionamento = new Dimensionamento();
        
        dimensionamento.setCliente(cliente);
        dimensionamento.setLocal(local);
        dimensionamento.setKit(kit);
        dimensionamento.setConsumoMed(dto.getConsumoMed());
        dimensionamento.setDt_instalacao(dto.getDtInstalacao());

        return dimensionamentoRepository.save(dimensionamento);
    }
}

