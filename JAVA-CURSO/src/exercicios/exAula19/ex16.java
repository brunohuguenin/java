package exercicios.exAula19;

import java.util.Random;

public class ex16 {
    public static void main(String[] args) {
        int[] vetor  = new int[10];
        Random random = new Random();

        int denomidador=0, somaMenor15=0, quantIgual15=0, somaMaior15=0;
        double mediaEleMaior15=0;

        System.out.print("Os elementos do vetor: ");
        for (int i=0; i< vetor.length; i++){
            vetor[i] = random.nextInt(30);
            System.out.print(vetor[i] + " ");

            if (vetor[i] < 15) somaMenor15 += vetor[i];

            if (vetor[i] == 15) quantIgual15++;

            if (vetor[i] > 15) {
                somaMaior15 += vetor[i];
                denomidador++;
                mediaEleMaior15 = somaMaior15 / denomidador;
            }
        }
        System.out.println();

        System.out.printf("A soma dos elementos do vetor inferiores a 15: %d", somaMenor15);
        System.out.printf("\nA quantidade dos elementos do vetor iguais a 15: %d", quantIgual15);
        System.out.printf("\nA média dos elementos do vetor superiores a 15: %.2f", mediaEleMaior15);

    }
}
