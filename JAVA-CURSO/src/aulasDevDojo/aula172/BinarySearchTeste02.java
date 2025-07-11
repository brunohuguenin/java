package aulasDevDojo.aula172;

import aulasDevDojo.aula169a171.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste02 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L,"Attack on Titan",19.90));
        mangas.add(new Manga(1L, "Berserk", 19.9));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 9.5));
        mangas.add(new Manga(3L, "Pokemon", 3.2));
        mangas.add(new Manga(6L, "Dragon Ball Z", 11.20));
        mangas.add(new Manga(2L, "Jujutsu Kaisen", 2.99));

        Collections.sort(mangas);

        for (Manga manga: mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Jujutsu Kaisen", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
