package aulasDevDojo.aula184a188.service;

import java.util.List;

public class RentalService <T>{

    private List<T> objetosDisponiveis;
    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }


    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto disponível...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + t);
        System.out.print("Carros disponíveis para aluga: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo carro " + t);
        objetosDisponiveis.add(t);
        System.out.print("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
