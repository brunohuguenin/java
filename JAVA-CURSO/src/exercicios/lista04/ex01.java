package exercicios.lista04;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        // Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho
        // e com os "mesmo" elementos do vetor A, ou seja, B[i] = A[i]

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
        }

        int[] vetorB = new int[5];
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }

        // Exibição dos vetores A e B
        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B (cópia de A):");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        scan.close();
    }
}
