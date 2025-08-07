package Testes.revisao.K_map.usandoObjetos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<String, Produto> produtos;

    public EstoqueProduto() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        if (produtos.containsKey(nome)) {
            produtos.get(nome).adicionarQuantidade(quantidade);
        } else  {
            produtos.put(nome, new Produto(nome, quantidade, preco));
        }
    }

    public void removerProduto(String nome) {
        produtos.remove(nome);
    }

    public boolean existeProduto(String nome) {
        return produtos.containsKey(nome);
    }

    public Produto consultarProduto(String nome) {
        return produtos.get(nome);
    }

    public void listarProduto() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else  {
            System.out.println("Estoque atual:");
            for (Produto p : produtos.values()) {
                System.out.println(p);
            }
        }
    }



}
