package aulasDevDojo.aula189a192;

public class OuterClassTeste01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribut() {
            System.out.println(name);
            System.out.println("this fazendo referência a classe Inner: " + this);
            System.out.println("this fazendo referência a classe OuterClassTeste01: " +  OuterClassTeste01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassTeste01 outerClass = new OuterClassTeste01();
        Inner inner = outerClass.new Inner();

        inner.printOuterClassAttribut();
    }
}
