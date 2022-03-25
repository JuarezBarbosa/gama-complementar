package com.projetofinal.projetofinal;
import java.util.LinkedList;

public class GerenciaContas {
    private LinkedList<Conta> contas = new LinkedList<Conta>();

    // Constructor
    public GerenciaContas() {
    };

    // Methods
    public int criarContaCorrente(Long numero) {
        for (Conta conta : this.contas) {
            if (conta.getNumero() == numero) {
                System.out.println("\nConta de Número Nº " + numero + " já existe!\n");
                return 0;
            };
        };

        ContaCorrente contaCorrente = new ContaCorrente(numero);

        this.contas.add(contaCorrente);
        return 1;
    };

    public int criarContaEspecial(Long numero, double limite) {
        for (Conta conta : this.contas) {
            if (conta.getNumero() == numero) {
                System.out.println("\nConta de Número Nº " + numero + " já existe!\n");
                return 0;
            };
        };

        ContaEspecial contaEspecial = new ContaEspecial(numero, limite);
        this.contas.add(contaEspecial);
        return 1;
    };

    public int depositar(Long numero, double valor) {
        for (Conta conta : this.contas) {
            if (conta.getNumero() == numero) {
                System.out.println("\n- - - - - - - - - - - - - - - - -");
                System.out.println("EXTRATO - CONTA Nº " + conta.getNumero());
                System.out.println("Depósito: " + valor);
                System.out.println("Saldo anterior: " + conta.getSaldo());
                System.out.println("Saldo atual: " + (conta.getSaldo() + valor));
                System.out.println("- - - - - - - - - - - - - - - - -\n");

                conta.deposita(valor);
                return 1;
            }
        }

        System.out.println("\nConta Nº " + numero + " não encontrada\n");
        return -1;
    };

    public int sacar(Long numero, double valor) {
        int saqueResultado = 0;

        for (Conta conta : this.contas) {
            if (conta.getNumero() == numero) {
                saqueResultado = conta.saca(valor);
                return saqueResultado;
            }
        }

        System.out.println("\nConta Nº " + numero + " não encontrada\n");
        return -1;
    };

    public double pegarSaldo(Long numero) {
        double saldo = 0;
        for (Conta conta : this.contas) {
            if (conta.getNumero() == numero) {
                saldo = conta.getSaldo();

                System.out.println("\n- - - - - - - - - - - - - - - - -");
                System.out.println("Saldo da conta Nº " + numero + ": " + saldo);
                System.out.println("- - - - - - - - - - - - - - - - -\n");

                return saldo;
            }
        }
        
        System.out.println("\nConta Nº " + numero + " não encontrada\n");
        return -1;
    };

    public String listarContas() {
        String listaContas = "";
        for (Conta conta : this.contas) {
            listaContas += conta.toString() + "\n";
        }

        System.out.println(listaContas);
        return listaContas;
    };

    public Conta pegarUltimo() {
        return this.contas.getLast();
    };
}
