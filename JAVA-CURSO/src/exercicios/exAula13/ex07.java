package exercicios.exAula13;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o comprimento do lado do quadrado: ");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);
        System.out.printf("A área do quadrado de lado %.2fcm é %.2fcm^2 e seu dobro é igual a %.2fcm^2",
                lado, area, (area * 2));
    }

}
