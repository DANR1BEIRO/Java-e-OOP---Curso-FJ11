package Exercicios.COLLECTIONS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceAddNaPrimeiraPosicao {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        long total = 300_000;

        long inicioInsercao = System.currentTimeMillis();

        for (int i = 0; i < total; i++) {
            numeros.add(0, i);
        }

        long fimInsercao = System.currentTimeMillis();
        long tempoInsercao = fimInsercao - inicioInsercao;
        double tempoInsercaoEmSegundos = tempoInsercao / 1000.0;

        System.out.printf("Tempo de insercão no início(ms): %d ms%n", tempoInsercao);
        System.out.printf("Tempo de insercão no início(seg): %.3f s%n", tempoInsercaoEmSegundos);
    }
}
