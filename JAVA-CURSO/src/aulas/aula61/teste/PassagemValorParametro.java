package aulas.aula61.teste;

import aulas.aula61.dominio.Contato;

public class PassagemValorParametro {
    public static void main(String[] args) {
        Contato contato = new Contato("Contato 1", "1234-4567", "contato1@hotmail.com");
        int valor = 10;

        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorReferencia(valor, contato);

        System.out.println(contato);
        System.out.println(valor);

        // -----------------------------------------------------------
        testePassagemValorReferencia2(valor, contato);

        System.out.println(contato);
        System.out.println(valor);
    }

    private static void testePassagemValorReferencia(int valor, Contato contato) {
        int novoValor = valor + 50;
        valor = novoValor;

        contato = new Contato("Contato 2", "9874-6654", "contato2@gmail.com");
    }

    private static void testePassagemValorReferencia2(int valor, Contato contato) {
        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato"+novoValor);
    }


}
