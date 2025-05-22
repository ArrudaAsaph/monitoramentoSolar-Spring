package com.monitorar.monitorarClientes.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_limpeza")
public class Limpeza {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private LocalDate dt_limpeza;

    private float valor;

    private int dificuldade;

    @ManyToOne
    @JoinColumn(name = "id_Cliente")
    private Cliente cliente;

    public Limpeza() {
    }

    public Limpeza(Long id, LocalDate dt_limpeza, float valor, int dificuldade, Cliente cliente) {
        this.id = id;
        this.dt_limpeza = dt_limpeza;
        this.valor = valor;
        this.dificuldade = dificuldade;
        this.cliente = cliente;
    }

    public LocalDate getDt_limpeza() {
        return dt_limpeza;
    }

    public void setDt_limpeza(LocalDate dt_limpeza) {
        this.dt_limpeza = dt_limpeza;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}


