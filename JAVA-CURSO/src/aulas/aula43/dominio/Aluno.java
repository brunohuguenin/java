package aulas.aula43.dominio;

import java.util.Arrays;

public class Aluno {

    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno: ";
       // s += super.getEndereco();

        return  s;
    }

    public  void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }

//    public String toString() {
//        String s =  curso + "\n";
//
//        for (double nota : notas) {
//            s += nota + " ";
//        }
//        return s;
//    }


    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
