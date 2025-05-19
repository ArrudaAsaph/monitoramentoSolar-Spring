package com.monitorar.monitorarClientes.model;


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
    
    private float consumoMed;

    private float potSistema;

    @OneToOne
    @JoinColumn(name = "kit_id")
    private Kit kit;

    public Dimensionamento() {
    }

    public Dimensionamento(Long id, Cliente cliente, Local local, float consumoMed, float potSistema, Kit kit) {
        this.id = id;
        this.cliente = cliente;
        this.local = local;
        this.consumoMed = consumoMed;
        this.potSistema = potSistema;
        this.kit = kit;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setConsumoMed(float consumoMed) {
        this.consumoMed = consumoMed;
    }

    public void setSistema(float potSistema) {
        this.potSistema = potSistema;
    }

    public void setKit(Kit kit) {
        this.kit = kit;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Local getLocal() {
        return local;
    }

    public float getConsumoMed() {
        return consumoMed;
    }

    public float getSsistema() {
        return potSistema;
    }

    public Kit getKit() {
        return kit;
    }

    

}
