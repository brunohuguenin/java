package Testes.revisao.R_Strams.ex3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlunoTeste {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Ana", 20, 8.5, "Engenharia"),
                new Aluno("Bruno", 22, 7.0, "Direito"),
                new Aluno("Carlos", 19, 9.1, "Engenharia"),
                new Aluno("Daniela", 21, 6.8, "Psicologia"),
                new Aluno("Eduardo", 24, 5.5, "Direito"),
                new Aluno("Fernanda", 23, 7.8, "Engenharia")
        );

        System.out.println("1 - Filtrar todos os alunos com nota maior ou igual a 7.");
        List<Aluno> ex1 = alunos.stream().filter(p -> p.getNota() >= 7).toList();
        ex1.forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        System.out.println("2 - Obter uma lista com apenas os nomes dos alunos do curso \"Engenharia\".");
        List<String> ex2 = alunos.stream().filter(al -> al.getCurso().equals("Engenharia"))
                .map(Aluno::getNome).toList();
        ex2.forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        System.out.println("3 - Verificar se existe algum aluno com nota inferior a 6.");
        boolean ex3 = alunos.stream().anyMatch(a -> a.getNota() < 6);
        System.out.println(ex3);
        System.out.println("--------------------------------------------------------");

        System.out.println("4 - Calcular a média das notas dos alunos do curso \"Direito\".");
        OptionalDouble ex4 = alunos.stream().filter(c -> c.getCurso().equals("Direito"))
                .mapToDouble(Aluno::getNota).average();
        System.out.println("A média das notas do curso de Direito é igual a " + ex4);
        System.out.println("--------------------------------------------------------");

        System.out.println("5 - Agrupar os alunos por curso.");
        Map<String, List<Aluno>> ex5 = alunos.stream().collect(Collectors.groupingBy(Aluno::getCurso));
        ex5.forEach((curso, listaAlunos) -> {
            String nomes = listaAlunos.stream()
                    .map(Aluno::getNome)
                    .collect(Collectors.joining(", ", "[", "]"));
            System.out.println(curso + ": " + nomes);
        });
        System.out.println("--------------------------------------------------------");

        System.out.println("6 - Encontrar o Aluno com maior nota");
        Optional<Aluno> ex6 = alunos.stream().max(Comparator.comparing(Aluno::getNota));
        System.out.println("O aluno com maior nota é o " + ex6);
        System.out.println("--------------------------------------------------------");

        System.out.println("7 - Gerar uma lista com os nomes dos alunos maiores de 21 anos, ordenados alfabeticamente.");
        List<String> ex7 = alunos.stream().filter(al -> al.getIdade() > 21).map(Aluno::getNome).sorted().toList();
        ex7.forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        System.out.println("8 - Criar uma lista formatada no estilo: \"Carlos (Engenharia): 9.1\"");
        Stream<String> ex8 = alunos.stream()
                .map(al -> String.format("%s (%s): %.2f", al.getNome(), al.getCurso(), al.getNota()));
        ex8.forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        System.out.println("9 - Contar quantos alunos há em cada curso.");
        Map<String, Long> ex9 = alunos.stream().collect(Collectors.groupingBy(Aluno::getCurso, Collectors.counting()));
        System.out.println(ex9);
        System.out.println("--------------------------------------------------------");

        System.out.println("10 - Usando partitioningBy, separar os alunos aprovados (nota >= 7) dos reprovados.");
        Map<Boolean, List<Aluno>> ex10 = alunos.stream()
                .collect(Collectors.partitioningBy(a -> a.getNota() >= 7));
        System.out.println("Reprovados: " +
                ex10.get(false).stream()
                        .map(Aluno::getNome)
                        .collect(Collectors.toList()));

        System.out.println("Aprovados: " +
                ex10.get(true).stream()
                        .map(Aluno::getNome)
                        .collect(Collectors.toList()));


    }
}
