package aulasDevDojo.aula195a197;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTeste02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Allucard");
        List<Integer> map = map(strings, (String s) -> s.length());
        System.out.println(strings);
        System.out.println(map);

        List<String> map1 = map(strings, s -> s.toUpperCase());
        System.out.println(map1);
        System.out.println(strings);

    }

    private static <T, R> List <R> map(List<T> list, Function<T, R> trFunction) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = trFunction.apply(e);
            result.add(r);
        }
        return result;
    }

}
