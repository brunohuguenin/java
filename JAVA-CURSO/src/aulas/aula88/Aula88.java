package aulas.aula88;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88 {
    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();

        GregorianCalendar hojeNovo = new GregorianCalendar();

        System.out.println();

        imprimirDara(hojeNovo);


        System.out.println(hojeNovo.isLeapYear(2017));
    }

    private static void imprimirDara(Calendar hoje) {
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH) + 1;
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.printf("Hoje é %d/%d/%d %d:%d:%d", dia, mes, ano, hora, minutos, segundos);
    }
}
