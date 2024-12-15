package aulas.aula16;

import java.util.Scanner;

public class WhileEDoWhile {
    public static void main(String[] args) {

       /* int i = 0;
        int max = 10;

        while (i < max) {
            System.out.println("Contando até  o valor: " + i);
            i++;
        } */

        Scanner valor =new Scanner(System.in);

        System.out.println("====== TABUADA =========");
        System.out.print("Digite o número: ");
        int num = valor.nextInt();

        int iniciador = 0;
        do {
            System.out.printf("%d   x   %d = %d\n", iniciador, num, (iniciador * num));
            iniciador++;
        } while (iniciador <= 10);
    }
}
