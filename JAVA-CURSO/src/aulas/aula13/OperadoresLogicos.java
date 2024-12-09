package aulas.aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean a = true, b = false;
        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a && a: " + (a && a)); // true
        System.out.println("a || b: " + (a || b)); // true
        System.out.println("!a: " + (!a));         // false

        // Lembrar da tabela verdade
    }
}
