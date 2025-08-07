package Testes.revisao.R_Strams.ex2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProdutoTeste {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 3500.00, "Eletrônicos"),
                new Produto("Celular", 2200.00, "Eletrônicos"),
                new Produto("Cafeteira", 300.00, "Eletrodomésticos"),
                new Produto("Liquidificador", 150.00, "Eletrodomésticos"),
                new Produto("Monitor", 900.00, "Eletrônicos"),
                new Produto("Sofá", 1500.00, "Móveis")
        );

        System.out.println("1 - Filtrar produtos com preço acima de R$ 1000,00");
        List<Produto> exercicio1 = produtos.stream().filter(preco -> preco.getPreco() > 1000)
                .toList();

        exercicio1.forEach(System.out::println);
        System.out.println("----------------------------");

        System.out.println("2 - Obter apenas os nomes dos produtos da categoria \"Eletrônicos\"");
        List<String> exercicio2 = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos"))
                .map(Produto::getNome).toList();

        exercicio2.forEach(System.out::println);
        System.out.println("----------------------------");


        System.out.println("3 - Verificar se todos os produtos custam mais de R$ 100");
        boolean exercicio3 = produtos.stream().allMatch(p -> p.getPreco() > 100.00);
        if (exercicio3) {
            System.out.println("Todos os produtos custam mais de R$ 100,00");
        } else {
            System.out.println("Nem todos os produtos custam mais de R$ 100,00");
        }
        System.out.println("----------------------------");

        System.out.println("4 - Verificar o preço médio dos produtos");
        OptionalDouble exercicio4 = produtos.stream().mapToDouble(Produto::getPreco).average();
        exercicio4.ifPresent(media -> System.out.println("Media dos produtos R$ " + media));
        System.out.println("----------------------------");

        System.out.println("5 - Agrupar por categoria");
        Map<String, List<Produto>> exercicio5 = produtos.stream().collect(Collectors.groupingBy(Produto::getCategoria));
        System.out.println(exercicio5);
        System.out.println("----------------------------");

        System.out.println("6 - Verificar qual é o produto mais barato");
        Optional<Produto> exercicio6 = produtos.stream().min(Comparator.comparing(Produto::getPreco));
        System.out.println("O produto mais barato é: " + exercicio6);
        System.out.println("----------------------------");

        System.out.println("7 - Nomes em maiúculo e ordenados");
        Stream<String> exercicio7 = produtos.stream().map(n -> n.getNome().toUpperCase()).sorted();
        exercicio7.forEach(System.out::print);
        System.out.println("----------------------------");

        System.out.println("8 - Listar produtos formatados assim: \"Notebook: R$3500.00\"");
        List<String> exercicio8 = produtos.stream()
                .map(p -> String.format("%s: R$ %.2f", p.getNome(), p.getPreco()))
                .collect(Collectors.toList());

        exercicio8.forEach(System.out::println);
        System.out.println("----------------------------");

        System.out.println("9 - Somar o preço total dos produtos da categoria \"Eletrodomésticos\"");
        double exercicio9 = produtos.stream().filter(p -> p.getCategoria().equals("Eletrodomésticos")).mapToDouble(Produto::getPreco).sum();
        System.out.println("A soma dos preços da categoria Eletrodoméstico é igual a R$ " + exercicio9);
        System.out.println("----------------------------");

        System.out.println("10 - Separar produtos acima de R$ 1000 e os demais (partitioningBy)");
        Map<Boolean, List<Produto>> exercicio10 = produtos.stream()
                .collect(Collectors.partitioningBy(p -> p.getPreco() > 1000.00));

        System.out.println(exercicio10);

    }
}
