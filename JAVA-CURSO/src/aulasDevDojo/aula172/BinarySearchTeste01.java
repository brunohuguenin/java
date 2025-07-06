package aulasDevDojo.aula172;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(14);
        numeros.add(10);
        numeros.add(243);
        numeros.add(39);

        // - (ponto de inserção) -1
        // index 0,1,2,3
        // value 2,0,4,3

        Collections.sort(numeros);  // a List precisa estar ordenada!!

        System.out.println(Collections.binarySearch(numeros, 243)); // binarySearch retorna a posição do valor

        System.out.println("---------------------" +
                "");
        for (Integer numero: numeros) {
            System.out.println(numero);
        }

    }
}
