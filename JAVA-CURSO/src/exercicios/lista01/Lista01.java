package exercicios.lista01;

import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args) {
        /* Faça um programa que mostre a mensagem “Aló Mundo” na tela.

        System.out.println("Olá, Mundo!"); */

        // ----------------------------------------------------------------


        /* Faça um programa que peça um número e então mostre a mensagem “O número informado foi: x”

        Scanner num = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = num.nextInt();

        System.out.println("O número inserido foi: " + numero); */

        // ----------------------------------------------------------------

        /* Faça um programa que peça dois números e imprima a soma.

        Scanner valor = new Scanner(System.in);

        System.out.print("Insira o primeiro número da soma: ");
        int num1 = valor.nextInt();

        System.out.print("Agora, insira o segundo número da soma: ");
        int num2 = valor.nextInt();

        int soma = num1 + num2;

        System.out.printf("A soma entre %d e %d é igual a %d.", num1, num2, soma); */

        // ------------------------------------------------------------------


        // Faça um programa que peça quatro notas bimestrais e mostre a média
        Scanner nota = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        float nota1 = nota.nextFloat();

        System.out.print("Insira a segunda nota: ");
        float nota2 = nota.nextFloat();

        System.out.print("Insira a terceira nota: ");
        float nota3 = nota.nextFloat();

        System.out.print("Insira a quarta nota: ");
        float nota4 = nota.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A média das nostas nesse bimestre foi de %.2f.", media);

    }
}
