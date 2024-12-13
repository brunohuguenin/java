package exercicios.lista02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        // Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

        Scanner valor = new Scanner(System.in);
        System.out.print("Insira um número: ");
        double num = valor.nextDouble();

        if (num > 0) {
            System.out.println("O número inserido é positivo");
        } else if (num == 0) {
            System.out.println("O número inserido é o zero");
        } else {
            System.out.println("O número inserido é negativo");
        }

    }
}
