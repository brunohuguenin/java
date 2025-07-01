package aulas.aula89;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula89 {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/y  HH:mm:ss Z");

        Calendar data = new GregorianCalendar(2025, 6, 01, 17, 02, 25);

        System.out.println(sdf.format(data.getTime()));
    }
}
