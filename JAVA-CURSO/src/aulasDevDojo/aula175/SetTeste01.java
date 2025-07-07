package aulasDevDojo.aula175;

import aulasDevDojo.aula169a171.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {


        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(5L,"Attack on Titan",19.90, 0));
        mangas.add(new Manga(1L, "Berserk", 19.9, 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 9.5, 0));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 9.5, 0));
        mangas.add(new Manga(3L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(6L, "Dragon Ball Z", 11.20, 2));
        mangas.add(new Manga(2L, "Jujutsu Kaisen", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
