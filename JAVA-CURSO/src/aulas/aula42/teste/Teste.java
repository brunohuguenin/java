package aulas.aula42.teste;

import aulas.aula42.dominio.Aluno;
import aulas.aula42.dominio.Constantes;
import aulas.aula42.dominio.Pessoa;
import aulas.aula42.dominio.Professor;

public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
       // Pessoa aluno = new Aluno();
       // Pessoa professor = new Professor();

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // exemplo 02

        System.out.println(Constantes.URL_BLOG);
        //Constantes.URL_BLOG = "www.github.com/brunohuguenin";

        System.out.println(Constantes.URL_BLOG);
    }
}
