package aulasDevDojo.aula166a168;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {

        List <String> nomes = new ArrayList<>();
        List <String> nomes2 = new ArrayList<>();
        nomes.add("William");
        nomes.add("DevDojo Academy");
        nomes2.add("Cleitin");
        nomes2.add("Beraldo");

        nomes.addAll(nomes2);

        for(String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("-----------------------------");


        nomes.add("Natalino");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
}
