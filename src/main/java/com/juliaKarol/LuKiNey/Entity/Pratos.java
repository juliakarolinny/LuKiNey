package com.juliaKarol.LuKiNey.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pratos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Prato ñomeP;
    private double valor;
    private int tempoPreparo;
    private String descricao;
    private String ingredientes;
    private int estoque;

    public Pratos() {}

    public Pratos(Prato ñomeP, double valor, int tempoPreparo,String descricao, String ingredientes, int estoque) {
        this.ñomeP = ñomeP;
        this.valor = valor;
        this.tempoPreparo = tempoPreparo;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
        this.estoque = estoque;
    }
    public Pratos(int id, Prato ñomeP, double valor, int tempoPreparo, String descricao, String ingredientes, int estoque) {
        this.id = id;
        this.ñomeP = ñomeP;
        this.valor = valor;
        this.tempoPreparo = tempoPreparo;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Prato getÑomeP() {
        return ñomeP;
    }

    public void setÑomeP(Prato ñomeP) {
        this.ñomeP = ñomeP;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
