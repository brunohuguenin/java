package Testes.revisao.P_methodReference;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void apresentar() {
        System.out.println("Ola, meu nome é " + nome);
    }
}
