package aulas.aula61.gpt;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jubileuçow");

        System.out.println("Antes: " + pessoa.nome);

        TesteReferencia.alterarNome(pessoa);

        System.out.println("Depois: " + pessoa.nome);
    }
}
