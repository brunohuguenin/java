package aulas.aula20;

public class Matriz3D {
    public static void main(String[] args) {
        // Declaração de uma matriz tridimensional 3x3x3
        int[][][] matriz3D = new int[3][3][3];

        // Preenchendo a matriz com valores
        int valor = 1;
        for (int i = 0; i < matriz3D.length; i++) { // Dimensão 1
            for (int j = 0; j < matriz3D[i].length; j++) { // Dimensão 2
                for (int k = 0; k < matriz3D[i][j].length; k++) { // Dimensão 3
                    matriz3D[i][j][k] = valor++;
                }
            }
        }

        // Exibindo os valores da matriz
        System.out.println("Conteúdo da matriz 3D:");
        for (int i = 0; i < matriz3D.length; i++) {
            for (int j = 0; j < matriz3D[i].length; j++) {
                for (int k = 0; k < matriz3D[i][j].length; k++) {
                    System.out.printf("matriz3D[%d][%d][%d] = %d\n", i, j, k, matriz3D[i][j][k]);
                }
            }
        }
    }
}
