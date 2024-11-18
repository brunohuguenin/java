package aulas.aula10.main;

public class Variaveis {
    public static void main(String[] args) {

        // aceitopela convenção
        int idade = 20;
        String nome = "Carlos";
        String nomeDoMeuCachorro = "Thanus";
        String ano2014 = "2014";

        // Aceitável, mas não utilizado
        int _idade;
        int $idade;


        // Não aceitavel pela convenção
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;  // começando com letra maiúscula

        System.out.println("Minha idade é " + idade);

        // Má prática
        int a = 10;
        String b = "Gerson";

    }
}
