package aulas.aula54.dominio;

public enum DiaSemana {
    DOMINGO(1), SEGUNDA(2),TERCA(3),
    QUARTA(4),QUINTA(5),
    SEXTA(6),SABADO(7);

    private int valor;

    DiaSemana(int seiLa) {
        this.valor = seiLa;
    }

    public int getValor() {
        return valor;
    }
}
