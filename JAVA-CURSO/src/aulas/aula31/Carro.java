package aulas.aula31;

public class Carro {
        protected String marca;
        private String modelo;
        private int numPassageiros;
        double capCombustivel;
        double consumoCombustivel;

        void exibirAutonomia() {
            System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
        }

        double obterAutonomia() {
            System.out.println("Método obterAutonomia foi chamado.");
            return capCombustivel * consumoCombustivel;
        }
}
