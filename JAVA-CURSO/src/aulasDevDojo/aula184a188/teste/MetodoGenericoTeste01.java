package aulasDevDojo.aula184a188.teste;

import aulasDevDojo.aula184a188.dominio.Barco;

import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {

        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }
 }


