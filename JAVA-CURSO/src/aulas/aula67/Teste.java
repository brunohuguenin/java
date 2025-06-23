package aulas.aula67;

public class Teste {
    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Thread #1", 1000);
        //thread.start();

        MinhaThread thread2 = new MinhaThread("Thread #2", 2200);
    }
}
