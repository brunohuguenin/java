package aulas.aula48;

public class MultiplosCatchGenericos {
    public static void main(String[] args) {

        int[] numeros = {4,8,16,32,64,128};
        int[] denominadores = {2,0,4,8,0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            } catch (ArithmeticException ex1) { // ArithmeticException
                System.out.println("Erro ao dividir por zero!");
            } catch (Throwable ex2) { //
                System.out.println("ocorreu um fucking ERROO");
            }

        }

    }
}
