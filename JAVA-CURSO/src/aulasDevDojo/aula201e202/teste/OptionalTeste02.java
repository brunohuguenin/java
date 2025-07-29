package aulasDevDojo.aula201e202.teste;

import aulasDevDojo.aula201e202.dominio.Manga;
import aulasDevDojo.aula201e202.repositorio.Repository;

import java.util.Optional;

public class OptionalTeste02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = Repository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Boku no Hero 2"));

        System.out.println(mangaByTitle);

        Manga mangaById = Repository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = Repository.findByTitle("Drifters").orElseGet(() -> new Manga(3, "Drifters", 20));
        System.out.println(newManga);
    }
}
