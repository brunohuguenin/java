package exercicios.exAula19;


import java.util.Random;

public class ex18 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        Random random = new Random();
        int menorIdade=80, maiorIdade=0, posicaoMenorIdade=0, posicaoMaiorIdade=0;

        System.out.printf("As idades dos participantes da pesquisa: ");
        for (int i=0; i< vetor.length; i++){
            vetor[i] = random.nextInt(63) + 18;
            System.out.print(vetor[i] + " ");

            if (menorIdade > vetor[i]){
                menorIdade = vetor[i];
                posicaoMenorIdade = i + 1;
            }

            if (vetor[i]> maiorIdade){
                maiorIdade = vetor[i];
                posicaoMaiorIdade = i + 1;
            }
        }
        System.out.println();

        System.out.printf("A menor idade nessa pesquisa é %d anos e está na %dª posição do vetor\n", menorIdade, posicaoMenorIdade);
        System.out.printf("A maior idade nessa pesquisa é %d anos e está na %dª posição do vetor\n", maiorIdade, posicaoMaiorIdade);


    }
}
