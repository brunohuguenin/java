package aulasDevDojo.aula198a200.teste;

import aulasDevDojo.aula198a200.dominio.Anime;
import aulasDevDojo.aula198a200.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste01 {

    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 100)
        ));

//        Collections.sort(animeList, (anime1, anime2) -> anime1.getTitle().compareTo(anime2.getTitle()));
//        Collections.sort(animeList, AnimeComparator::comparatorByTitle);
        Collections.sort(animeList, AnimeComparator::comparaByEpisodes);

        System.out.println(animeList);
    }
}
