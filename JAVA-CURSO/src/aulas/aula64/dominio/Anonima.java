package aulas.aula64.dominio;

public class Anonima {
    public void imprimeTexto(){
        System.out.println("Valeu, Natalina!!");
    }

    public static void main(String[] args) {
        Anonima anonima = new Anonima() {
            public  void imprimeTexto() {
                System.out.println("Um valeu, Natalina sobreescrito por qualquer motivo");
            }
        };



    }

}
