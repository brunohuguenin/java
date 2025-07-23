package aulasDevDojo.aula198a200.service;

import aulasDevDojo.aula198a200.dominio.Anime;

public class AnimeComparator {
    public static int comparatorByTitle(Anime anime1, Anime anime2) {
        return anime1.getTitle().compareTo(anime2.getTitle());
    }


    public static int comparaByEpisodes(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }


    public  int comparaByEpisodesNonStatic(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }

}
