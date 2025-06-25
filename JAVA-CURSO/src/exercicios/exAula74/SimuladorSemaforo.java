package exercicios.exAula74;

public class SimuladorSemaforo {
    public static void main(String[] args) {

        ThreadsSemaforo semaforo = new ThreadsSemaforo();

        for (int i=0; i<10; i++) {
            System.out.println(semaforo.getCor());
            semaforo.esperaCorMudar();
        }

        semaforo.desligarSemaforo();
    }
}
