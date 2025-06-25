package aulas.aula78;

import java.util.SplittableRandom;

public class Aula78 {
    public static void main(String[] args) {

        String valeu = "Valeu";
        String valeu2 = "VALEU";
        String valeu3 = "valeu";

        System.out.println("valeu equals valeu2: " + valeu.equals(valeu2));
        System.out.println("valeu equals valeu3: " + valeu.equals(valeu3));
        System.out.println("valeu equalsIgnoreCase valeu2: " + valeu.equalsIgnoreCase(valeu2));

        String banana = "banana";
        String ana = "ana";
        String ban = "BAN"; // trocar por maiúscula

        System.out.println(banana.regionMatches(1,ana,0,3));
        System.out.println(banana.regionMatches(2,ana,1,2));
        System.out.println(banana.regionMatches(true,0,ban,0,3));

        System.out.println(banana.endsWith(ana));
        System.out.println(banana.toUpperCase().startsWith(ban));

        String a = "a";
        String b = "b";
        String aMaiusculo = "A";

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo("a"));
        System.out.println(a.compareTo(aMaiusculo));
        System.out.println(a.compareToIgnoreCase(aMaiusculo));

//        -1 quando a > b
//        0 quando a == b
//        1 ou > 1 quando a < b
    }
}
