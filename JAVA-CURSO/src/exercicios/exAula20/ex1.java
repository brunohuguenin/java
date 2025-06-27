package exercicios.exAula20;

import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] matriz = new int[4][4];

        int maior = -1, linha = 0, coluna = 0;
        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j< matriz.length; j++) {
                matriz[i][j] = random.nextInt(100);
                System.out.print("  " + matriz[i][j]);
                if(maior < matriz[i][j]) {
                    maior = matriz[i][j];
                    linha = i + 1;
                    coluna = j + 1;
                }
            }
            System.out.println();
        }
        System.out.printf("\nO maior valor da Matriz é %d, na %dª linha e na %dª coluna", maior, linha, coluna);
    }
}
