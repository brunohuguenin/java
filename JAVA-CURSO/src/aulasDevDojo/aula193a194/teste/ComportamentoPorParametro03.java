package aulasDevDojo.aula193a194.teste;

import aulasDevDojo.aula193a194.dominio.Car;
import aulasDevDojo.aula193a194.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametro03 {

    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );


    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
//        System.out.println(greenCars);

        List<Car> greeCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> ageCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greeCars);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13);
        System.out.println(filter(nums, num -> num % 2 == 0));
        System.out.println(filter(cars, car -> car.getYear() < 2020));

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }


}
