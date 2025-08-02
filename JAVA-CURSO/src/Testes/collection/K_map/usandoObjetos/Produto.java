package Testes.collection.K_map.usandoObjetos;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionarQuantidade(int qtt) {
        this.quantidade += qtt;
    }

    public void removerQuantidade(int qtt) {
        this.quantidade = Math.max(0, this.quantidade - qtt);
    }

    public void aumentarQuantidade(int qtt) {
        this.quantidade = Math.max(0, this.quantidade + qtt);
    }

    @Override
    public String toString() {
        return String.format("Produto: %s  |  Quantidade: %d  | Preço R$%.2f", nome, quantidade, preco);
    }
}
