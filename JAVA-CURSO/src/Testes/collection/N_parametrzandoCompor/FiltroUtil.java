package Testes.collection.N_parametrzandoCompor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FiltroUtil {
    public static <T> List<T> filtrar(List<T> lista, Predicate<T> condicao) {
        List<T> resultado = new ArrayList<>();
        for (T elemento : lista) {
            if (condicao.test(elemento)) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }
}
