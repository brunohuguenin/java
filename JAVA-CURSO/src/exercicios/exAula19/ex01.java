package exercicios.exAula19;

import java.util.Arrays;

public class ex01 {
    public static void main(String[] args) {

        int vetorA[] = {10, 36, 78, 25, 17};
        int vetorB[] = Arrays.copyOf(vetorA, vetorA.length);

        for (int i=0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }


//        int vetorB[] = new int[vetorA.length];
//
//        for (int i=0; i < vetorA.length; i++) {
//            vetorB[i] = vetorA[i];
//        }
//
//        System.out.print("Vetor A: " );
//        for (int i = 0; i < vetorA.length; i++) {
//            System.out.print(vetorA[i] + " ");
//
//        }
//
//        System.out.print("\nVetor B: " );
//        for (int i = 0; i < vetorB.length; i++) {
//            System.out.print(vetorB[i] + " ");
//        }
    }
}
