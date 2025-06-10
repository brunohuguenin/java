package aulas.aula29;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro(){
        System.out.println("A classe Carro foi instânciada!");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_) {
        this.marca = marca_;
        this.modelo = modelo_;
        this.numPassageiros = numPassageiros_;
        this.capCombustivel = capCombustivel_;
    }


    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }

}
