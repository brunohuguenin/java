package Testes.collection.G_searchBinary;

import java.util.Arrays;

public class BuscaBPeloMetodo {
    public static void main(String[] args) {

        // O array deve estar ordenado!!!
        //int[] arrayExemplo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.print("Array não ordenado: ");
        int[] arrayNaoOrdenado = {1,63,52,78,4,25,33,8,9,7};

        for (int i = 0; i < arrayNaoOrdenado.length; i++) {
            System.out.print(arrayNaoOrdenado[i] + " ");
        }
        System.out.println();

        Arrays.sort(arrayNaoOrdenado);

        System.out.print("Array ordenado: ");
        for (int i = 0; i < arrayNaoOrdenado.length; i++) {
            System.out.print(arrayNaoOrdenado[i] + " ");
        }
        System.out.println();



        int resultado = Arrays.binarySearch(arrayNaoOrdenado, 25);

        if (resultado >= 0) {
            System.out.println("O valor foi encontrado na posição " + resultado);
        } else {
            System.out.println("Valor não encontrado!");
        }
    }
}
