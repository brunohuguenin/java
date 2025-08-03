package Testes.collection.N_parametrzandoCompor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
          new Produto("Notebook", "Eletônico", 3500.00),
          new Produto("Mouse", "Acessório", 80.00),
          new Produto("Teclado", "Acessório", 120.00),
          new Produto("Smartphone", "Eletônico", 2500.00),
          new Produto("Caderno", "Papelaria", 20.00)
        );

        Predicate<Produto> caro = p -> p.getPreco() > 1000;
        System.out.println("== PRODUTOS CAROS ==");
        FiltroUtil.filtrar(produtos, caro).forEach(System.out::println);

        System.out.println("\n== ACESSÓRIOS BARATOS ==");
        Predicate<Produto> acessorioBarato = ac -> ac.getCateggoria().equals("Acessório");
        Predicate<Produto> barato = ac -> ac.getPreco() <= 100;
        FiltroUtil.filtrar(produtos, acessorioBarato.and(barato)).forEach(System.out::println);

        System.out.println("\n== NOME CONTÉM 'NOTE': ==");
        Predicate<Produto> contemNote = produto -> produto.getNome().toLowerCase().contains("note");
        FiltroUtil.filtrar(produtos, contemNote).forEach(System.out::println);
    }
}
