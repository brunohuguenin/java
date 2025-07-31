package Testes.collection.E_linkedList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class FilaDeAtendimento  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        int opcao;

        do {
            System.out.println("\n--- Fila de Atendimento ---");
            System.out.println("1. Adicionar pessoa à fila");
            System.out.println("2. Ver próxima pessoa");
            System.out.println("3. Atender pessoa");
            System.out.println("4. Mostrar toda a fila");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    fila.add(nome);
                    System.out.println(nome + " foi adicionado(a) à fila.");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia.");
                    } else {
                        System.out.println("Próximo da fila: " + fila.peek());
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia.");
                    } else {
                        String atendido = fila.poll();
                        System.out.println(atendido + " foi atendido(a).");
                    }
                    break;

                case 4:
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia.");
                    } else {
                        System.out.println("Fila atual: " + fila);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
