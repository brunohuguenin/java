package aulasDevDojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TesteSaida {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        System.out.println(nomes.get(1)); // Bruno

        nomes.remove("Ana");
        nomes.add(1, "Daniel");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
