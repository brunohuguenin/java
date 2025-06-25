package exercicios.exAula74;

public class ThreadsSemaforo implements Runnable{
    private CorSemaforo cor;
    private boolean parar;
    private boolean corMudou;

    public ThreadsSemaforo() {
        this.cor = CorSemaforo.VERMELHO;

        new Thread(this).start();
    }

    @Override
    public void run() {

        while (!parar) {
            try {
                switch (this.cor) {
                    case VERDE:
                        Thread.sleep(2000);
                        break;
                    case AMARELO:
                        Thread.sleep(3000);
                        break;
                    case VERMELHO:
                        Thread.sleep(1000);
                        break;
                    default:
                        break;
                }
                this.mudarCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void mudarCor() {
        switch (this.cor) {
            case VERDE:
                this.cor = CorSemaforo.AMARELO;
                break;
            case AMARELO:
                this.cor = CorSemaforo.VERMELHO;
                break;
            case VERMELHO:
                this.cor = CorSemaforo.VERDE;
                break;
            default:
                break;
        }

        this.corMudou = true;
        notify();
    }

    public synchronized void esperaCorMudar() {
        while (!this.corMudou) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.corMudou = false;
    }


    public synchronized void desligarSemaforo() {
        this.parar = true;
    }

    public CorSemaforo getCor() {
        return cor;
    }
}
