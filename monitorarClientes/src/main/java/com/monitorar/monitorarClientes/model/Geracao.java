package com.monitorar.monitorarClientes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_geracao")
public class Geracao {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    private int ano;

    private int jan;

    private int fev;

    private int mar;

    private int abr;

    private int mai;

    private int jun;

    private int jul;

    private int ago;

    private int set;

    private int out;

    private int nov;

    private int dez;

    public Geracao() {
    }

    public Geracao(Long id, Cliente cliente, int ano, int jan, int fev, int mar, int abr, int mai, int jun, int jul,
            int ago, int set, int out, int nov, int dez) {
        this.id = id;
        this.cliente = cliente;
        this.ano = ano;
        this.jan = jan;
        this.fev = fev;
        this.mar = mar;
        this.abr = abr;
        this.mai = mai;
        this.jun = jun;
        this.jul = jul;
        this.ago = ago;
        this.set = set;
        this.out = out;
        this.nov = nov;
        this.dez = dez;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getJan() {
        return jan;
    }

    public void setJan(int jan) {
        this.jan = jan;
    }

    public int getFev() {
        return fev;
    }

    public void setFev(int fev) {
        this.fev = fev;
    }

    public int getMar() {
        return mar;
    }

    public void setMar(int mar) {
        this.mar = mar;
    }

    public int getAbr() {
        return abr;
    }

    public void setAbr(int abr) {
        this.abr = abr;
    }

    public int getMai() {
        return mai;
    }

    public void setMai(int mai) {
        this.mai = mai;
    }

    public int getJun() {
        return jun;
    }

    public void setJun(int jun) {
        this.jun = jun;
    }

    public int getJul() {
        return jul;
    }

    public void setJul(int jul) {
        this.jul = jul;
    }

    public int getAgo() {
        return ago;
    }

    public void setAgo(int ago) {
        this.ago = ago;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public int getNov() {
        return nov;
    }

    public void setNov(int nov) {
        this.nov = nov;
    }

    public int getDez() {
        return dez;
    }

    public void setDez(int dez) {
        this.dez = dez;
    }

    
}
