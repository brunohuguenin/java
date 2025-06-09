package aulas.aula13;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int resultado = 17 + 33;
        System.out.println("Resultado: " + resultado);

        resultado = resultado - 19;
        System.out.println("Novo resultado: " + resultado);

        resultado = resultado * 2;
        System.out.println("Novo resultado: " + resultado);

        resultado = resultado / 3;
        System.out.println("Novo resultado: " + resultado);

        resultado = resultado + 13;
        System.out.println("Novo resultado: " + resultado);

        resultado = resultado % 4;
        System.out.println("Novo resultado: " + resultado);

        int a = 20, b = 7;
        System.out.println("Divisão, usando o INT, de 20 e 7 = " + (a / b));

        float c = 20, d = 7;
        System.out.println("Divisão, usando o DOUBLE, de 20 e 7 = " + (c / d));
    }
}
