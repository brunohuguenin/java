package Testes.revisao.F_sortingList;

import java.util.Objects;

public class Carros implements Comparable<Carros>{
    private Long id;
    private String Marca;
    private double preco;

    public Carros(Long id, String marca, double preco) {
        this.id = id;
        Marca = marca;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carros carros = (Carros) o;
        return Double.compare(preco, carros.preco) == 0 && Objects.equals(Marca, carros.Marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Marca, preco);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "id=" + id +
                ", Marca='" + Marca + '\'' +
                ", preco = R$" + preco +
                '}';
    }

    @Override
    public int compareTo(Carros outro) {
        //return getMarca().compareTo(outro.getMarca()); // exemplo do teste com TreeSet
        return Double.compare(getPreco(), outro.getPreco());
    }


}
