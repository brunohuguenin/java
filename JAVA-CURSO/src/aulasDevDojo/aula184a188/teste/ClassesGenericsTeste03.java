package aulasDevDojo.aula184a188.teste;

import aulasDevDojo.aula184a188.dominio.Barco;
import aulasDevDojo.aula184a188.dominio.Carro;
import aulasDevDojo.aula184a188.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassesGenericsTeste03 {
    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("BMW"), new Carro("Mercedes"))
        );
        List<Barco> barcosDisponiveis = new ArrayList<>(
                List.of(new Barco("Lancha"), new Barco("Canoa"))
        );



        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("-------------------------------------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
