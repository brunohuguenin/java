package aulas.aula62.varargsComClasse;

public class Carrinho {
    public static double calcularTotal(Produto... produtos) {
        double total = 0;
        for (Produto p: produtos) {
            total += p.preco;
        }
        return total;
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno", 9.99);
        Produto p2 = new Produto("Caneta", 1.99);
        Produto p3 = new Produto("Lápis", 0.50);

        double allPrice = calcularTotal(p1, p2, p3);
        System.out.printf("Total da compra R$ %.2f\n", allPrice);

    }
}
