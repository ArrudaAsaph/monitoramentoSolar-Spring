package com.monitorar.monitorarClientes.dto;

import java.time.LocalDate;

public class LimpezaDTO {
    private Long clienteId;
    private LocalDate data;
    private String observacoes;

    public LimpezaDTO() {
    }

    public LimpezaDTO(Long clienteId, LocalDate data, String observacoes) {
        this.clienteId = clienteId;
        this.data = data;
        this.observacoes = observacoes;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getObservacoes() {
        return observacoes;
    }
    
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
}
