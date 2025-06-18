package aulas.aula58;

public class TesteAutoBoxing {
    public static void main(String[] args) {
        // autoboxing
        Short n7 =  1;
        Byte n8 = 10;
        Integer n9 = 100;
        Long n10 = 10000l;
        Float n11 = 3.5f;
        Double n12 = 2.555;
        Boolean flag2 = true;
        Character b = 'b';

        // auto unboxing
        int n13 = n9; // n9.intValue();

        // autoboxing em expressões
        n9++;
        System.out.println(n9);

        // auto unboxing -> autoboxing n13/n9 -> n14
        Integer n14 = n13 / n9;
    }


}
