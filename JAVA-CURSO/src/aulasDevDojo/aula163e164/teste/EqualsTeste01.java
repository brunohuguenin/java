package aulasDevDojo.aula163e164.teste;


import aulasDevDojo.aula161e162.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {

//        String nome = "William Suane";
//        //String nome2 = "William Suane";
//        String nome2 = new String("William Suane");
//
//        System.out.println(nome == nome2);
//        System.out.println(nome.equals(nome2));


        Smartphone phone1 = new Smartphone("1ABC1", "iPhone");
        Smartphone phone2= new Smartphone("1ABC1", "iPhone");

        System.out.println(phone1.equals(phone2));


    }
}
