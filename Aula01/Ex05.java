/*
Escreva um programa que leia vários números inteiros digitados
pelo usuário, até que o usuário digite zero. O zero termina o
programa e exibe a soma de todos os valores digitados.
*/

import java.util.Scanner;

public class Ex05{
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int n, soma;

        n = 1;
        soma = 0;

        while(n != 0){
            System.out.println("Digite um número para soma ('0' para efetuar a soma): ");
            n = tec.nextInt();
            soma = soma + n;
        }
        System.out.println("Soma = " + soma);

        tec.close();
    }
}