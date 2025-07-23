package aulasDevDojo.aula198a200.teste;

import aulasDevDojo.aula198a200.dominio.Anime;
import aulasDevDojo.aula198a200.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste02 {

    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One Piece", 900),
                new Anime("Jujutsu Kaisen", 97),
                new Anime("Naruto", 100)
        ));

//        animeList.sort(animeComparator::comparaByEpisodesNonStatic);
        animeList.sort((a1, a2) -> animeComparator.comparaByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);

    }

}
