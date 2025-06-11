package aulas.aula35.dominio;

public class Recursao {

    public static int fatorialNaoRecursivo(int num) {
        if (num == 0) {
            return 1;
        }

        int total = num;

        for (int i = num - 1; i > 1; i--) {
            System.out.printf("%d x %d = %d\n", total, i , total * i);
            total = total * i;
        }

        return total;
    }

    public static int fatorialRecursivo(int num) {
        if (num == 0) {
            return  1;
        }
        return num * fatorialRecursivo(num - 1);
    }
}
