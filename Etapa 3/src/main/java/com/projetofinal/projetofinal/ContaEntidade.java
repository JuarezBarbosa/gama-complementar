package com.projetofinal.projetofinal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity()
@Table(name = "conta")
public class ContaEntidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double saldo;
    private Long numero;
    private String tipo;
    private double limite;

    ContaEntidade() {
    }

    ContaEntidade(Long numero, String tipo, double limite) {
        this.numero = numero;
        this.saldo = 0;
        this.tipo = tipo;
        this.limite = limite;
    };

    public double getSaldo() {
        return saldo;
    };

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    };

    public Long getNumero() {
        return numero;
    };

    public void setNumero(Long numero) {
        this.numero = numero;
    };

    public String getTipo() {
        return tipo;
    };

    public void setTipo(String tipo) {
        this.tipo = tipo;
    };

    public double getLimite() {
        return limite;
    };

    public void setLimite(double limite) {
        this.limite = limite;
    };

    public Long getId() {
        return id;
    };

    public void setId(Long id) {
        this.id = id;
    };
}
