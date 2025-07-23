package aulasDevDojo.aula198a200.teste;

import aulasDevDojo.aula198a200.dominio.Anime;
import aulasDevDojo.aula198a200.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;


// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTeste03 {

    public static void main(String[] args) {
        List<String> animeList = new ArrayList<>(List.of("Digimon", "Ino e Yasha", "Samurai X",
                "Full Metal", "My Hero Academy", "Black Clover"));

        animeList.sort(String::compareTo);
        System.out.println(animeList);

        Function<String, Integer> numsStringToInteger = Integer::parseInt;
        System.out.println(numsStringToInteger.apply("10"));


        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(animeList, "Samurai X"));

    }
}
