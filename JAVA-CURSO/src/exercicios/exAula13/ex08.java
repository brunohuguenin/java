package exercicios.exAula13;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto ganha por hora no seu trabalho R$: ");
        double ganhoHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por dia: ");
        double horasTrabalhadas = scan.nextDouble();

        System.out.println("Quantos dias você trabalha por semana: ");
        double diasTrabalhadosSemana = scan.nextDouble();

        double ganhosSemana = (ganhoHora * horasTrabalhadas) * diasTrabalhadosSemana;


        System.out.printf("Seu salário mensal é igual a R$ %.2f", (ganhosSemana * 4));

    }
}
