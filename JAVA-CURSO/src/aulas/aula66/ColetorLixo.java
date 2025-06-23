package aulas.aula66;

import aulas.aula61.dominio.Contato;

public class ColetorLixo {

    public static void obterMemoriaUsda() {

        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime(); // singleton

        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);

    }

    public static void main(String[] args) {

        Contato[] contatos = new Contato[10000];
        Contato contato;

        for (int i=0; i< contatos.length; i++) {
            contato = new Contato("Contato" + i, "1234-56789", "contato" + i + "@gmail.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos criados");
        obterMemoriaUsda();

        contatos = null;
        //Runtime.getRuntime().runFinalization();

        System.out.println("Contatos removidos da memória");
        obterMemoriaUsda();
    }
}
