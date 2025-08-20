package Exercicios.COLLECTIONS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestPerformance01 {
    public static void main(String[] args) {
        System.out.println("Testando...");
        Collection<Integer> test = new HashSet<>();

        long inicioInsercao = System.currentTimeMillis();

        int total = 10000;

        for (int i = 0; i < total ; i++) {
            test.add(i);
        }

        long fimInsercao = System.currentTimeMillis();
        long tempoInsercao = fimInsercao - inicioInsercao;
        double tempoInsercaoEmSegundos = tempoInsercao / 1000.0;

        System.out.println("Tempo gasto inserindo os elementos(ms): " + tempoInsercao);
        System.out.println("Tempo gasto inserindo os elementos(seg): " + tempoInsercaoEmSegundos);

        long inicioBusca = System.currentTimeMillis();

        for (int i = 0; i < total ; i++) {
            test.contains(i);
        }

        long fimBusca =  System.currentTimeMillis();
        long tempoBusca = fimBusca - inicioBusca;
        double tempoBuscaEmSegundos = tempoBusca / 1000.0;
        System.out.println("Tempo gasto buscando elementos(ms): " + tempoBusca);
        System.out.println("Tempo gasto buscando elementos(seg): " + tempoBuscaEmSegundos);
    }
}
