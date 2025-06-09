package JavaComLoianeGroner.Aulas.aula24.teste;

import JavaComLoianeGroner.Aulas.aula24.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel= 100;
        van.consumoCombustivel = 0.2;

        System.out.printf("\nMarca do carro: %s\nModelo: %s\nNúmeros de passageiros: %d\n", van.marca, van.modelo, van.numPassageiros);

        System.out.println("-----------------------------");

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;''

        System.out.printf("\nMarca do carro: %s\nModelo: %s\nNúmeros de passageiros: %d\n", fusca.marca, fusca.modelo, fusca.numPassageiros);

    }
}
