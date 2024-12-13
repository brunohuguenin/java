package exercicios.lista02;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        // Faça um rpgrama que peça ois números e impima o maior deles

        Scanner valor = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int num1 = valor.nextInt();

        System.out.print("Insira o segundo número: ");
        int num2 = valor.nextInt();

        int maior;
        if (num1 > num2) {
            maior = num1;
        } else {
            maior = num2;
        }

        System.out.printf("O maior número inserido é o: %d", maior);
    }
}
