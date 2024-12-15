package aulas.aula18;

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int num = scan.nextInt();

        System.out.print("Entre com um limite: ");
        int limite = scan.nextInt();

        for (int i = num; i <= limite; i++) {
            if (i % 7 == 0) {
                System.out.printf("O primeiro número divisível por 7 entre %d e %d é: %d", num, limite, i);
                break;
            }
        }
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int num = scan.nextInt();

        System.out.print("Entre com um limite: ");
        int limite = scan.nextInt();

        System.out.printf("Todos os números que não são divisível por 7 entre %d e %d\n", num, limite);
        for (int i = num; i <= limite; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.printf("%d\n", i);
        }

    }
}
