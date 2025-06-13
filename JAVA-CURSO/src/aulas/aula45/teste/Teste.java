package aulas.aula45.teste;

import aulas.aula45.dominio.Aluno;
import aulas.aula45.dominio.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; // upcasting

        Pessoa aluno2 = (Pessoa) new Aluno();

        Pessoa aluno3 = (Pessoa) new Aluno();
        Aluno aluno4 = (Aluno) aluno3;

    }



}
