package aulasDevDojo.aula1723;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversãoTeste01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(4);
        numeros.add(9);
        numeros.add(7);

        Integer[] ListToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(ListToArray));

        System.out.println("-----------------------------------");



        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 4;
        numerosArray[1] = 9;
        numerosArray[2] = 7;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("-----------------------------------");


        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        System.out.println("-----------------------------------");


        List<Integer> addNumberInLine = List.of(1, 2, 36, 8, 4, 6, 9);
        System.out.println(addNumberInLine);


    }
}
