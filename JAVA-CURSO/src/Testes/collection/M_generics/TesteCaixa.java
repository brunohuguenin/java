package Testes.collection.M_generics;

public class TesteCaixa {
    public static void main(String[] args) {
        Caixa<Produto> caixaProduto = new Caixa<>();
        caixaProduto.guardar(new Produto("Notebook", 4500.00));

        Produto p = caixaProduto.abrir();
        System.out.println("Conteúdo da caixa: " + p);

        Caixa<String> caixaMensagem = new Caixa<>();
        caixaMensagem.guardar("Valeu, Natalino!");
        System.out.println("Mensagem: " + caixaMensagem.abrir());

        Caixa<Integer> senhaCaixa = new Caixa<>();
        senhaCaixa.guardar(40028922);
        System.out.println("Senha guardada: " + senhaCaixa.abrir());
    }
}
