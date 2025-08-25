package Exercicios.COLLECTIONS;

import java.util.Comparator;
import java.util.TreeSet;

public class treeSetOrdemDecrescente {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 1; i <= 1000 ; i++) {
            numeros.add(i);
        }
        System.out.println(numeros);
    }
}
