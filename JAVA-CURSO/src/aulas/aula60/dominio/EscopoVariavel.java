package aulas.aula60.dominio;

public class EscopoVariavel {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int caucularValor (int valor) {
        valor += 10;
        return valor;
    }

    public int teste () {
        int valor = 5;

        if (true) {
            valor--;
        }
        return valor;
    }

    public void outroTeste () {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int j;
        for (j = 0; j <10; j++) {
            System.out.println(j);
        }

        System.out.println(j);
    }

    public void maisUmTeste () {
        boolean flag = true;

        if (flag) {
            int umaVariavel = 10;

            umaVariavel++;
            System.out.println(umaVariavel);
        }
    }

    public void maisUmOutroTeste (int num) {
        int total = 0;

        try {
            int outroNum = 0;

            total = num/outroNum;
        } catch (Exception err) {
            err.printStackTrace();
        } finally {
            total++;
        }

        num++;
    }
}
