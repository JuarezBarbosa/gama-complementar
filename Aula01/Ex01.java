/*
Faça um programa que leia duas notas de um aluno,
calcule e mostre a média aritmética do aluno.
*/

import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double primeiranota, segundanota, media;

        System.out.println("Digite a primeira nota:");
        primeiranota = tec.nextDouble();
        System.out.println("Digite a segunda nota:");
        segundanota = tec.nextDouble();

        media = (primeiranota + segundanota) / 2;
        System.out.println("Média = " + media);
        tec.close();
    }
}
