package aulasDevDojo.aula189a192;


import java.lang.reflect.AnnotatedArrayType;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClassTeste01 {
    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };

        animal.walk();
    }
}
