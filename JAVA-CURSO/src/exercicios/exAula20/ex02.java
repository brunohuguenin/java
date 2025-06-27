package exercicios.exAula20;

import java.util.Random;

public class ex02 {
    public static void main(String[] args) {

        Random random = new Random();
        int[][] matriz = new int[10][10];

        for (int i=0; i< matriz.length; i++) {
            for (int j=0; j< matriz.length; j++) {
                matriz[i][j] = random.nextInt(89) + 10;
                System.out.print("  " + matriz[i][j]);
            }
            System.out.println();
        }

        int maiorLinha5 = matriz[4][0];
        int menorLinha5 = matriz[4][0];
        int maiorColuna7 = matriz[0][6];
        int menorColuna7 = matriz[0][6];

        System.out.print("\nValores da linha 5: ");
        for (int c = 0; c < 10; c++) {
            System.out.print(matriz[4][c] + " ");
            if (matriz[4][c] > maiorLinha5) {
                maiorLinha5 = matriz[4][c];
            }
            if (matriz[4][c] < menorLinha5) {
                menorLinha5 = matriz[4][c];
            }
        }
        System.out.println();

        System.out.print("\nValores da coluna 7: ");
        for (int l = 0; l < 10; l++) {
            System.out.print(matriz[l][6] + " ");
            if (matriz[l][6] > maiorColuna7) {
                maiorColuna7 = matriz[l][6];
            }
            if (matriz[l][6] < menorColuna7) {
                menorColuna7 = matriz[l][6];
            }
        }
        System.out.println();

        System.out.printf("\nO maior e menor valor da linha 5 respectivamente são %d e %d\n", maiorLinha5, menorLinha5);
        System.out.printf("O maior e menor valor da coluna 7 respectivamente são %d e %d\n", maiorColuna7, menorColuna7);

    }
}
