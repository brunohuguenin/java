package exercicios.exAula14e15;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome do aluno e em seguida as notas do bimestre");
        System.out.print("NOME: ");
        String nome = scan.next();

        System.out.print("1ª NOTA: ");
        double nota1 = scan.nextDouble();

        System.out.print("2ª NOTA: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.printf("O aluno %s obteve a seguinte média %.2f e por isso está APROVADO COM DISTINÇÃO!!", nome, media);
        } else if (media >= 7 && media < 10) {
            System.out.printf("O aluno %s obteve a seguinte média %.2f e por isso está aprovado.", nome, media);
        } else if (media < 7) {
            System.out.printf("O aluno %s obteve a seguinte média %.2f e por isso está reprovado.", nome, media);
        } else {
            System.out.println("Nota Inválida");
        }
    }
}
