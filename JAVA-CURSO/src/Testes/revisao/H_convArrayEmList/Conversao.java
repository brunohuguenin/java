package Testes.revisao.H_convArrayEmList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversao {
    public static void main(String[] args) {

        System.out.println("Convertendo uma Lista em Array e vice versa");
        List<String> nomes = Arrays.asList("Tobi", "Kimimaro", "Zoro", "Neji");

        String[] array = nomes.toArray(new String[0]);

        for (String nome : nomes) {
            System.out.print(nome + " ");
        }

        List<String> listas = new ArrayList<>(Arrays.asList(array));
        listas.add("Jiraya");

        System.out.println();
        for (String lista : listas) {
            System.out.print(lista + " ");
        }
        System.out.println();

        System.out.println("-------------------------------------------");

        System.out.println("Comvertendo Array de inteiros em Lista");

        int[] arraInteiros = {1,2,3,4,5,6};

        List<Integer> listaInteiros = Arrays.stream(arraInteiros).boxed().toList();

        for (Integer listaInteiro : listaInteiros) {
            System.out.print(listaInteiro + " ");
        }
        System.out.println();

        System.out.println("-------------------------------------------");

        System.out.println("Convertendo uma Lista Integer em um Array");

        List<Integer> novaLista = Arrays.asList(9,8,7,6,5,4,3);

        int[] novoArray = novaLista.stream().mapToInt(Integer::intValue).toArray();

        for (int nvArray : novoArray) {
            System.out.print(nvArray + " ");
        }
    }
}
