package com.monitorar.monitorarClientes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Uma entidade
@Table(name = "tb_cliente") // Essa entidade irá se tornar uma tabela
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gerar os identificadores sequenciais
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    public Cliente() {
    }
    public Cliente(Long id, String nome, String email, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
}
