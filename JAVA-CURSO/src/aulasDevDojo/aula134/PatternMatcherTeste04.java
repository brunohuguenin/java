package aulasDevDojo.aula134;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste04 {
    public static void main(String[] args) {

//        \d = Todos os dígitos
//        \D = Tudo que não for dígito
//        \s = Todos os espaços em branco -> \t, \n, \f, \r
//        \S = Todos os caracteres exceto os espaços em brancos
//        \w = a-ZA-Z, dígitos, _, (não pega carctere especial)
//        \W = Tudo o que não for incluso no \w
//        [] = Ele vai procurar por o que estiver dentro dos colchetes
//        ? = Zero ou Uma ocorrências
//        * = zero ou mais
//        + = uma ou mais
//        {n,m} = de n até m
//        ()
//        | = o(v|c)o  -> ovo | oco
//        $ = fim da linha
//        . = caracter coringa -> 1.3 = 133, 1@3, 1A3




        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto2 = "12 0x 0X 0xFFABC 0x10G 0X1";

        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(texto2);

        System.out.println("texto:  " + texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.printf(matcher.start() + " " + matcher.group() + "\n");
        }

//        int numeroHex = 0x109;
//        System.out.println(numeroHex);
    }
}
