package aulasDevDojo.aula132;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {

//        \d = Todos os dígitos
//        \D = Tudo que não for dígito
//        \s = Todos os espaços em branco -> \t, \n, \f, \r
//        \S = Todos os caracteres exceto os espaços em brancos
//        \w = a-ZA-Z, dígitos, _, (não pega carctere especial)
//        \W = Tudo o que não for incluso no \w

        String regex = "\\W";
        //String texto = "abaaba";
        String texto2 = "@$hh_j2 12gv\th21oiju8\f2154\r";

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
