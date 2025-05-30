package com.monitorar.monitorarClientes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_kit")
public class Kit {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String fornecedor;
    private float potenciaKit;
    private String marcaInversor;
    private float potenciaInversor;
    private int qtdInversor;

    private String marcaModulo;
    private float potenciaModulo;
    private int qtdModulo;
    


    public Kit(Long id, String fornecedor, float potenciaKit, String marcaInversor, float potenciaInversor,
            int qtdInversor, String marcaModulo, float potenciaModulo, int qtdModulo) {
        this.id = id;
        this.fornecedor = fornecedor;
        this.potenciaKit = potenciaKit;
        this.marcaInversor = marcaInversor;
        this.potenciaInversor = potenciaInversor;
        this.qtdInversor = qtdInversor;
        this.marcaModulo = marcaModulo;
        this.potenciaModulo = potenciaModulo;
        this.qtdModulo = qtdModulo;
    }
    public Kit() {
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
