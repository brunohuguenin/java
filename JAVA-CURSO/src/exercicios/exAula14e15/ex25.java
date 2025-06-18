package exercicios.exAula14e15;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int responstasPositivas = 0;

        // Perguntas
        System.out.println("Telefonou para a vítima? (s/n)");
        String resposta1 = scanner.nextLine();
        if (resposta1.equalsIgnoreCase("s")) responstasPositivas++;

        System.out.println("Esteve no local do crime? (s/n)");
        String resposta2 = scanner.nextLine();
        if (resposta2.equalsIgnoreCase("s")) responstasPositivas++;

        System.out.println("Mora perto da vítima? (s/n)");
        String resposta3 = scanner.nextLine();
        if (resposta3.equalsIgnoreCase("s")) responstasPositivas++;

        System.out.println("Devia para vítima? (s/n)");
        String resposta4 = scanner.nextLine();
        if (resposta4.equalsIgnoreCase("s")) responstasPositivas++;

        System.out.println("Já trabalhou com a vítima? (s/n)");
        String resposta5 = scanner.nextLine();
        if (resposta5.equalsIgnoreCase("s")) responstasPositivas++;

        // Clasificação

        String classificacao;

        switch (responstasPositivas) {
            case 2:
                classificacao = "Suspeita";
                break;
            case 3:
            case 4:
                classificacao = "Cúmplice";
                break;
            case 5:
                classificacao = "Assassina";
                break;
            default:
                classificacao = "Inocente";
        }

        System.out.println("Classificação: " + classificacao);

        scanner.close();

    }
}
