package exercicios.ExSrings;

import java.util.Scanner;

public class ex111 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a String: ");
        String original = scan.nextLine();

        System.out.println("Insira uma palavra para remover: ");
        String palavra = scan.next();

        System.out.printf("A nova string com a palavra '%s' removida é:\n %s", palavra, replaceWord(original, palavra));

        System.out.println();

        scan.close();
    }

    public static String replaceWord(String text, String word) {
        String result = text.replace(word, "");
        result = result.replaceAll("\\s+", " ");
        return result;
    }
}
