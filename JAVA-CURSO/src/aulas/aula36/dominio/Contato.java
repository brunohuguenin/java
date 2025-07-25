package aulas.aula36.dominio;

public class Contato {
    private String nome;
    private Endereco endereco;
    private Telefone[] telefones;

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
}
