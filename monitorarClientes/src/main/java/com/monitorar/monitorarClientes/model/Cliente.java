package com.monitorar.monitorarClientes.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDateTime dt_instalacao;
    
    public Cliente() {
    }
    
    public Cliente(Long id, String nome, String endereco, String telefone, LocalDateTime dt_instalacao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dt_instalacao = dt_instalacao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setDt_instalacao(LocalDateTime dt_instalacao) {
        this.dt_instalacao = dt_instalacao;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public LocalDateTime getDt_instalacao() {
        return dt_instalacao;
    }
}
