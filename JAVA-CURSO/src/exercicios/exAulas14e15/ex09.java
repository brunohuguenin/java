package exercicios.exAulas14e15;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Entre com o primeiro valor: ");
        int num1 = scanner.nextInt();
        System.out.printf("Entre com o segundo valor: ");
        int num2 = scanner.nextInt();
        System.out.printf("Entre com o terceiro valor: ");
        int num3 = scanner.nextInt();

        int maior, meio, menor;

        if (num1 >= num2 && num1 >= num3){
            maior = num1;
            if (num2 >= num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3){
            maior = num2;
            if (num1 >= num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        }
        else {
             maior = num3;
             if (num1 >= num2) {
                 meio = num1;
                 menor = num2;
             } else {
                 meio = num2;
                 menor = num1;
             }
        }

        System.out.printf("Os valores inseridos em ordem decrescente são %d, %d e %d", maior, meio, menor);
    }
}
