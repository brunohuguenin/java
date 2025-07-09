package aulasDevDojo.aula189a192;

public class OuterClassTeste02 {

    private String name = "Yahico";

    void print() {
        String lastName = "Yagazaki";

        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);

            }
        }
        new LocalClass().printLocal();
    }


    public static void main(String[] args) {
        OuterClassTeste02 outer = new OuterClassTeste02();
        outer.print();


    }
}
