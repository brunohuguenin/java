package Testes.revisao.I_iteratorEListIterator;

import Testes.revisao.F_sortingList.Carros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorTeste {
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

        System.out.println("ANTES da remoção:");
        for (Carros carro : carros) {
            System.out.println(carro.getMarca() + " R$" + carro.getPreco());
        }

        System.out.println("------------------------------------");

        System.out.println("REMOVENDO carros da marca Tesla...");
        Iterator<Carros> carrosIterator = carros.iterator();

        while (carrosIterator.hasNext()) {
            Carros nome = carrosIterator.next();
            if (nome.getPreco() == 200.000 ) {
                carrosIterator.remove();
            }
        }


        System.out.println("DEPOIS da remoção:");
        for (Carros carro : carros) {
            System.out.println(carro.getMarca() + " R$" + carro.getPreco());
        }

    }
}
