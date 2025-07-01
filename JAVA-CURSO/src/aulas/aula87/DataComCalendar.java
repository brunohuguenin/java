package aulas.aula87;

import java.util.Calendar;

public class DataComCalendar {
    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance(); // padrão sigleton - Java EE

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH) + 1;
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        hoje.add(Calendar.DAY_OF_MONTH, 2);


        System.out.println(hoje);
        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);
        System.out.printf("Hoje é %d/%d/%d %d:%d:%d", dia, mes, ano, hora, minutos, segundos);

        System.out.println();

    }

}
