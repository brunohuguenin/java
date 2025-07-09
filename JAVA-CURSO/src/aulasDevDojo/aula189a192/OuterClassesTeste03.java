package aulasDevDojo.aula189a192;

public class OuterClassesTeste03 {
    private String name = "Mr. Boring";

    static class Nested {
        private String lastName = "Não to tankando";
        void print() {
            System.out.println(new OuterClassesTeste03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();

        nested.print();
    }
}
