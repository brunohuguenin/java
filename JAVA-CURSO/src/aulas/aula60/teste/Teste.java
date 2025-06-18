package aulas.aula60.teste;

import aulas.aula60.dominio.EscopoVariavel;

public class Teste {
    public static void main(String[] args) {
        EscopoVariavel escopo = new EscopoVariavel();
        escopo.setValor(10);

        System.out.println(escopo.getValor());

        System.out.println(escopo.caucularValor(20));

        System.out.println(escopo.getValor());

        System.out.println(escopo.teste());

        System.out.println(escopo.getValor());
    }
}
