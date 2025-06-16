package exercicios.exAula13;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto ganha por hora no seu trabalho R$: ");
        double ganhoHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por dia: ");
        double horasTrabalhadas = scan.nextDouble();

        System.out.println("Quantos dias você trabalha por semana: ");
        double diasTrabalhadosSemana = scan.nextDouble();

        double salarioBruto = ((ganhoHora * horasTrabalhadas) * diasTrabalhadosSemana) * 4;

        double impRenda = salarioBruto * 0.11;
        double impINSS = salarioBruto * 0.08;
        double impSindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impRenda - impINSS - impSindicato;



        System.out.printf("Seu salário bruto mensal é igual a R$ %.2f\n", salarioBruto);
        System.out.printf("Você pagou de Imposto de Renda o valor de R$ %.2f\n", impRenda);
        System.out.printf("Você pagou ao INSS o valor de R$ %.2f\n", impINSS);
        System.out.printf("Você pagou ao Sindicato o valor de R$ %.2f\n", impSindicato);
        System.out.printf("Seu salário líquido mensal é igual a R$ %.2f\n", salarioLiquido);
    }
}
