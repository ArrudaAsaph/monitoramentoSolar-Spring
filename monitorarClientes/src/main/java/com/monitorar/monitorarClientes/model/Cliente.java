package com.monitorar.monitorarClientes.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O endereço é obrigatório")
    private String endereco;

    @NotBlank(message = "O telefone é obrigatório")
    private String telefone;

    @Email(message = "Email inválido")
    @NotBlank(message = "O email é obrigatório")
    private String email;
    private LocalDateTime dt_instalacao;
    
    public Cliente() {
    }
    
    public Cliente(Long id, String nome, String endereco, String telefone, String email, LocalDateTime dt_instalacao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
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
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
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
