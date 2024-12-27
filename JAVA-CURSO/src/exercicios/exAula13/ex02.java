package exercicios.exAula13;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        //Faça um programa que peça um número e então mostre a mensagem “O número informado foi: x”

        Scanner num = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = num.nextInt();

        System.out.println("O número inserido foi: " + numero);
    }
}
