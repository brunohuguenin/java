package exeDio;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        // 1 - Faça um algoritmo que leia os valores de A, B, C
        // e em seguida imprima na tela a soma entre A e B
        // é mostre se a soma é menor que C.

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor: ");
        int valorA = scan.nextInt();

        System.out.println("Entre com o segundo valor: ");
        int valorB = scan.nextInt();

        System.out.println("Entre com o terceiro valor: ");
        int valorC = scan.nextInt();

        int somaAB = valorA + valorB;

        if (somaAB < valorC) {
            System.out.printf("A soma entre %d e %d é igual a %d é menor que o 3º valor %d", valorA, valorB, somaAB, valorC);
        } else {
            System.out.printf("A soma entre %d e %d é igual a %d é mair que o 3º valor %d", valorA, valorB, somaAB, valorC);

        }

    }
}
