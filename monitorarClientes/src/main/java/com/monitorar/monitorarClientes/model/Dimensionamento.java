package com.monitorar.monitorarClientes.model;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_dimensionamento")
public class Dimensionamento {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private Local local;
    
    @OneToOne
    @JoinColumn(name = "kit_id")
    private Kit kit;

    private float consumoMed;

    private LocalDate dt_instalacao;

    public Dimensionamento() {
    }

    public Dimensionamento(Long id, Cliente cliente, Local local, Kit kit, float consumoMed, LocalDate dt_instalacao) {
        this.id = id;
        this.cliente = cliente;
        this.local = local;
        this.kit = kit;
        this.consumoMed = consumoMed;
        this.dt_instalacao = dt_instalacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Kit getKit() {
        return kit;
    }

    public void setKit(Kit kit) {
        this.kit = kit;
    }

    public float getConsumoMed() {
        return consumoMed;
    }

    public void setConsumoMed(float consumoMed) {
        this.consumoMed = consumoMed;
    }

    public LocalDate getDt_instalacao() {
        return dt_instalacao;
    }

    public void setDt_instalacao(LocalDate dt_instalacao) {
        this.dt_instalacao = dt_instalacao;
    }



}
