package aulasDevDojo.aula184a188.teste;

import aulasDevDojo.aula184a188.dominio.Barco;
import aulasDevDojo.aula184a188.service.BarcoRentavelService;

public class ClassesGenericsTeste02 {
    public static void main(String[] args) {

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
