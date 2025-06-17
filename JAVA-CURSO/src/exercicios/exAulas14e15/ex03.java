package exercicios.exAulas14e15;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner caractere = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = caractere.next();

//           O problema no seu código ocorre porque, em Java,
//           o operador == para comparar strings verifica se as
//           referências das strings apontam para o mesmo objeto
//           na memória, e não se os valores das strings são iguais.
//           Para comparar o conteúdo de strings, você deve usar o método
//           .equals() ou .equalsIgnoreCase().

          // O ideal era usar assim:
           if (letra.equals("f") || letra.equals("F")) {
                System.out.println("Feminino");
           } else if (letra.equals("m") || letra.equals("M")) {
                System.out.println("Masculino");
           } else {
               System.out.println("Sexo inválido");
           }



    }
}
