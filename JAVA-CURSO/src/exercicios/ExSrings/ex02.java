package exercicios.ExSrings;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
//        char letra = 'A';
//        int codigo = letra;
//
//        System.out.println("Código unicode de A: " + codigo);

        Scanner scan = new Scanner(System.in);

        String stringOriginal = "w3resource.com";

        System.out.println("Aqui está o Texto original: " + stringOriginal);

        System.out.println("De qaul letra você quer o ponto unicode: ");
        char letra = scan.next().charAt(0);
        int ptCode = letra;

        System.out.printf("O código unicode da letra %c é %d", letra, ptCode);

    }
}
