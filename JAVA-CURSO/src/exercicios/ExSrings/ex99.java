package exercicios.ExSrings;

public class ex99 {
//    Escreva um programa Java para retornar uma string atualizada usando todos os caracteres da posição par de uma determinada string.
//
//    Saída de exemplo:
//
//    A string fornecida é: w3resource.com
//    A nova string é: wrsuc.o

    public static void main(String[] args) {
        String palavra = "Flamengo.campeao.mundial";

        System.out.println("A palavra original é: " + palavra);
        System.out.println("A nova palavra é: " + crtParStrng(palavra));
    }

    public static String crtParStrng(String palavra) {
        int len = palavra.length();
        String stringFinal = "";

        for (int i=0; i<len; i = i+2) {
            stringFinal += palavra.charAt(i);
        }

        return  stringFinal;
    }
}
