package exercicios.exAulas25a27.ex3.main;

public class Aluno {
    public String nome;
    public int matricula;
    public String nomeCurso;
    public double [][] notasDisciplinas = new double[3][4];
    public String [] nomeDisciplinas = new String[3];
    public int notaAprovado = 7;

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina: " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice) {
        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }
}
