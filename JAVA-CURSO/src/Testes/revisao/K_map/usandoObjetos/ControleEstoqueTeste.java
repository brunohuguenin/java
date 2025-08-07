package Testes.revisao.K_map.usandoObjetos;

import java.util.Scanner;

public class ControleEstoqueTeste {
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU ESTOQUE =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Consultar produto");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Listar produtos");
            System.out.println("5 - Alterar preço do produto");
            System.out.println("6 - Diminuir quantidade do produto");
            System.out.println("7 - Aumentar quantidade do produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Nome do produto:");
                    String nomeProduto = scanner.nextLine();

                    System.out.println("Quantidade:");
                    int quantidadeProduto = scanner.nextInt();

                    System.out.println("Preço R$:");
                    double precoProduto = scanner.nextDouble();

                    estoqueProduto.adicionarProduto(nomeProduto, quantidadeProduto, precoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Nome do produto:");
                    String nomeConsulta = scanner.nextLine();

                    if (estoqueProduto.existeProduto(nomeConsulta)) {
                        System.out.println(estoqueProduto.consultarProduto(nomeConsulta));
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Nome do produto para remover:");
                    String produtoRemovido = scanner.nextLine();
                    if (estoqueProduto.existeProduto(produtoRemovido)) {
                        estoqueProduto.removerProduto(produtoRemovido);
                        System.out.println("Produto removido.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    estoqueProduto.listarProduto();
                    break;
                case 5:
                    System.out.println("Nome do produto:");
                    String nomeAlterarPreco = scanner.nextLine();

                    if (estoqueProduto.existeProduto(nomeAlterarPreco)) {
                        System.out.println("Novo preço R$:");
                        double novoPreco = scanner.nextDouble();

                        estoqueProduto.consultarProduto(nomeAlterarPreco).setPreco(novoPreco);
                        System.out.println("Preço atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Nome do produto:");
                    String nomeAltQtt = scanner.nextLine();

                    if (estoqueProduto.existeProduto(nomeAltQtt)) {
                        System.out.print("Quantidade a remover: ");
                        int quantRemover = scanner.nextInt();
                        scanner.nextLine();

                        estoqueProduto.consultarProduto(nomeAltQtt).removerQuantidade(quantRemover);
                        System.out.println("Quantidade removida com sucesso.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }

                    break;
                case 7:
                    System.out.println("Nome do produto:");
                    String nomeAumQtt = scanner.nextLine();

                    System.out.print("Quantidade a aumentar: ");
                    int novaQtt = scanner.nextInt();
                    scanner.nextLine();

                    if (estoqueProduto.existeProduto(nomeAumQtt)) {
                        estoqueProduto.consultarProduto(nomeAumQtt).aumentarQuantidade(novaQtt);
                        System.out.println("Quantidade aumentada com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                default:
                    System.out.println("Tentativa inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
