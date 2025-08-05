package Testes.collection.R_Strams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PessoaTeste {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 25, "São Paulo"),
                new Pessoa("Bruno", 32, "Rio de Janeiro"),
                new Pessoa("Carlos", 45, "São Paulo"),
                new Pessoa("Diana", 28, "Belo Horizonte"),
                new Pessoa("Eduarda", 35, "Rio de Janeiro"),
                new Pessoa("Fernando", 22, "São Paulo")
        );

        System.out.println("1 - Obtenha uma lista com todas as pessoas com idade maior que 30");
        List<Pessoa> exercicio1 = pessoas.stream()
                .filter(idade -> idade.getIdade() > 30)
                .collect(Collectors.toList());

        exercicio1.forEach(System.out::println);
        System.out.println("------------------------------------------------");

        System.out.println("2 - Extrair nomes");
        List<String> exercicio2 = pessoas.stream()
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        exercicio2.forEach(System.out::println);
        System.out.println("------------------------------------------------");

        System.out.println("3 - Contar pessoas de São Paulo");
        long exercicio3 = pessoas.stream()
                .filter(c -> c.getCidade().equals("São Paulo"))
                .count();

        System.out.println(exercicio3 + " pessoas moram em São Paulo");
        System.out.println("------------------------------------------------");

        System.out.println("4 - Agrupar por cidade");
        Map<String, List<Pessoa>> exercicio4 = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCidade));

        exercicio4.forEach((cidade, pessoa) -> {
            System.out.println("Cidade de " + cidade + ": " + pessoa);
        });
        System.out.println("------------------------------------------------");

        System.out.println("5 - Pessoa mais velha");
        Optional<Pessoa> exercicio5 = pessoas.stream().max(Comparator.comparing(Pessoa::getIdade));
        System.out.println(exercicio5);
        System.out.println("------------------------------------------------");

        System.out.println("6 - Soma das idades");
        int exercicio6 = pessoas.stream().mapToInt(Pessoa::getIdade).sum();
        System.out.printf("A soma de todas as idades é igual a %d anos\n", exercicio6);

        System.out.println("------------------------------------------------");

        System.out.println("7 - Ordenar por idade (crescente)");
        List<Pessoa> exercicio7 = pessoas.stream().sorted(Comparator.comparing(Pessoa::getIdade)).collect(Collectors.toList());
        exercicio7.forEach(System.out::println);
        System.out.println("------------------------------------------------");

        System.out.println("9 - Lista única de cidades");
        List<String> exercicio9 = pessoas.stream().map(Pessoa::getCidade).distinct().collect(Collectors.toList());
        exercicio9.forEach(System.out::println);
    }
}
