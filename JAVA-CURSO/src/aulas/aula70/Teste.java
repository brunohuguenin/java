package aulas.aula70;

import aulas.aula68.MinhaThreadRunnable;

public class Teste {
    public static void main(String[] args) {
        MinhaThreadRunnable tread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable tread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable tread3 = new MinhaThreadRunnable("#3", 500);


        Thread t1 = new Thread(tread1);
        Thread t2 = new Thread(tread2);
        Thread t3 = new Thread(tread3);

//        t1.setPriority(1);
//        t2.setPriority(10);
//        t3.setPriority(5);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }

}
