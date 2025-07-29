package aulasDevDojo.aula203a219.al209;

import java.util.List;

public class StreamsTeste08 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        numbers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        numbers.stream().reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println("--------------------");

        numbers.stream().reduce((x,y) -> x * y).ifPresent(System.out::println);
        System.out.println(numbers.stream().reduce(1, (x,y) -> x * y));

        System.out.println("--------------------");

        numbers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(numbers.stream().reduce(0, Integer::max));
    }
}
