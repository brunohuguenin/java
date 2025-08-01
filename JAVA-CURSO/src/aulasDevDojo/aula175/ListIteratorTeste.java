package aulasDevDojo.aula175;

import Testes.collection.F_sortingList.Carros;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTeste {
    public static void main(String[] args) {
        List<Carros> carros = new ArrayList<>();

        carros.add(new Carros(33L, "Mercedes-Benz", 120.999));
        carros.add(new Carros(34L, "Toyota", 89.999));
        carros.add(new Carros(35L, "Tesla", 220.450));
        carros.add(new Carros(36L, "Chevrolet", 100.000));
        carros.add(new Carros(37L, "Hyundai", 179.999));


        System.out.println("--------- ANTES DA MODIFICAÇÃO ---------");

        for (Carros carro : carros) {
            System.out.println(carro.getMarca() + " R$" + carro.getPreco());
        }

        System.out.println();
        System.out.println("--------- DEPOIS DA MODIFICAÇÃO ---------");

        ListIterator<Carros> carrosListIterator = carros.listIterator();

        //System.out.println("--------------------------------------");
        System.out.println("Adicionando novo carro antes do Tesla:");


        while (carrosListIterator.hasNext()) {
            Carros marcaEPreco = carrosListIterator.next();
            if (marcaEPreco.getMarca().equals("Toyota")) {
                carrosListIterator.previous();
                carrosListIterator.add(new Carros(57L, "Mustang", 499.000));
                break;
            }
        }
        for (Carros carro : carros) {
            System.out.println("marca: " + carro.getMarca() + " - R$" + carro.getPreco());
        }

        System.out.println("--------------------------------------");


        System.out.println("Percorrndo para frente:");
        while (carrosListIterator.hasNext()) {
            Carros marcaEPreco = carrosListIterator.next();
            System.out.println("marca: " + marcaEPreco.getMarca() + " - R$" + marcaEPreco.getPreco());
        }

        System.out.println("--------------------------------------");
        System.out.println("Percorrndo para trás:");
        while (carrosListIterator.hasPrevious()) {
            Carros marcaEPreco = carrosListIterator.previous();
            System.out.println("marca: " + marcaEPreco.getMarca() + " - R$" + marcaEPreco.getPreco());
        }

        System.out.println("--------------------------------------");
        System.out.println("Modificando nome da marca Chevrolet para BYD:");
        while (carrosListIterator.hasNext()) {
            Carros marcaEPreco = carrosListIterator.next();
            if (marcaEPreco.getMarca().equals("Chevrolet")) {
                carrosListIterator.set(new Carros(44L, "BYD", 149.999));
            }
        }

        for (Carros carro : carros) {
            System.out.println("marca: " + carro.getMarca() + " - R$" + carro.getPreco());
        }


    }
}
