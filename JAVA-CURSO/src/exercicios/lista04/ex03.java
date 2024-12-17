package exercicios.lista04;

public class ex03 {
    public static void main(String[] args) {
        int[] arrayA = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        System.out.print("Os elementos do Vetor A: ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }

        int[] arrayB = new int[15];
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i] * arrayA[i];
        }
        System.out.println();

        System.out.print("Os elementos do Vetor B: ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + " ");
        }
    }
}
