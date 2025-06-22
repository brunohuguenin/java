package exercicios.exAula19;

import java.util.Random;

public class ex12 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        Random random = new Random();

        System.out.println("Elementos do vetor: ");
        for (int i=0; i< vetor.length; i++){
            vetor[i] = random.nextInt(50);
            System.out.print(vetor[i] + " ");
        }

        int contador = 0;
        for (int i=0; i< vetor.length; i++){
            contador += vetor[i];
        }

        System.out.println();
        System.out.printf("O soma dos elementos do vetor é igual a %d\n", contador);
    }
}
