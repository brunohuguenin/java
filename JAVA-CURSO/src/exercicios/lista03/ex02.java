package exercicios.lista03;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner login = new Scanner(System.in);
        String usuario, senha;

        while (true) {
            System.out.print("Digite o nome do usuário: ");
            usuario = login.nextLine();

            System.out.print("Digite a senha: ");
            senha = login.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("Erro!!\nA senha não pode ser igual ao nome do usuário\nTente novamente");
            } else {
                System.out.println("Usuário cadrastado com sucesso!");
                break;
            }
        }

        login.close();
    }
}
