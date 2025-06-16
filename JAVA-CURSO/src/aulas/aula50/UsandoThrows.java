package aulas.aula50;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {

        System.out.println("Entre com um número decimal: ");
        try {
            double num = leNumeros();
        } catch (Exception e) {
            System.out.println("Entrada inválida !!");
            e.printStackTrace();
        }

    }

    public static double leNumeros() throws Exception{
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        return num;
    }
}
