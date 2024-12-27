package aulas.aula20;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alunos = new String[4];
        double[][] notasAlunos = new double[4][4];

        System.out.println("Informe o nome de 4 alunos e suas respectivas 4 notas do bimestre:");

        // Lê os nomes e as notas dos alunos
        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite o nome do aluno %d: ", i + 1);
            alunos[i] = scanner.nextLine();

            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.printf("Digite a nota %d do aluno %s: ", j + 1, alunos[i]);
                notasAlunos[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Consome o restante da linha
        }

        System.out.println("\nA média para ser aprovado no Bimestre é 7.5");
        System.out.println("No primeiro Bimestre, os alunos obtiveram as seguintes notas e status:");

        // Calcula e exibe as notas e o status de cada aluno
        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Aluno %s: ", alunos[i]);
            double soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.printf("%.2f ", notasAlunos[i][j]);
                soma += notasAlunos[i][j];
            }
            double media = soma / notasAlunos[i].length;
            if (media >= 7.5) {
                System.out.printf("- APROVADO (Média: %.2f)\n", media);
            } else {
                System.out.printf("- REPROVADO (Média: %.2f)\n", media);
            }
        }

        scanner.close();
    }
}
