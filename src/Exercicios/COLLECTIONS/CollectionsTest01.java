package Exercicios.COLLECTIONS;

import Banco.model.conta.ContaCorrente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Goku");
        nomes.add("Gohan");
        nomes.add("Bulma");
        nomes.add("Piccollo");

        System.out.println("Lista antes de ser ordenada: " + nomes);
        Collections.sort(nomes);
        System.out.println("Lista ordenada por ordem alfabética: " + nomes);
        System.out.println("Retorna o maior elemento da colecão: " + Collections.max(nomes));
        System.out.println("Retorna o menor elemento da colecão: " + Collections.min(nomes));
        Collections.reverse(nomes);
        System.out.println(nomes);

        ContaCorrente c1 = new ContaCorrente(1, 40);
        ContaCorrente c2 = new ContaCorrente(2, 300);
        ContaCorrente c3 = new ContaCorrente(3, 76);

        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        for (ContaCorrente conta : contas) {
            System.out.println(conta.getSaldo());
        }

        System.out.println(contas.size());
        System.out.println(contas.contains(nomes));

        System.out.println(contas);
        Collections.sort(contas);
        System.out.println("Contas ordenadas por saldo: " + contas);
        System.out.println("Retorna o maior elemento da colecão: " + Collections.max(contas));
        System.out.println("Retorna o menor elemento da colecão: " + Collections.min(contas));
        Collections.reverse(contas);
        System.out.println(contas);
    }
}
