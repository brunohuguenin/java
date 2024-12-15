package exercicios.lista03;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int nota;

        System.out.print("Insira um nota entre 0 e 10: ");
        nota = valor.nextInt();

        do {
            System.out.print("Valor Inválido!!\nInsira um nota entre 0 e 10: ");
            nota = valor.nextInt();

        } while (nota < 0 || nota > 10);

        System.out.println("A nota inserida foi: " + nota);

    }
}
