package aulasDevDojo.aula203a219.al214.teste;


import aulasDevDojo.aula203a219.al214.dominio.Category;
import aulasDevDojo.aula203a219.al214.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste13 {
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
//        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
//        List<LightNovel> fantasy = new ArrayList<>();
//        List<LightNovel> drama = new ArrayList<>();
//        List<LightNovel> romance = new ArrayList<>();
//        for (LightNovel lightNovel : lightNovels) {
//            switch (lightNovel.getCategory()) {
//                case DRAMA : drama.add(lightNovel); break;
//                case FANTASY: fantasy.add(lightNovel); break;
//                case ROMANCE: romance.add(lightNovel); break;
//            }
//        }
//
//        categoryListMap.put(Category.DRAMA, drama);
//        categoryListMap.put(Category.FANTASY, fantasy);
//        categoryListMap.put(Category.ROMANCE, romance);
//
//        System.out.println(categoryListMap);
//
//        System.out.println("--------------------------------------------------");

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
