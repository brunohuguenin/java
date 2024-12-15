package aulas.aula17;

public class LoopFor {
    public static void main(String[] args) {


        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i: " + i);
        }
        */

        // Usando mais de uma Variável
        for (int i = 0, j = 10; i <= 10 && j >= 0; i++, j--) {
            System.out.printf("i = %d;  j = %d\n", i, j);
        }
    }
}
