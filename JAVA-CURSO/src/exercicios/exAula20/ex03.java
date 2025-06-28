package exercicios.exAula20;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int l=0; l< matriz.length; l++) {
            for (int c=0; c< matriz.length; c++) {
                System.out.printf("Insira o valor para preencher a linha %d e coluna %d: ", l, c);
                matriz[l][c] = scan.nextInt();
            }
        }

        int qtdNumerosPares = 0;
        int qtdNumerosImpares = 0;

        System.out.printf("\n========= MATRIZ 3X3 ========\n");
        for (int l=0; l< matriz.length; l++) {
            for (int c=0; c< matriz.length; c++) {
                System.out.print(" " + matriz[l][c]);

                if (matriz[l][c] % 2 == 0) qtdNumerosPares++;
                if (matriz[l][c] % 2 == 1) qtdNumerosImpares++;

            }
            System.out.println();
        }
        System.out.println();

        System.out.printf("Aquantidade de números pares na matriz é igual a %d\n", qtdNumerosPares);
        System.out.printf("Aquantidade de números ímpares na matriz é igual a %d\n", qtdNumerosImpares);



    }
}
