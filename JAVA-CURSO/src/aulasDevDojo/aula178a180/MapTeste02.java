package aulasDevDojo.aula178a180;

import aulasDevDojo.aula169a171.dominio.Manga;
import aulasDevDojo.aula178a180.dominio.Consumidor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Everaldo Gusmão");
        Consumidor consumidor2 = new Consumidor("Tobias Nobrega");

        Manga manga1 = new Manga(5L,"Attack on Titan",19.90);
        Manga manga2 = new Manga(1L, "Berserk", 19.9);
        Manga manga3 = new Manga(4L, "Hellsing Ultimate", 9.5);
        Manga manga4 = new Manga(3L, "Pokemon", 3.2);
        Manga manga5 = new Manga(6L, "Dragon Ball Z", 11.20);
        Manga manga6 = new Manga(2L, "Jujutsu Kaisen", 2.99);

//        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
//        consumidorManga.put(consumidor1, manga3);
//        consumidorManga.put(consumidor2, manga6);


//        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
//            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
//        }

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2,manga4);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga5);
        Map<Consumidor, List<Manga>>  consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " comprou: ");
            for (Manga manga: entry.getValue()) {
                System.out.println(manga.getNome());
            }
            System.out.println();
        }

    }
}
