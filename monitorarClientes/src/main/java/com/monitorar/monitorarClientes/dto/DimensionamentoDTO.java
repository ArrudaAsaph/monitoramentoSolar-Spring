package com.monitorar.monitorarClientes.dto;

import java.time.LocalDate;

public class DimensionamentoDTO {
    private Long clienteId;
    private Long localId;
    private Long kitId;
    private float consumoMed;
    private LocalDate dtInstalacao;
    
    public DimensionamentoDTO() {
    }

    public DimensionamentoDTO(Long clienteId, Long localId, Long kitId, float consumoMed, LocalDate dtInstalacao) {
        this.clienteId = clienteId;
        this.localId = localId;
        this.kitId = kitId;
        this.consumoMed = consumoMed;
        this.dtInstalacao = dtInstalacao;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getLocalId() {
        return localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public Long getKitId() {
        return kitId;
    }

    public void setKitId(Long kitId) {
        this.kitId = kitId;
    }

    public float getConsumoMed() {
        return consumoMed;
    }

    public void setConsumoMed(float consumoMed) {
        this.consumoMed = consumoMed;
    }

    public LocalDate getDtInstalacao() {
        return dtInstalacao;
    }

    public void setDtInstalacao(LocalDate dtInstalacao) {
        this.dtInstalacao = dtInstalacao;
    }

    
}

