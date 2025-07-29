package aulasDevDojo.aula220a228.al228.service;

import aulasDevDojo.aula220a228.al228.main.Members;


public class EmailDeliveryService implements Runnable{

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails...");
        while (members.isOpen() || members.pendinEmails() > 0) {
            try {
                String email = members.retrievEmail();
                if (email == null) continue;
                System.out.println(threadName + " enviando email para " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou email com sucesso para " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todosos emails foram enviados com sucesso!");
    }
}
