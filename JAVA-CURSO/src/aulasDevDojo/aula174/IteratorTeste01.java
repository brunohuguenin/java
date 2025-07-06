package aulasDevDojo.aula174;

import aulasDevDojo.aula169a171.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {


        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L,"Attack on Titan",19.90, 0));
        mangas.add(new Manga(1L, "Berserk", 19.9, 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 9.5, 0));
        mangas.add(new Manga(3L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(6L, "Dragon Ball Z", 11.20, 2));
        mangas.add(new Manga(2L, "Jujutsu Kaisen", 2.99, 0));

        System.out.println();
        System.out.println(mangas);
        System.out.println("----------------------------------------------------------------------------------------");

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            Manga manga = mangaIterator.next();
            if (manga.getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }

        System.out.println(mangas);

        System.out.println("----------------------------------------------------------------------------------------");

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
