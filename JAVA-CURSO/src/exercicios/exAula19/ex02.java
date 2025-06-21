package exercicios.exAula19;

public class ex02 {
    public static void main(String[] args) {
        int[] vetA = {87,69,25,3,36,87,4,125};
        int[] vetB = new int[vetA.length];

        for (int i=0; i < vetA.length; i++){
            vetB[i] = vetA[i] * 2;
        }

        System.out.print("Vetor A: ");
        for (int i=0; i<vetA.length; i++) {
            System.out.print(vetA[i]+ "  ");
        }

        System.out.print("\nVetor B: ");
        for (int i=0; i<vetA.length; i++) {
            System.out.print(vetB[i]+ " ");
        }
    }
}
