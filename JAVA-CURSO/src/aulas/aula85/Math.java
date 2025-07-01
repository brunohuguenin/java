package aulas.aula85;

public class Math {
    public static void main(String[] args) {

        int number = 8;

        System.out.println(java.lang.Math.pow(number, 3));

        System.out.println(java.lang.Math.round(4.6));
        System.out.println(java.lang.Math.round(4.4));

        System.out.println(java.lang.Math.ceil(4.4));    // arredonda pra cima
        System.out.println(java.lang.Math.ceil(4.6));

        System.out.println(java.lang.Math.floor(4.3));  // floor() arredonda pra baixo
        System.out.println(java.lang.Math.floor(4.6));

        System.out.println(java.lang.Math.random() * 100);

        System.out.println(java.lang.Math.sin(java.lang.Math.toRadians(30)));
        System.out.println(java.lang.Math.tan(java.lang.Math.toRadians(90)));

    }
}
