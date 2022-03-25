package com.projetofinal.projetofinal;

public class Conta {
    protected Long numero;
    protected double saldo;

    // Constructor
    public Conta(Long numero) {
        this.numero = numero;
        this.saldo = 0;
    };


    // Getters
    public Long getNumero() {
        return numero;
    };

    public double getSaldo() {
        return saldo;
    };

    // Methods
    public int deposita(double valor) {
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("EXTRATO - CONTA Nº " + this.numero);
        System.out.println("Depósito: " + valor);
        System.out.println("Saldo anterior: " + this.saldo);
        System.out.println("Saldo atual: " + (this.saldo + valor));
        System.out.println("- - - - - - - - - - - - - - - - -");

        this.saldo += valor;
        return 1;
    };

    public int saca(double valor) {
        this.saldo -= valor;
        return 1;
    };

    @Override
    public String toString() {
        String json = "{\n";
        json += "\"numero\": " + this.numero + ",\n";
        json += "\"saldo\": " + this.saldo + "\n";
        json += "}";

        return json;
    };
}
