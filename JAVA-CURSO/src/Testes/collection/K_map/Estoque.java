package Testes.collection.K_map;

import javax.swing.plaf.PanelUI;
import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Integer> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(String nome, int quantidade) {
        produtos.put(nome, produtos.getOrDefault(nome, 0) + quantidade);
    }

    public void removerProduto(String nome) {
        produtos.remove(nome);
    }

    public boolean existeProduto(String nome) {
        return produtos.containsKey(nome);
    }

    public int consultarQuantidade(String nome) {
        return produtos.getOrDefault(nome, 0);
    }

    public void lisarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio");
            return;
        }

        System.out.println("Estoue atual: ");
        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + "        | Quantidade: " + entry.getValue());
        }
    }

}
