package exeDio;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        // 2 - Faça um algoritmo para receber um número
        // qualquer e imprimir na tela se o número é par ou ímpar,
        // positivo ou negativo.

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um valor: ");
        int valor = scan.nextInt();

        if(valor == 0) {
            System.out.printf("O número 0 é PAR, mas não é considerado positivo ou negativo");
        } else if (valor % 2 == 0 && valor > 0) {
            System.out.printf("O número %d é PAR e POSITIVO", valor);
        } else if (valor % 2 == 0 && valor < 0) {
            System.out.printf("O número %d é PAR e NEGATIVO", valor);
        } else if (valor % 2 != 0 && valor > 0) {
            System.out.printf("O número %d é ÍMPAR e POSITIVO", valor);
        }  else if (valor % 2 != 0 && valor < 0) {
            System.out.printf("O número %d é ÍMPAR e NEGATIVO", valor);
        }
    }
}
