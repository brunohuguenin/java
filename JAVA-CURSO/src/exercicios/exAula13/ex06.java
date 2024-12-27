package exercicios.exAula13;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o tamanho do raio da circunferência: ");
        double raio = scan.nextDouble();

        double area = Math.pow(raio, 2);

        System.out.printf("A área da circunferência de raio %.2fcm é igual a %.2fπcm²", raio, area);
    }
}
