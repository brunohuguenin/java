package exercicios.exAula19;

import java.util.Random;

public class ex11 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        Random random = new Random();

        System.out.println("Elementos do vetor: ");
        for (int i=0; i< vetor.length; i++){
            vetor[i] = random.nextInt(100);
            System.out.print(vetor[i] + " ");
        }

        int contador = 0;
        for (int i=0; i< vetor.length; i++){
            if (vetor[i] % 2 == 0) {
                contador++;
            }
        }


        System.out.printf("\nO vetor tem %d números pares\n", contador);

    }

}
