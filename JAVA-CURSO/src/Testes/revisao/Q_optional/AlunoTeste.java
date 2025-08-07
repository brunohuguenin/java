package Testes.revisao.Q_optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AlunoTeste {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Ana", 20, 8.5, "Engenharia"),
                new Aluno("Carlos", 19, 9.3, "Engenharia"),
                new Aluno("Fernanda", 23, 7.8, "Engenharia")
        );

        Optional<Aluno> melhor = encontrarMelhorAluno(alunos);

        if (melhor.isPresent()) {
            Aluno aluno = melhor.get();
            System.out.println("Melhor aluno: " + aluno.getNome() + " - Nota: " + aluno.getNota());
        } else {
            System.out.println("Lista vazia!");
        }

    }

    public static Optional<Aluno> encontrarMelhorAluno(List<Aluno> alunos) {
        return alunos.stream().max(Comparator.comparingDouble(Aluno::getNota));
    }
}
