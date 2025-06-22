package exercicios.exAula19;

import java.util.Random;

public class ex14 {
    public static void main(String[] args) {

        int[] vet = new int[10];
        Random random = new Random();

        System.out.println("Os elementos do vetor:");
        for (int i=0; i< vet.length; i++){
            vet[i] = random.nextInt(100);
            System.out.print(vet[i] + " ");
        }

        int cont = 0, media = 0, denominador = 0;
        for (int i=0; i< vet.length; i++){
            if (vet[i] % 2 != 0) {
                cont += vet[i];
                denominador++;
                media = cont / denominador;
            }
        }

        System.out.printf("\ncontador: %d, quantidade de elementos ímpares: %d", cont, denominador);

        System.out.println();
        System.out.printf("A média dos valores ímpares do vetor é igual a %d", media);
    }
}
