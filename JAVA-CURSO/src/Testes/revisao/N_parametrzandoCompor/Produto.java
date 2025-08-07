package Testes.revisao.N_parametrzandoCompor;

public class Produto {
    private String nome;
    private String categgoria;
    private double preco;

    public Produto(String nome, String categgoria, double preco) {
        this.nome = nome;
        this.categgoria = categgoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCateggoria() {
        return categgoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - R$%.2f", nome, categgoria, preco);
    }
}
