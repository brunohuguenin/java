package exercicios.exAula20;

import java.util.Random;

public class ex01 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4]; // Cria a matriz 4x4
        Random random = new Random(); // Instância do gerador de números aleatórios

        // Preenchendo a matriz com valores aleatórios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(99); // Gera números aleatórios de 0 a 99
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz 4x4 com valores aleatórios:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d ", matriz[i][j]); // Formata os números para alinhamento
            }
            System.out.println();
        }

        // Encontrando o maior número e sua posição
        int maior = 0;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        // Exibindo o maior número e sua posição
        System.out.printf("\nO maior número da matriz é %d, localizado na linha %d, coluna %d.\n",
                maior, linhaMaior + 1, colunaMaior + 1);
    }

}
