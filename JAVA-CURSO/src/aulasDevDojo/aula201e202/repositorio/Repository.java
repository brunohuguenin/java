package aulasDevDojo.aula201e202.repositorio;

import aulasDevDojo.aula201e202.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Repository {
    public static List<Manga> mangas = List.of(new Manga(
            1, "Boku no Hero", 50),
            new Manga(2, "Overlord", 25)
    );

    public static Optional<Manga> findById(Integer id) {
        return findBy(manga -> manga.getId().equals(id));
    }


//    private static Optional<Manga> findById(Integer id) {
//        Manga found = null;
//        for (Manga manga : mangas) {
//            if (manga.getId().equals(id)) {
//                found = manga;
//            }
//        }
//        return  Optional.ofNullable(found);
//    }

    public static Optional<Manga> findByTitle(String title) {
        return findBy(manga -> manga.getTitle().equals(title));
    }

//    private static Optional<Manga> findByTitle(String title) {
//        Manga found = null;
//        for (Manga manga : mangas) {
//            if (manga.getTitle().equals(title)) {
//                found = manga;
//            }
//        }
//        return  Optional.ofNullable(found);
//    }


    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return  Optional.ofNullable(found);
    }
}
