package com.monitorar.monitorarClientes.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name ="tb_limpeza")
public class Limpeza {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  

    @ManyToOne // Uma Limpeza pertence a um cliente - Um cliente pode ter mais de uma limpeza
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private float valor;

    private int dificuldade;
    @Column(name = "dt_limpeza")
    private LocalDate dtLimpeza;

    public Limpeza() {
    }

    public Limpeza(Long id, Cliente cliente, float valor, int dificuldade, LocalDate dtLimpeza) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.dificuldade = dificuldade;
        this.dtLimpeza = dtLimpeza;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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


    
}
