package aulasDevDojo.aula166a168;

import aulasDevDojo.aula161e162.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {

        Smartphone phone1 = new Smartphone("1ABC1", "iPhone");
        Smartphone phone2= new Smartphone("22222", "Pixel");
        Smartphone phone3= new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(phone1);
        smartphones.add(phone2);
        smartphones.add(phone3);

        for (Smartphone smartphone: smartphones) {
            System.out.println(smartphone);
        }

        Smartphone phone4 = new Smartphone("22222", "Pixel");

        System.out.println(smartphones.contains(phone4));
        int indexSmartphone4 = smartphones.indexOf(phone4);
        System.out.println(indexSmartphone4);

    }
}
