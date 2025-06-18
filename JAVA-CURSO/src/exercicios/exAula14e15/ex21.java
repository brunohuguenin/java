package exercicios.exAula14e15;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********** CAIXA ELETRÔNICO **********");
        System.out.printf("Insira o valor que deseja sacar (mínimo R$ 10, e máximo R$600): R$ ");
        int saque = scanner.nextInt();

        if (saque < 10 || saque > 600){
            System.out.println("Valor de saque inválido! (mínimo R$ 10, e máximo R$600)");
        } else {
            int notas100 = saque / 100;
            saque %= 100;

            int notas50 = saque / 50;
            saque %= 50;

            int notas10 = saque / 10;
            saque %= 10;

            int notas5 = saque / 5;
            saque %= 5;

            int notas1 = saque;


            System.out.println("Notas fornecidas:");

            if (notas100 > 0) System.out.println(notas100 + " Notas de 100 reais");
            if (notas50 > 0) System.out.println(notas50 + " Notas de 50 reais");
            if (notas10 > 0) System.out.println(notas10 + " Notas de 10 reais");
            if (notas5 > 0) System.out.println(notas5 + " Notas de 5 reais");
            if (notas1 > 0) System.out.println(notas1 + " Notas de 1 real");
        }



    }
}
