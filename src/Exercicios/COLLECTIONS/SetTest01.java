package Exercicios.COLLECTIONS;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();

        nomes.add("Kakaroto");
        nomes.add("Bulma");
        nomes.add("Videl");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        Iterator<String> i = nomes.iterator();
        while (i.hasNext()) {
            String palavra = i.next();
            System.out.println(palavra);
        }
    }
}
