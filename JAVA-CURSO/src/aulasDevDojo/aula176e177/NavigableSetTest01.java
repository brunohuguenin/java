package aulasDevDojo.aula176e177;

import aulasDevDojo.aula161e162.dominio.Smartphone;
import aulasDevDojo.aula169a171.dominio.Manga;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}


public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L,"Attack on Titan",19.90, 0));
        mangas.add(new Manga(1L, "Berserk", 19.9, 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 9.5, 0));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 9.5, 0));
        mangas.add(new Manga(3L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(6L, "Dragon Ball Z", 11.20, 2));
        mangas.add(new Manga(2L, "Jujutsu Kaisen", 2.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));

        for (Manga manga: mangas) {
            System.out.println(manga);
        }

//        for (Manga manga: mangas.descendingSet()) {
//            System.out.println(manga);
//        }

        // lower:    vai trazer objeto com menor valor imediato abaixo ao que você passar
        // floor:    vai trazer objeto com o valor igual
        // higher:   vai trazer objeto com maior valor imediato acima ao que você parrar
        // ceiling:  vai trazer objeto valor imediato maior ou igual ao que você passar

        Manga yuyu = new Manga(21L, "Yuyuu Hakusho", 3.2);  // 1º tinha oassado 8.0 no preço
        System.out.println("------------------------------------------------");
        //System.out.println(mangas.lower(yuyu)); // vai trazer objeto com menor valor imediato abaixo ao que você passar
        //System.out.println(mangas.floor(yuyu));  //  vai trazer objeto com o valor igual
        //System.out.println(mangas.higher(yuyu));  //vai trazer objeto com maior valor imediato acima ao que você parrar
        //System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // retorna e remove o primeiro objeto * Está ordenado por preço!!
        System.out.println(mangas.size());

    }
}
