package Testes.revisao.P_methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PessoaTeste {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("ana", "brUNO", "carLoS");

        List<String> nomesFormatados = nomes.stream()
                .map(Util::formatarNome)
                .collect(Collectors.toList());

        List<Pessoa> pessoas = nomesFormatados.stream()
                .map(Pessoa::new)
                .collect(Collectors.toList());

        Anunciador anunciador = new Anunciador();

        pessoas.forEach(anunciador::anunciar);
    }
}
