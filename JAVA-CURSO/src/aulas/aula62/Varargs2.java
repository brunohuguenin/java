package aulas.aula62;

public class Varargs2 {
    public static void main(String[] args) {
        System.out.printf("Média 1: %.2f%n", calcularMedia(8.6, 9.7, 6.4, 7.0));

    }

    public static double calcularMedia(double... notas){
        if (notas.length == 0) return 0;

        double soma = 0;

        for (double nota : notas) soma += nota;
        return soma / notas.length;
    }
}
