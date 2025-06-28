package exercicios.exAula20;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] matriz = new char[3][3];
        preencherAmatriz(matriz);

        char jogadorAtual = 'X';
        boolean jogadorAtivo = true;

        while (jogadorAtivo) {
            imprimirMatriz(matriz);
            System.out.println("Jogador " + jogadorAtual + ", faça sua jogada (linha e coluna de 1 a 3: ");
            int linha = scan.nextInt() -1;
            int coluna = scan.nextInt() -1;

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posição inválida. Tente novamente.");
                continue;
            }

            if (matriz[linha][coluna] != ' ') {
                System.out.println("Casa ocupada. Escolha outra.");
                continue;
            }

            matriz[linha][coluna] = jogadorAtual;

            if(verificarVitoria(matriz, jogadorAtual)) {
                imprimirMatriz(matriz);
                System.out.println("Jogadoor " + jogadorAtual + ", venceu!");
                jogadorAtivo = false;
            } else if (verificarEmpate(matriz)) {
                imprimirMatriz(matriz);
                System.out.println("Empate!");
                jogadorAtivo = false;
            } else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        scan.close();

    }


    // 1º Preenchendo a o tabuleiro
    public static void preencherAmatriz(char[][] matriz) {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                matriz[i][j] = ' ';
            }
        }
    }

    // 2º Imprimindo o tabuleiro
    public static void imprimirMatriz(char[][] matriz) {
        System.out.println("\n== Tabuleiro ==");
        for (int i=0; i<3; i++) {
            System.out.print(" ");
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
        System.out.println();
    }

    // 3º Verificando vitória
    public static boolean verificarVitoria(char[][] tab, char jogador) {

        // verificando linhas e colunas
        for (int i=0; i<3; i++) {
            if ((tab[i][0] == jogador && tab[i][1] == jogador && tab[i][2] == jogador) ||
                    (tab[0][i] == jogador && tab[1][i] == jogador && tab[2][i] == jogador
            )) {
                return true;
            }

            // verificando diagonais
            if ((tab[0][0] == jogador && tab[1][1] == jogador && tab[2][2] == jogador) ||
                    (tab[0][2] == jogador && tab[1][1] == jogador && tab[2][0] == jogador
                    )) {
                return true;
            }
        }

        return false;
    }

    // 4º Verificando empate
    public static boolean verificarEmpate(char[][] tab) {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (tab[i][j] == ' ') return false;
            }
        }

        return true;
    }

}
