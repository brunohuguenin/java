package Testes.revisao.F_sortingList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CarrosByComparator implements Comparator<Carros> {

    @Override
    public int compare(Carros o1, Carros o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class CarroTeste {
    public static void main(String[] args) {
        List<Carros> carros = new ArrayList<>(9);

        carros.add(new Carros(33L, "Mercedes-Benz", 120.999));
        carros.add(new Carros(34L, "Toyota", 89.999));
        carros.add(new Carros(35L, "Tesla", 220.450));
        carros.add(new Carros(36L, "Chevrolet", 100.000));
        carros.add(new Carros(37L, "Hyundai", 179.999));
        carros.add(new Carros(33L, "Renault", 139.999));
        carros.add(new Carros(39L, "BMW", 200.000));
        carros.add(new Carros(63L, "Audi", 159.999));
        carros.add(new Carros(64L, "Porshe", 430.999));

        System.out.println("Lista de Carros");
        for (Carros carro : carros) {
            System.out.println(carro);
        }

        System.out.println("--------------------------------------------");

        System.out.println("Lista ordenada de Carros com Comparable");
        Collections.sort(carros);
        for (Carros carro : carros) {
            System.out.println(carro);
        }

        System.out.println("--------------------------------------------");

        System.out.println("Lista ordenada de Carros com ComparaTor");
        Collections.sort(carros, new CarrosByComparator());
        for (Carros carro : carros) {
            System.out.println(carro);
        }


    }
}
