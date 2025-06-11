package aulas.aula35.teste;

import aulas.aula35.dominio.Recursao;

public class TesteRecursao {
    public static void main(String[] args) {
        int fatorialNR = Recursao.fatorialNaoRecursivo(6);
        System.out.printf("\nFatrorial NAO RECURSIVO: %d", fatorialNR);

        int fatorialR = Recursao.fatorialRecursivo(7);
        System.out.printf("\nFatrorial  RECURSIVO: %d", fatorialR);
    }
}
