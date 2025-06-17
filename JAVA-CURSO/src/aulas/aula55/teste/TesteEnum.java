package aulas.aula55.teste;

import aulas.aula54.dominio.DiaSemana;

public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();

//        for (int i = 0; i < dias.length; i++) {
//            System.out.println(dias[i]);
//        }

        for (DiaSemana dia: dias) {
            System.out.println(dia);
        }
    }

}
