package aulasDevDojo.aula184a188.service;

import aulasDevDojo.aula184a188.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(
            List.of(new Carro("BMW"), new Carro("Mercedes"))
    );

    public Carro buscarCarroDisponivel() {
        System.out.println("Buscando carro disponível...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.print("Carros disponíveis para aluga: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.print("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
