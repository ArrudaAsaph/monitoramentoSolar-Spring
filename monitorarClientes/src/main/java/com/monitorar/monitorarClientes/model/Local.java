package com.monitorar.monitorarClientes.model;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
@Entity
@Table(name = "dt_local")
public class Local {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String estado;
    
    @ElementCollection
    @CollectionTable(name = "irradiancia_local", joinColumns = @JoinColumn(name = "local_id"))
    @Column(name = "irradiancia")
    private List<Float> irradianciasMensais;

    

    public Local() {
    }

    public Local(Long id, String nome, String estado, List<Float> irradianciasMensais) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.irradianciasMensais = irradianciasMensais;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setIrradianciasMensais(List<Float> irradianciasMensais) {
        this.irradianciasMensais = irradianciasMensais;
    }
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEstado() {
        return estado;
    }
    public List<Float> getIrradianciasMensais() {
        return irradianciasMensais;
    }

    
}
