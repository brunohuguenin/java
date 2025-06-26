package exercicios.exAula19;

import java.util.Random;

public class ex19 {
    public static void main(String[] args) {

        Random random = new Random();
        String[] alunos = {
                "Petr Cech", "Lampard", "Ramires",
                "Gerrad", "Ballack", "Drogba", "Terry",
                "Ashley Cole", "D.Luiz", "Hazard"
        };

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];

        for (int i=0; i< nota1.length; i++) {
            nota1[i] = random.nextDouble(100);
            nota2[i] = random.nextDouble(100);
            result[i] = (nota1[i] + nota2[i]) / 2;
        }

        for (int i=0; i< nota1.length; i++) {
            if (result[i] >= 70) {
                System.out.printf("\nO aluno %s foi APROVADO com média %.2f. Parabéns!!", alunos[i], result[i]);
            } else {
                System.out.printf("\nO aluno %s foi reprovado com média %.2f.", alunos[i], result[i]);
            }
        }

        System.out.println();
    }
}
