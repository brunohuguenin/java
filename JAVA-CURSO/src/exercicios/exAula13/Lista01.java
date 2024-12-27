package exercicios.exAula13;

import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args) {

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
