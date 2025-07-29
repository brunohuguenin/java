package aulasDevDojo.aula220a228.al224;

public class ThreadsAccountTeste01 implements Runnable{
    private Account account = new Account();
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
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("DEU RED, PARCEIRO");
            }
        }
    }

    private void withdrawal (int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta R$: " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro na para " + getThreadName() + " efetuar o saque " + account.getBalance());
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }


}
