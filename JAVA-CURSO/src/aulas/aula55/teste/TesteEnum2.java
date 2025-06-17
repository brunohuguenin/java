package aulas.aula55.teste;

import aulas.aula53.dominio.DiaSemana;

public class TesteEnum2 {
    public static void main(String[] args) {

//        DiaSemana dia;

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);

    }
}
