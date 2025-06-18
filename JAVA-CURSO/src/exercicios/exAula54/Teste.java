package exercicios.exAula54;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o primeiro valor: ");
        double x = scanner.nextDouble();
        System.out.print("Entre com o segundo valor: ");
        double y = scanner.nextDouble();

        for (CalculadoraEnum operacao : CalculadoraEnum.values()) {
            double resultado = operacao.executarOperacao(x, y);
            System.out.printf("%.1f %s %.1f = %.1f\n", x, operacao, y, resultado);
        }
    }
}
