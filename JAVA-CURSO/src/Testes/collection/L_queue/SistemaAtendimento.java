package Testes.collection.L_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class SistemaAtendimento {
    public static void main(String[] args) {
        Queue<Cliente> filaAtendimento = new PriorityQueue<>();

        filaAtendimento.offer(new Cliente("Tobi", 3));
        filaAtendimento.offer(new Cliente("Deidara", 5));
        filaAtendimento.offer(new Cliente("Itachi", 2));
        filaAtendimento.offer(new Cliente("Hidan", 1));
        filaAtendimento.offer(new Cliente("Sassori", 4));

        System.out.println("---- INICIO DO ATENDIMENTO ----");
        while (!filaAtendimento.isEmpty()) {
            Cliente cliente = filaAtendimento.poll();
            System.out.println("Atendendo: " + cliente);
        }
    }
}
