package com.monitorar.monitorarClientes.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class ClienteDTO {
    
    @NotBlank(message = "Nome é obrigátorio!") // nao pode ser null
    private String nome;

    @Email(message = "Endereço de email inválido!") // valida se é um email
    @NotBlank(message = "Email é obrigatório!")
    private String email;

    @Pattern(regexp = "\\d{11}", message = "O telefone deve conter 11 dígitos numéricos!") // verifica se tem 11 digitos
    @NotBlank(message = "Telefone é obrigatório!")
    private String telefone;

    @NotBlank(message = "Endereço é obrigatório!")
    private String endereco;
 
    public ClienteDTO() {
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
