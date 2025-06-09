package aulas.aula25;

public class TesteAviao {
    public static void main(String[] args) {
        Aviao aviao = new Aviao();
        aviao.modelo = "F5M";
        aviao.numPassageiros = 20;
        aviao.capCombustivel = 50;
        aviao.consumoCombustivel = 0.4;

        aviao.exibirAutonomia();

        double autonomia = aviao.obterAutonomia();
        System.out.println(autonomia);
    }
}
