package aulasDevDojo.aula195a197;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {
    public static void main(String[] args) {
        List<String> strings = List.of("William", "Suane", "Luffy", "Zoro");
        forEach(strings,  s -> System.out.println(s));

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        forEach(integers, i -> System.out.println(i));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
