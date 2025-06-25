package aulas.aula80;

public class Aula80 {
    public static void main(String[] args) {

        String teste = "Isso é um teste";

        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 15));

        String ola = "olá";
        String mundo = " mundo";
        String olaMundo = ola.concat(mundo);
        System.out.println(olaMundo);

        String ispacos = "i s p a ç o s";
        String espacos =  ispacos.replace("i", "e");
        String semEspacos = espacos.replaceAll(" ", "");

        System.out.println(ispacos);
        System.out.println(espacos);
        System.out.println(semEspacos);

        String nome = " meu nome é ";
        System.out.println(nome);
        System.out.println(nome.trim());
    }
}
