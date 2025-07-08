package aulasDevDojo.aula184a188.teste;

import aulasDevDojo.aula184a188.dominio.Carro;
import aulasDevDojo.aula184a188.service.CarroRentavelService;

public class ClassesGenericsTeste01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
