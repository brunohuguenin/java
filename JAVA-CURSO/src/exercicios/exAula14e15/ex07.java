package exercicios.exAula14e15;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Insira o 1º número: ");
    int num1 = scan.nextInt();
        System.out.print("Insira o 2º número: ");
    int num2 = scan.nextInt();
        System.out.print("Insira o 3º número: ");
    int num3 = scan.nextInt();

    int maior = num1;
    int menor = num2;
    if (num2 > maior) {
        maior = num2;
        menor = num1;
    }
    if (num3 > maior) {
        maior = num3;
    }
    if (num3 < menor) {
        menor = num3;
    }

    System.out.printf("O maior valor inserido foi %d e o menor valor foi %d", maior, menor);

    scan.close();
    }
}
