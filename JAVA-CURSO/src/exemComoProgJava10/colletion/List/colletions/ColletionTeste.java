package exemComoProgJava10.colletion.List.colletions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ColletionTeste {
    public static void main(String[] args) {

        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();

        // adiciona elementos no array colors a listar
        for (String color: colors) {
            list.add(color);

        }
        //System.out.println(list);

        // adiciona elementos no array removeColors em removeList
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();

        for (String color : removeColors) {
            removeList.add(color);
            //System.out.println(color);
        }
        //System.out.println(list);

        // Gera saída do conteúdo da lista
        System.out.println("ArrayList: ");
        for (int count =0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));
        }

        // remove da lista as cores contidas em removiList
        removeColors(list, removeList);


        // gera a saída do conteúdo da lista
        System.out.printf("%n%nArrayList after calling removeColors:%n");
        for (String color : list) {
            System.out.printf("%s ", color);
        }
    }

    private static void removeColors(Collection<String> coletion1, Collection<String> collection2) {
        // obtém o iterador
        Iterator<String> iterator = coletion1.iterator();

        // loop enquanto a coleção tiver itens
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove();  // remove o elemento atual
            }
        }
    }
}
