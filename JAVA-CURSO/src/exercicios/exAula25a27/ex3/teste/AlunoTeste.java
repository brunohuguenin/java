package exercicios.exAula25a27.ex3.teste;

import exercicios.exAula25a27.ex3.main.Aluno;

import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scan.nextLine();

        System.out.println("Digite o número da matrícula: ");
        aluno.matricula = scan.nextInt();
        scan.nextLine();


        for (int i=0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.nomeDisciplinas[i] = scan.nextLine();
        }


        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina: " + aluno.nomeDisciplinas[i]);
            for (int j=0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - Aprovado");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - Reprovado");
            }
        }
    }
}
