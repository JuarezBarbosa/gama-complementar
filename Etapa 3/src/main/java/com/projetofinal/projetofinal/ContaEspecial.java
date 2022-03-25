package com.projetofinal.projetofinal;
public class ContaEspecial extends Conta {
    // Attributes
    protected double limite;

    // Constructor
    public ContaEspecial(Long numero, double limite) {
        super(numero);
        this.limite = limite;
    };

    // Methods
    public int saca(double valor) {
        if ((this.saldo + this.limite) < valor) {
            System.out.println("Saldo insuficiente");
            return 0;
        };

        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("EXTRATO - CONTA ESPECIAL Nº " + this.numero);
        System.out.println("Saque: " + valor);
        System.out.println("Saldo anterior: " + super.saldo);
        System.out.println("Saldo atual: " + (super.saldo - valor));
        System.out.println("- - - - - - - - - - - - - - - - -");
        
        super.saldo -= valor;
        return 1;
    };
}
