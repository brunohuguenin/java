package exercicios.exAula13;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o valor em metro (M) para tranformar em centimetro (cm): ");
        double valor = scan.nextDouble();

        double valorCent = valor * 100;
        System.out.printf("%.2fm corresponde a %.2fcm\n", valor, valorCent);
    }
}
