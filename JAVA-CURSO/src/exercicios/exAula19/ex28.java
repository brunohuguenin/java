package exercicios.exAula19;

import java.util.Random;

public class ex28 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.printf("O elementos do vetor A: ");
        for (int i=0; i< vetorA.length; i++) {
            vetorA[i] = random.nextInt(10);
            System.out.printf("%d; ", vetorA[i]);
        }
        System.out.println();

        int j = 0;
        for (int i = vetorA.length - 1; i>=0; i--) {
            vetorB[j] = vetorA[i];
            j++;
        }

        System.out.printf("O elementos do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("%d; ", vetorB[i]);
        }
    }
}
