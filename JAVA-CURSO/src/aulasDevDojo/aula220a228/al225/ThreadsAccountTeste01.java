package aulasDevDojo.aula220a228.al225;

public class ThreadsAccountTeste01 implements Runnable{
    private final Account account = new Account();
    public static void main(String[] args) {
        ThreadsAccountTeste01 threadsAccountTeste01 = new ThreadsAccountTeste01();
        Thread t1 = new Thread(threadsAccountTeste01, "Satoro Gojo");
        Thread t2 = new Thread(threadsAccountTeste01, "Madara");

        t1.start();
        t2.start();
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                withdrawal(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (account.getBalance() < 0) {
                System.out.println("DEU RED, PARCEIRO");
            }
        }
    }

    private  void withdrawal (int amount) throws InterruptedException {

        System.out.println(getThreadName() + " ##  fora do synchronized");

        synchronized (account) {
            System.out.println(getThreadName() + " **  dentro do synchronized");

            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta R$: " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro na para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }


}
