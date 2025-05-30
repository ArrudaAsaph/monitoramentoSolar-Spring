package com.monitorar.monitorarClientes.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class KitDTO {
    private Long id;

    @NotBlank(message = "Fornecedor é obrigatório!")
    private String fornecedor;

    @Positive(message = "Potência do sistema deve ser maior que zero.")
    private float potenciaKit;

    @NotBlank(message = "A marca do inversor é obrigatória!")
    private String marcaInversor;

    @Positive(message = "A potência do inversor deve ser maior que zero.")
    private float potenciaInversor;

    @Positive(message = "A quantidade de inversores deve ser maior que zero.")
    private int qtdInversor;

    @NotBlank(message = "A marca dos módulos é obrigatória!")
    private String marcaModulo;

    @Positive(message = "A potência dos módulos deve ser maior que zero.")
    private float potenciaModulo;

    @Positive(message = "A quantidade dos módulos deve ser maior que zero.")
    private int qtdModulo;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public float getPotenciaKit() {
        return potenciaKit;
    }
    public void setPotenciaKit(float potenciaKit) {
        this.potenciaKit = potenciaKit;
    }

    public String getMarcaInversor() {
        return marcaInversor;
    }
    public void setMarcaInversor(String marcaInversor) {
        this.marcaInversor = marcaInversor;
    }

    public float getPotenciaInversor() {
        return potenciaInversor;
    }
    public void setPotenciaInversor(float potenciaInversor) {
        this.potenciaInversor = potenciaInversor;
    }

    public int getQtdInversor() {
        return qtdInversor;
    }
    public void setQtdInversor(int qtdInversor) {
        this.qtdInversor = qtdInversor;
    }

    public String getMarcaModulo() {
        return marcaModulo;
    }
    public void setMarcaModulo(String marcaModulo) {
        this.marcaModulo = marcaModulo;
    }

    public float getPotenciaModulo() {
        return potenciaModulo;
    }
    public void setPotenciaModulo(float potenciaModulo) {
        this.potenciaModulo = potenciaModulo;
    }

    public int getQtdModulo() {
        return qtdModulo;
    }
    public void setQtdModulo(int qtdModulo) {
        this.qtdModulo = qtdModulo;
    }
}
