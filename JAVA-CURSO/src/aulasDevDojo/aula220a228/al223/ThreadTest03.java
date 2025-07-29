package aulasDevDojo.aula220a228.al223;

class ThreadExampleRunnable implements Runnable{
    private final String c;

    ThreadExampleRunnable(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i=0; i < 300; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            Thread.yield();
        }

    }
}


public class ThreadTest03 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadExampleRunnable("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable("ME"));

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
//        t1.join();
        t2.start();

    }
}
