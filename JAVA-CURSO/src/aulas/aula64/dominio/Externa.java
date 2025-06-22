package aulas.aula64.dominio;

public class Externa {
    private String texto = "texto externo";

    public class Interna {
        private String texto = "texto interno";

        public void imprimeTexto() {
            System.out.println(texto);

            //System.out.println(Externa.this.texto);
        }
    }

    public static void main(String[] args) {
        Externa externa = new Externa();
        Interna interna = externa.new Interna(); // primeiro você tem que ter instanciado a classe externa

        interna.imprimeTexto();
    }

}
