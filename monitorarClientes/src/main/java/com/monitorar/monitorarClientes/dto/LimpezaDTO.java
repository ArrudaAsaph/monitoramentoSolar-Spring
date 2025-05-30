package com.monitorar.monitorarClientes.dto;

import java.time.LocalDate;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class LimpezaDTO {
    
    @NotBlank(message = "O valor da limpeza é obrigatório!")
    @Positive(message = "O valor da limpeza deve ser positivo@")
    private float valor;

    @NotBlank(message = "O dificuldade da limpeza é obrigatório!")
    private int dificuldade;

    @NotBlank(message = "A data da limpeza é obrigatório!")
    private LocalDate dtLimpeza;

    @NotBlank(message = "O ID do cliente é obrigatório!")
    private Long clienteId;

    public LimpezaDTO() {
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public LocalDate getDtLimpeza() {
        return dtLimpeza;
    }

    public void setDtLimpeza(LocalDate dtLimpeza) {
        this.dtLimpeza = dtLimpeza;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    
}
