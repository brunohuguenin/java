package exercicios.ExSrings;

public class ex01 {
    public static void main(String[] args) {

        String original = "Java exercisses!";

        char caractere0 = original.charAt(0);
        char caractere10 = original.charAt(10);

        System.out.println("A frase é: " + original);
        System.out.printf("O caractere na posição 0 é: %c\n", caractere0);
        System.out.printf("O caractere na posição 0 é: %c", caractere10);
    }
}
