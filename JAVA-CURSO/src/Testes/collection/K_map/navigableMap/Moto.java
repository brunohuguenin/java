package Testes.collection.K_map.navigableMap;


import java.util.Objects;

public class Moto implements Comparable<Moto> {
    private int id;
    private String nome;
    private double preco;

    public Moto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


    @Override
    public int compareTo(Moto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return id == moto.id && Double.compare(preco, moto.preco) == 0 && Objects.equals(nome, moto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return nome + " (R$" + preco + ")";
    }
}
