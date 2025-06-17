package exercicios.exAulas14e15;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Em que turno você estuda? %nM - Matutino %nV - Vespertino %nN - Noturno %nOpção: ");
        String opcao = String.valueOf(scanner.next().toUpperCase().charAt(0));

        if (opcao.equals("M")){
            System.out.println("Bom-dia, meu Ala!");
        } else if (opcao.equals("V")) {
            System.out.println("Boa-tarde, Mestre!");
        } else if (opcao.equals("N")) {
            System.out.println("Boa-noite, Jogador!");
        }
        else {
            System.out.println("Valor inválido, seu Infeliz!");
        }

        scanner.close();
    }
}
