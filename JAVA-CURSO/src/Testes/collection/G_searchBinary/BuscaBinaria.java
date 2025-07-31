package Testes.collection.G_searchBinary;

import java.util.Arrays;

public class BuscaBinaria {

    public static void main(String[] args) {

        // o array deve estar ordenado!!!
        //int[] arrayOrdenado = {1,2,3,4,5,6,7,8,9,10};


        // array não ordenado
        int[] arrayNaoOrdernado = {4,8,5,1,9,3,10,2,7,6};
        Arrays.sort(arrayNaoOrdernado);


        int resultado = buscaBinaria(arrayNaoOrdernado, 2);

        if (resultado >= 0) {
            System.out.println("Valor encontado na posição " + resultado);
        } else {
            System.out.println("Valor não encontrado");
        }

    }

    public static int buscaBinaria(int[] array, int valor) {
        int inicioArray = 0;
        int finalArray = array.length -1;

        while (inicioArray <= finalArray) {
            int meioDoArray = (inicioArray + finalArray) / 2;

            if (array[meioDoArray] == valor) {
                return meioDoArray; // valor encontrado!
            } else if (array[meioDoArray] < valor) {
                inicioArray = meioDoArray + 1;
            } else {
                finalArray = meioDoArray - 1;
            }
        }

        return -1; // valor não encontrado
    }

}
