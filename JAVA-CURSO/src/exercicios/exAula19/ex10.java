package exercicios.exAula19;

import java.util.Random;

public class ex10 {
    public static void main(String[] args) {

        int[] vetA = new int[10];
        int[] vetB = new int[vetA.length];
        Random random = new Random();

        for (int i=0; i< vetA.length; i++){
            vetA[i] = random.nextInt(100);
            vetB[i] = vetA[i] % 2;
        }

        System.out.print("Vetor A: ");
        for (int i=0; i< vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }

        System.out.print("\nVetor b: ");
        for (int i=0; i< vetA.length; i++){
            System.out.print(vetB[i] + " ");
        }
    }
}
