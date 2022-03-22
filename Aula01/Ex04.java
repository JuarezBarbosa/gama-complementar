/*
Escreva um programa que exiba a tabuada do número digitado pelo usuário. 
*/

import java.util.Scanner;

public class Ex04{
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int tabuada, cont;

        System.out.println("Digite o numero da tabuada desejada: ");
        tabuada = tec.nextInt();

        cont = 0;
        while ( cont <= 10 ){
            System.out.println(tabuada + " x " + cont + " = " + (cont*tabuada));
            cont++;
        }

        tec.close();
    }
}