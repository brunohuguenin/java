package aulas.aula19;

public class Vetores {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];

        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 34.3;
        temperaturas[3] = 33.3;
        temperaturas[4] = 30.9;

        System.out.println("O valor da temperatura do dia 3 é " + temperaturas[3]);
        System.out.println("O tamanho do array: " + temperaturas.length);
        System.out.println("Array armazenado na memória: " + temperaturas);


        for (int i = 1; i < temperaturas.length; i++) {
            if (i == 5) {
               break;
            }
            System.out.printf("O valor da temperatura no dia %d é %.2fºC\n", i, temperaturas[i]);
        }


        /*
        for (double temp: temperaturas) {
            System.out.println(temp);
        }

         */
    }
}
