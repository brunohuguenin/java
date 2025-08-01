package Testes.collection.J_treeSetENavigableSet;

import Testes.collection.F_sortingList.Carros;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTeste {
    public static void main(String[] args) {
        NavigableSet<Carros> carrosNavigableSet = new TreeSet<>();

        carrosNavigableSet.add(new Carros(33L, "Mercedes-Benz", 120.999));
        carrosNavigableSet.add(new Carros(34L, "Toyota", 89.999));
        carrosNavigableSet.add(new Carros(35L, "Tesla", 220.450));
        carrosNavigableSet.add(new Carros(36L, "Chevrolet", 100.000));
        carrosNavigableSet.add(new Carros(37L, "Hyundai", 179.999));
        carrosNavigableSet.add(new Carros(33L, "Renault", 139.999));
        carrosNavigableSet.add(new Carros(39L, "BMW", 200.000));
        carrosNavigableSet.add(new Carros(63L, "Audi", 159.999));
        carrosNavigableSet.add(new Carros(64L, "Porshe", 430.999));


        System.out.println("Pegando o Renault como referencia");
        Carros renault = carrosNavigableSet.stream()
                .filter(carro -> carro.getMarca().equals("Renault"))
                .findFirst()
                .orElse(null);

        if (renault != null) {
            System.out.println(renault);
            Carros carroAnterior = carrosNavigableSet.lower(renault);
            System.out.println("O carro com valor imediatamente menor que o Renault: " + carroAnterior);
        } else  {
            System.out.println("Renault não encontrado!");
        }
    }
}
