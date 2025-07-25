package aulas.aula50;

public class ExceptionGenerica {
    public static void main(String[] args) {
        int[] numeros = {4,8,16,32,64,128};
        int[] denominadores = {2,0,4,8,0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            } catch (Exception ex1) { // ArithmeticException
                System.out.println(ex1.getMessage());
                ex1.printStackTrace();
            }

        }
    }
}
