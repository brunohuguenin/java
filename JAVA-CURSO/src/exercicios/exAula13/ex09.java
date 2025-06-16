package exercicios.exAula13;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Farenheit ºF: ");
        double temFarenHeit = scan.nextDouble();

        double temCelsius = 5 * ((temFarenHeit - 32) / 9);


        System.out.printf("A temperatura de %.2fºF é equivalente a %.2fºC", temFarenHeit, temCelsius);
    }
}
