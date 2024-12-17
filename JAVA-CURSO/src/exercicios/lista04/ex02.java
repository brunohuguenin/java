package exercicios.lista04;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetA = new int[8];
        System.out.println("Digite os oitos elementos do vetor A: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Vet A["+ i +"] = ");
            vetA[i] = scan.nextInt();
        }

        int[] vetB = new int[8];
        for (int i = 0; i < vetA.length; i++) {
            vetB[i] = vetA[i] * 2;
        }

        System.out.println("Os elementos do Vetor A:");
        for (int i=0; i < vetA.length; i++) {
            System.out.println(vetA[i]);
        }
        System.out.println();

        System.out.println("Os elementos do Vetor B:");
        for (int i=0; i < vetA.length; i++) {
            System.out.println(vetB[i]);
        }

        scan.close();

    }
}
