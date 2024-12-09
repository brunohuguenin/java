package aulas.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();

        System.out.printf("Seu nome é %s, correto? ", nomeCompleto);

        System.out.println();
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();

        System.out.print("Quantos anos você tem: ");
        int idade = scan.nextInt();

        System.out.print("Qual é sua altura: ");
        double altura = scan.nextDouble();

        System.out.printf("Seu primeiro nome é %s, sua idade é igual a %d e sua altura é %2f, correto ?", primeiroNome, idade, altura);
    }
}
