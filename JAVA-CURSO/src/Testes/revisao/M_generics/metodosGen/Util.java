package Testes.revisao.M_generics.metodosGen;

public class Util {
    public static void main(String[] args) {
        String[] nomes = {"Seya", "Shiryu", "Shun", "Yoga", "Iki"};

        System.out.println("== ANTES DA TROCA ==");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        troca(nomes, 0, 2);


        System.out.println("== DEPOIS DA TROCA ==");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("------------------------------");

        imprimirQqTipo(43);
        imprimirQqTipo("Java é a linguagem mais braba que tem?");
        imprimirQqTipo(true);

        System.out.println("------------------------------");

        System.out.println(menor("Banana", "Abacaxi"));
        System.out.println(menor(3658, 14587));
    }



    public static <T> void troca(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T> void imprimirQqTipo(T item) {
        System.out.println(item);
    }

    public static <T extends Comparable<T>> T menor(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }
}
