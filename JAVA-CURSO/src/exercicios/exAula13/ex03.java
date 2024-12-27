package exercicios.exAula13;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        //Faça um programa que peça dois números e imprima a soma.

        Scanner valor = new Scanner(System.in);

        System.out.print("Insira o primeiro número da soma: ");
        int num1 = valor.nextInt();

        System.out.print("Agora, insira o segundo número da soma: ");
        int num2 = valor.nextInt();

        int soma = num1 + num2;

        System.out.printf("A soma entre %d e %d é igual a %d.", num1, num2, soma);
    }
}
