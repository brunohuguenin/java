package aulasDevDojo.aula193a194.teste;

import aulasDevDojo.aula193a194.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametro01 {

    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );


    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println(filterByYearBefore(cars, 2012));


    }


    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
