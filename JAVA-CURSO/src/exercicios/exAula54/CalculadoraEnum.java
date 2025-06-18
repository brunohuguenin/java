package exercicios.exAula54;

public enum CalculadoraEnum {

    SOMA("+") {
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    },
    SUBTRACAO("-") {
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICACAO("*") {
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },
    DIVISAO("/") {
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private final String simbolo;

    CalculadoraEnum(String simbolo) {
        this.simbolo = simbolo;
    }

    public String toString() {
        return simbolo;
    }

    public abstract double executarOperacao(double x, double y);
}
