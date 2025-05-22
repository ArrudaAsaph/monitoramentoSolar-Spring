package com.monitorar.monitorarClientes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_kitSolar")
public class Kit {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fornecedor;

    private float potenciaSistema;

    private String marcaInversor;

    private float potenciaInversor;

    private int quantidadeInversor;

    private String marcaModulo;

    private float potenciaModulo;

    private int quantidadeModulo;

    public Kit() {
    }

    public Kit(Long id, String fornecedor, float potenciaSistema, String marcaInversor, float potenciaInversor,
            int quantidadeInversor, String marcaModulo, float potenciaModulo, int quantidadeModulo) {
        this.id = id;
        this.fornecedor = fornecedor;
        this.potenciaSistema = potenciaSistema;
        this.marcaInversor = marcaInversor;
        this.potenciaInversor = potenciaInversor;
        this.quantidadeInversor = quantidadeInversor;
        this.marcaModulo = marcaModulo;
        this.potenciaModulo = potenciaModulo;
        this.quantidadeModulo = quantidadeModulo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public float getPotenciaSistema() {
        return potenciaSistema;
    }

    public void setPotenciaSistema(float potenciaSistema) {
        this.potenciaSistema = potenciaSistema;
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

    public int getQuantidadeInversor() {
        return quantidadeInversor;
    }

    public void setQuantidadeInversor(int quantidadeInversor) {
        this.quantidadeInversor = quantidadeInversor;
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

    public int getQuantidadeModulo() {
        return quantidadeModulo;
    }

    public void setQuantidadeModulo(int quantidadeModulo) {
        this.quantidadeModulo = quantidadeModulo;
    }

    

}