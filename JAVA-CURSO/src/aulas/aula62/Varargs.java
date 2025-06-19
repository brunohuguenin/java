package aulas.aula62;

public class Varargs {
    public static void main(String[] args) {
        saudar("Olá", "Clemilda", "Neide", "Zuleide", "Terezinha");
    }


    public static void saudar(String saudacao, String... nomes){
        for (String nome : nomes) {
            System.out.println((saudacao + ", " + nome + "!"));
        }
    }

}


