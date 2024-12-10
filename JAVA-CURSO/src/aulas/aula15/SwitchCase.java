package aulas.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Entre com um número da semana (1 a 7): ");
        int diaSemana = valor.nextInt();

        /*if (diaSemana == 1) {
            System.out.println("DOMINGO");
        } else if (diaSemana == 2) {
        System.out.println("SEGUNDA-FEIRA");
        } else if (diaSemana == 3) {
            System.out.println("TERÇA-FEIRA");
        } else if (diaSemana == 4) {
            System.out.println("QUARTA-FEIRA");
        } else if (diaSemana == 5) {
            System.out.println("QUINTA-FEIRA");
        } else if (diaSemana == 6) {
            System.out.println("SEXTA-FEIRA");
        } else if (diaSemana == 7) {
            System.out.println("SABADO");
        } else {
            System.out.println("Não é um dia da semana válido!");
        } */

        switch (diaSemana) {
            case 1: System.out.println("DOMINGO");
                break;
            case 2: System.out.println("SEGUNDA-FEIRA");
                break;
            case 3: System.out.println("TERÇA-FEIRA");
                break;
            case 4: System.out.println("QUARTA-FEIRA");
                break;
            case 5: System.out.println("QUINTA-FEIRA");
                break;
            case 6: System.out.println("SEXTA-FEIRA");
                break;
            case 7: System.out.println("SABADO");
                break;
            default: System.out.println("Não é um dia da semana válido!");
        }
    }
}
