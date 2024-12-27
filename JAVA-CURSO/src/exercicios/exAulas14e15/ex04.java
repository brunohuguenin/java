package exercicios.exAulas14e15;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        // Minha resolução
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira uma letra: ");
        String letra = scan.next();
        // sacada -> poderia ter usado a função toLowerCase e charAt para colocar a letra inserida
        // em minúscula e pegar somente a primeira letra caso o usuário inserir uma palavra

        switch (letra) {
            case "a":
                System.out.println("A letra inserida é uma vogal.");
                break;
            case "e":
                System.out.println("A letra inserida é uma vogal.");
                break;
            case "i":
                System.out.println("A letra inserida é uma vogal.");
                break;
            case "o":
                System.out.println("A letra inserida é uma vogal.");
                break;
            case "u":
                System.out.println("A letra inserida é uma vogal.");
                break;
            default:
                System.out.println("A lotra inserida não é uma vogal.");
        }
         */

        // Resolução do ChatGPT
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra digitada é uma vogal.");
        } else if ((letra >= 'a' && letra <= 'z')) {
            System.out.println("A letra digitada é uma consoante.");
        } else {
            System.out.println("Caractere inválido. Por favor, insira uma letra.");
        }

        scanner.close();

    }
}
