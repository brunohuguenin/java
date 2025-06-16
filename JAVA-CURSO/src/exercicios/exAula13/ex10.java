package exercicios.exAula13;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celcius ºC: ");
        double temCelsius = scan.nextDouble();

        // 5 * ((temFarenHeit - 32) / 9);

        double temFarenHeit = ((9 * temCelsius) /5) + 32;
        System.out.printf("A temperatura de %.2fºC é equivalente a %.2fºF", temCelsius, temFarenHeit);
    }
}
