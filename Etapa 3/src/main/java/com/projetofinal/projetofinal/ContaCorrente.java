package com.projetofinal.projetofinal;
public class ContaCorrente extends Conta {

    // Constructor
    public ContaCorrente(Long numero) {
        super(numero);
    };

    // Methods
    public int saca(double valor) {
        if ((super.saldo - valor) < 0) {
            System.out.println("Saldo insuficiente");
            return 0;
        };

        System.out.println("Saldo atual: " + (super.saldo - valor));
        super.saldo -= valor;
        return 1;
    };
}
