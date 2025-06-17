package aulas.aula54.teste;

import aulas.aula54.dominio.DiaSemana;

public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia.toString() + " - " + dia.getValor());
    }

}
