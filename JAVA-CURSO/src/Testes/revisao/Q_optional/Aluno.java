package Testes.revisao.Q_optional;

public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    private String curso;

    public Aluno(String nome, int idade, double nota, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.curso = curso;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getNota() { return nota; }
    public String getCurso() { return curso; }

    @Override
    public String toString() {
        return nome + " - " + curso + " - Nota: " + nota;
    }
}
