package aulas.aula40.teste;

import aulas.aula40.dominio.Aluno;
import aulas.aula40.dominio.Pessoa;
import aulas.aula40.dominio.Professor;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua Logo Ali, nº 95");
        aluno.setEndereco("Rua Quase Lá, nº 886");
        professor.setEndereco("Rua Tá Perto, nº 13");

        System.out.println("A pessoa mora em " + pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
}
