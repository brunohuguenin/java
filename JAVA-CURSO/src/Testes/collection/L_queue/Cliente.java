package Testes.collection.L_queue;

public class Cliente implements Comparable<Cliente>{
    private String nome;
    private int prioridade;

    public Cliente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public int compareTo(Cliente outro) {
        return Integer.compare(this.prioridade, outro.prioridade);
    }

    @Override
    public String toString() {
        return nome + " - Prioridade: " + prioridade;
    }
}
