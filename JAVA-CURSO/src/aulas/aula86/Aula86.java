package aulas.aula86;

import java.util.Date;

public class Aula86 {
    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        System.out.println("Milissegundo desde 1 de jan de 1970 " + hoje.getTime());

    }
}
