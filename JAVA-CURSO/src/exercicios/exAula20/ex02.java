package exercicios.exAula20;

import java.util.Random;

public class ex02 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }

        int maiorLinha5 = matriz[5][0];
        int menorLinha5 = matriz[5][0];

        for (int j = 0; j < matriz[5].length; j++) {
            if (matriz[5][j] > maiorLinha5) {
                maiorLinha5 = matriz[5][j];
            }
            if (matriz[5][j] < menorLinha5) {
                menorLinha5 = matriz[5][j];
            }
        }

        int maiorColuna7 = matriz[0][7];
        int menorColuna7 = matriz[0][7];

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][7] > maiorColuna7) {
                maiorColuna7 = matriz[i][7];
            }
            if (matriz[i][7] < menorColuna7) {
                menorColuna7 = matriz[i][7];
            }
        }


        System.out.printf("O maior número da linha 5 é %d e o menor é %d\n", maiorLinha5, menorLinha5);
        System.out.printf("O maior número da coluna 7 é %d e o menor é %d\n", maiorColuna7, menorColuna7);

    }
}
