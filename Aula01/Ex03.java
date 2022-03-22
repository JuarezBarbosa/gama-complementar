/*
Escreva um programa que leia um número inteiro digitado pelo usuário e
exiba uma sequência de números de 1 até o valor digitado pelo usuário. 
*/

import java.util.Scanner;

public class Ex03{
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int ultimo;

        System.out.println("Digite o ultimo numero da contagem: ");
        ultimo = tec.nextInt();

        for (int n=1; n <= ultimo; n++){
            System.out.println(n + " ");
        }

        tec.close();
    }
}