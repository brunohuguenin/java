package aulasDevDojo.aula203a219.al217.teste;


import aulasDevDojo.aula203a219.al217.dominio.Category;
import aulasDevDojo.aula203a219.al217.dominio.LightNovel;
import aulasDevDojo.aula203a219.al217.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTeste16 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
            ));


    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> colect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(colect);


        Map<Category, Set<Promotion>> colect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTeste16::getPromotion, Collectors.toSet())));

        System.out.println(colect1);
        System.out.println("-------------------------------");

        Map<Category, LinkedHashSet<Promotion>> colect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTeste16::getPromotion,
                                Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(colect2);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }

}
