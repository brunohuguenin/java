package aulas.aula45.teste;

import aulas.aula45.dominio.Aluno;
import aulas.aula45.dominio.Pessoa;
import aulas.aula45.dominio.Professor;

public class Teste2 {
    public static void main(String[] args) {
//        Object obj1 = obterString();
//        String s1 = (String) obj1;
//
//        Object obj2 = "Minha String";
//        String s2 = (String) obj2;

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();

        if (pessoa instanceof Pessoa) {
            System.out.println("é do tipo Pessoa");
        }
        if (pessoa instanceof Aluno) {
            System.out.println("é do tipo Pessoa");
        }else {
            System.out.println("pessoa não é do tipo Aluno");
        }

        if (prof instanceof Pessoa) {
            System.out.println("é do tipo Pessoa");
        }


    }

//    public static String obterString() {
//        return "Minha String";
//    }
}
