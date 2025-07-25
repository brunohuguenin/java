package aulas.aula75;

public class Aula75 {
    public static void main(String[] args) {

        String vazia = new String();
        System.out.println(vazia);

        String java = new String("JAVA");
        System.out.println(java);

        String java1 = new String(java);
        System.out.println(java1);

        char[] charsJava = {'J', 'A', 'V', 'A'};
        String java2 = new String(charsJava);
        System.out.println(java2);

        char[] abcdef = {'A','B','C','D','E','F'};
        String abc = new String(abcdef, 0, 3); // offset
        System.out.println(abc);

        byte[] ascii = {65,66,67,68};
        String abcd = new String(ascii);
        System.out.println(abcd);

        String java3 = "JavaSpring";
        String java4 = "JavaSpring";

        System.out.println(java3);
        System.out.println(java4);
    }
}
