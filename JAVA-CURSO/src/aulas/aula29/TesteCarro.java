package aulas.aula29;

public class TesteCarro {
    public static void main(String[] args) {


        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        //van.numPassageiros = 10;
        van.capCombustivel= 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.numPassageiros);

        Carro carro = new Carro("Honda", "Civic G10", 5, 112);

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println("O número de passageiros é: " + carro.numPassageiros);
        System.out.printf("A capacidade de combustível é igual a %.2fL", carro.capCombustivel);

        Carro2 carro2 = new Carro2();
    }
}
