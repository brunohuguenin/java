package aulas.aula52;

public class DivisaoNaoExata extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoNaoExata(int num, int den){
        super();
        this.numerador = num;
        this.denominador = den;
    }

    @Override
    public String toString() {
        return "Resultado de " + numerador + "/" + denominador + " não é um" +
                " inteiro!";
    }
}
