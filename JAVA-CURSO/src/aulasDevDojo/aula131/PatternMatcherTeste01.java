package aulasDevDojo.aula131;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    public static void main(String[] args) {

        String regex = "aba";
        String texto = "abaaba";
        String texto2 = "abababa";

        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(texto2);

        System.out.println("texto:  " + texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.printf(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
