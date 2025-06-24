package aulas.aula69;

import aulas.aula68.MinhaThreadRunnable;

public class Teste3 {

    public static void main(String[] args) throws InterruptedException {
        MinhaThreadRunnable thrad1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thrad2 = new MinhaThreadRunnable("#2", 700);
        MinhaThreadRunnable thrad3 = new MinhaThreadRunnable("#3", 900);

        Thread t1 = new Thread(thrad1);
        Thread t2 = new Thread(thrad2);
        Thread t3 = new Thread(thrad3);

        t1.start();
//        t1.join(200);

        t2.start();
//        t2.join(200);


        t3.start();
//        t3.join(200);

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Programa finalizado!!");
    }
}
