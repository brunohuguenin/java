package aulas.aula41.teste;

import aulas.aula41.dominio.Aluno;
import aulas.aula41.dominio.Pessoa;
import aulas.aula41.dominio.Professor;

public class Teste {
    public static void main(String[] args) {
       //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

       // pessoa.setEndereco("Rua Logo Ali, nº 95");
        aluno.setEndereco("\nRua Quase Lá, nº 886");
        professor.setEndereco("\n Rua Tá Perto, nº 13");

       // System.out.println(pessoa.obterEtiquetaEndereco());
       // System.out.println(aluno.obterEtiquetaEndereco());
       // System.out.println(professor.obterEtiquetaEndereco());

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
    }
}
