package JavaComLoianeGroner.Aulas.aula63;

public class ExemploPrintF {
    public static void main(String[] args) {
        System.out.printf("Hello, %s", "Olá, Mundo!");
        System.out.println();  // Não é recomendado pular linha com \n
        System.out.printf("%S", "Valeu, Natalina"); // passa o texto pra caixa alta
        System.out.println();

        System.out.printf("%c", 'y');   // Lembrando que o caracter é passado com ASPAS SIMPLES
        System.out.println();
        System.out.printf("%C", 'a'); // passa o texto pra caixa alta
        System.out.println();

        int valor = 1231549;
        System.out.printf("%d", valor);
        System.out.println();

        double valorDb = 325.478;
        System.out.printf("%f", valorDb);
        System.out.println();

        String olaMundo = "Olá, Mundo!";
        System.out.printf("%20s", olaMundo);
        System.out.println();


        String olaMundo2 = "Olá, Mundo!";
        System.out.printf("%-20s", olaMundo2);
        System.out.println();

        System.out.printf("%+d", valor);
        System.out.println();

        System.out.printf("%015d", valor);
        System.out.println();

        System.out.printf("%,d", valor);
        System.out.println();
    }
}
