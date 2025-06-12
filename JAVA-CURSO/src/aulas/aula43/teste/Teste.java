package aulas.aula43.teste;

import aulas.aula43.dominio.Aluno;

public class Teste {
    public static void main(String[] args) {


        Aluno aluno = new Aluno();

        System.out.println();
        aluno.setCurso("Engenharia de Software");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "wafwe";
        String s2 = "wafwE";

        System.out.println(s1.equals(s2));


        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Ciência da Computação");
        double[] notas2 = {6, 7, 6, 5};
        aluno2.setNotas(notas2);

        System.out.println(aluno2);

        System.out.println(aluno.equals(aluno2));
    }
}
