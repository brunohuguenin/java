package aulasDevDojo.aula184a188;


import java.util.ArrayList;
import java.util.List;

public class WildcardTeste02 {
    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

    public static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal: animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> anaimals) {
        anaimals.add(new Cachorro());
        anaimals.add(new Gato());
    }
}

