package exercicios.exAula19;

import java.util.Random;

public class ex04 {
    public static void main(String[] args) {

    int[] vetA = {4,16,9,25,49,64,81,121,144,163,225,576,625,729,900,};
    int[] vetB = new int[vetA.length];
    Random random = new Random();

    for (int i = 0; i < vetA.length; i++) {
        vetB[i] = (int) Math.sqrt(vetA[i]);
    }

    System.out.print("Vetor A: ");
    for (int i=0; i< vetA.length; i++){
        System.out.print(vetA[i] + "  ");
    }

    System.out.print("\nVetor b: ");
    for (int i=0; i< vetA.length; i++){
        System.out.print(vetB[i] + "   ");
    }

    }
}
