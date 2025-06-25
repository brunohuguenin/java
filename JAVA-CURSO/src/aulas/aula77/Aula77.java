package aulas.aula77;

public class Aula77 {
    public static void main(String[] args) {
        String java = "JAVA É PIKA";

        for (int i=0; i<java.length(); i++) {
            System.out.println(java.charAt(i));
        }

        char[] jav = new char[4];
        java.getChars(7, 11, jav, 0);

        System.out.println(jav);

        char[] javaChars = java.toCharArray();
        System.out.println(javaChars);
    }
}
