/*
...Entretanto, o valor máximo da prestação não poderá ultrapassar
30% do salário bruto.
Faça um programa que leia o salário bruto e o valor da prestação
e informe se o empréstimo pode ou não ser concedido.
*/

import java.util.Scanner;

public class Ex02{
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double salario, prestacao, valorMax;

        System.out.println("Digite o valor do salario:");
        salario = tec.nextDouble();
        System.out.println("Digite o valor das prestações:");
        prestacao = tec.nextDouble();

        valorMax = salario / (100/30);

        if (prestacao <= valorMax) {
            System.out.println("Empréstimo pode ser concedido");
        } else {
            System.out.println("Empréstimo não pode ser concedido");
            tec.close();
        }
    }
}