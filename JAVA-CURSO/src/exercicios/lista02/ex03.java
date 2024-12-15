package exercicios.lista02;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner caractere = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = caractere.next();

        if (letra == "f" || letra == "F") {
            System.out.println("Feminino");
        } else if (letra == "m" || letra == "M") {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo inválido.");
        }

        /*
           O problema no seu código ocorre porque, em Java,
           o operador == para comparar strings verifica se as
           referências das strings apontam para o mesmo objeto
           na memória, e não se os valores das strings são iguais.
           Para comparar o conteúdo de strings, você deve usar o método
           .equals() ou .equalsIgnoreCase().

           O ideal era usar assim:
           if (letra.equals("f") || letra.equals("F")) {
                System.out.println("Feminino");
           } else if (letra.equals("m") || letra.equals("M")) {
                System.out.println("Masculino");
           }
         */

        /*


        switch (letra) {
            case "f":
                System.out.println("Feminino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            case "m":
                System.out.println("Sexo inválido.");
                break;
            case "M":
                System.out.println("Sexo inválido.");
                break;
            default:
                System.out.println("Sexo Inválido");

        } */


        // Solução dada pelo chatGPT
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra (F ou M): ");
        String input = scanner.nextLine();

        // Verifica se o input não está vazio e obtém o primeiro caractere
        if (input.length() > 0) {
            char letra = input.charAt(0);

            // Estrutura de decisão para verificar o sexo
            if (letra == 'f' || letra == 'F') {
                System.out.println("Sexo feminino");
            } else if (letra == 'm' || letra == 'M') {
                System.out.println("Sexo masculino");
            } else {
                System.out.println("Sexo inválido");
            }
        } else {
            System.out.println("Nenhuma letra foi digitada.");
        }

        scanner.close(); */
    }
}
