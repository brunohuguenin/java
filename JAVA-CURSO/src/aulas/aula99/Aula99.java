package aulas.aula99;

import java.util.Random;

public class Aula99 {

    public static void main(String[] args) {

        System.out.println(Math.floor(Math.random() * 100));

        Random aleatorio = new Random();

        System.out.println(aleatorio.nextInt());

        System.out.println(aleatorio.nextInt(5 + 1));
    }
}
