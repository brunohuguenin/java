package aulas.aula14;

import java.util.Scanner;

public class ControleDeDecisao {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Entre com sua idade: ");
        int idade = valor.nextInt();

        if (idade >= 18) {
            if (idade >= 65) {
                System.out.println("Você é considerado idoso");
            } else {
                System.out.println("É maior de idade");
            }
        } else {
            System.out.println("Não é maior de idade");
        }
    }
}
