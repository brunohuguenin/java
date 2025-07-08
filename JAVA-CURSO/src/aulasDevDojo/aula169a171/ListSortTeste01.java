package aulasDevDojo.aula169a171;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListSortTeste01 {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>(6);

        mangas.add("Hellsing Ultimate");
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");
        mangas.add("Attack on Titan");
        mangas.add("Jujutsu Kaisen");

        Collections.sort(mangas);
        for (String manga : mangas) {
            System.out.println(manga);
        }
    }
}
