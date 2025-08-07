package Testes.revisao.K_map;

import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU ESTOQUE =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Consultar produto");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do produto: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.println("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    estoque.adicionarProduto(nomeAdicionar, quantidade);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Nome do produto para consulta: ");
                    String nomeConsulta = scanner.nextLine();
                    if (estoque.existeProduto(nomeConsulta)) {
                        System.out.println("Quantidade em estoque: " + estoque.consultarQuantidade(nomeConsulta));
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Nome do produto para remover: ");
                    String nomeRemover = scanner.nextLine();
                    if (estoque.existeProduto(nomeRemover)) {
                        estoque.removerProduto(nomeRemover);
                        System.out.println("Produto removido com sucesso.");
                        break;
                    }
                case 4:
                    estoque.lisarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }


        } while (opcao != 0);

        scanner.close();
    }
}
