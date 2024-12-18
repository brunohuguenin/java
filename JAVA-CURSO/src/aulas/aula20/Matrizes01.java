package aulas.aula20;

public class Matrizes01 {
    public static void main(String[] args) {
        double[][] notasAlunos = new double[4][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 6.7;
        notasAlunos[1][1] = 5;
        notasAlunos[1][2] = 7.5;
        notasAlunos[1][3] = 8.3;

        notasAlunos[2][0] = 9;
        notasAlunos[2][1] = 10;
        notasAlunos[2][2] = 7.2;
        notasAlunos[2][3] = 6;

        notasAlunos[3][0] = 4.89;
        notasAlunos[3][1] = 2.9;
        notasAlunos[3][2] = 10;
        notasAlunos[3][3] = 5.3;

        System.out.println("A média para ser aprovado no Bimestre é 7.5");
        System.out.println("No primeiro Bimestre, os alunos obtiveram as seguintes notas e status:");

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.printf("Aluno %d: ", i + 1);
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
    }
}

