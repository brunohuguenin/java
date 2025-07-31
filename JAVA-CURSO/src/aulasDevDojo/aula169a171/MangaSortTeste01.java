package aulasDevDojo.aula169a171;

import aulasDevDojo.aula169a171.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTeste01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(4L, "Hellsing Ultimate", 9.5));
        mangas.add(new Manga(1L, "Berserk", 19.9));
        mangas.add(new Manga(3L, "Pokemon", 3.2));
        mangas.add(new Manga(6L, "Dragon Ball Z", 11.20));
        mangas.add(new Manga(5L,"Attack on Titan",19.90));
        mangas.add(new Manga(2L, "Jujutsu Kaisen", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------------------------");

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------------------------");

        Collections.sort(mangas, new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
