package Testes.revisao.J_treeSetENavigableSet;

import Testes.revisao.F_sortingList.Carros;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTeste {
    public static void main(String[] args) {
        Set<Carros> carrosSet = new TreeSet<>();

        carrosSet.add(new Carros(33L, "Mercedes-Benz", 120.999));
        carrosSet.add(new Carros(34L, "Toyota", 89.999));
        carrosSet.add(new Carros(34L, "Toyota", 137.999));
        carrosSet.add(new Carros(35L, "Tesla", 220.450));
        carrosSet.add(new Carros(36L, "Chevrolet", 100.000));
        carrosSet.add(new Carros(36L, "Chevrolet", 95.000));
        carrosSet.add(new Carros(37L, "Hyundai", 179.999));

        for (Carros carro : carrosSet) {
            System.out.println(carro);
        }
    }
}
