package aulas.aula32;

public class TesteMoto {
    public static void main(String[] args) {
        Moto moto = new Moto();

        //moto.marca = "Honda";
        //moto.modelo = "CB 300";

        moto.setMarca("Honda");

        String marcaMoto = moto.getMarca();
        System.out.printf("A marca desta moto é %s", marcaMoto);
    }
}
