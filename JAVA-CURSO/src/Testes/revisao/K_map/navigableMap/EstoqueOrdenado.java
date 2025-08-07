package Testes.revisao.K_map.navigableMap;

import java.util.Map;
import java.util.TreeMap;

public class EstoqueOrdenado {
    public static void main(String[] args) {
        TreeMap<Moto, Integer> estoque = new TreeMap<>();

        estoque.put(new Moto(1, "Kawasaki Ninja", 349.999), 10);
        estoque.put(new Moto(1, "Yamaha R15", 99.999), 17);
        estoque.put(new Moto(1, "BMW S1000 RR", 149.999), 3);
        estoque.put(new Moto(1, "KDucati Panigale V4 S", 200.000), 19);
        estoque.put(new Moto(1, "Honda CBR 1000RR-R", 175.999), 33);

        System.out.println("--- ESTOQUE ORDENADO POR PREÇO ---");
        for (Map.Entry<Moto, Integer> entrada : estoque.entrySet()) {
            System.out.println(entrada.getKey() + " - Quantidade: " + entrada.getValue());
        }

        //Navegação com métodos do NavigableMao
        Moto ref = new Moto(0, "Referêencia", 180.000);
        System.out.println("\nProduto com preço imediatamente menor a R$ 180.000,00: " + estoque.lowerKey(ref));
        System.out.println("Produto com preço maior ou igual a R$ 180.000,00: " + estoque.ceilingKey(ref));
    }
}
