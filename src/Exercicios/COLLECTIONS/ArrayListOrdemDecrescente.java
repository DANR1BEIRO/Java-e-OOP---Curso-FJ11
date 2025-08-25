package Exercicios.COLLECTIONS;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListOrdemDecrescente {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            numeros.add(i);
        }

        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);
    }
}
