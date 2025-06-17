package exercicios.exAulas14e15;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scan.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra digitada é uma vogal.");
        } else if ((letra >= 'a' && letra <= 'z')) {
            System.out.println("A letra digitada é uma consoante.");
        } else {
            System.out.println("Caractere inválido. Por favor, insira uma letra.");
        }

        scan.close();

    }
}
