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

    private int potenciaModulos;
    private	int quantidadeModulos;
    private String marcaModulo;

    private float potenciaInversor;
    private int quantidadeInversor;
    private String marcaInversor;

    private String descricao;

    

    public Kit() {
    }

    public Kit(Long id, int potenciaModulos, int quantidadeModulos, String marcaModulo, float potenciaInversor, int quantidadeInversor,
            String marcaInversor, String descricao) {
        this.id = id;
        this.potenciaModulos = potenciaModulos;
        this.quantidadeModulos = quantidadeModulos;
        this.marcaModulo = marcaModulo;
        this.potenciaInversor = potenciaInversor;
        this.quantidadeInversor = quantidadeInversor;
        this.marcaInversor = marcaInversor;
        this.descricao = descricao;
    }

    public int getPotenciaModulos() {
        return potenciaModulos;
    }

    public void setPotenciaModulos(int potenciaModulos) {
        this.potenciaModulos = potenciaModulos;
    }

    public int getQuantidadeModulos() {
        return quantidadeModulos;
    }

    public void setQuantidadeModulos(int quantidadeModulos) {
        this.quantidadeModulos = quantidadeModulos;
    }

    public String getMarcaModulo() {
        return marcaModulo;
    }

    public void setMarcaModulo(String marcaModulo) {
        this.marcaModulo = marcaModulo;
    }

    public float getenciaPotInversor() {
        return potenciaInversor;
    }

    public void setenciaPotInversor(float potenciaInversor) {
        this.potenciaInversor = potenciaInversor;
    }

    public int getQuantidadeInversor() {
        return quantidadeInversor;
    }

    public void setQuantidadeInversor(int quantidadeInversor) {
        this.quantidadeInversor = quantidadeInversor;
    }

    public String getMarcaInversor() {
        return marcaInversor;
    }

    public void setMarcaInversor(String marcaInversor) {
        this.marcaInversor = marcaInversor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
