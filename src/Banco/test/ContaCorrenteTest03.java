package Banco.test;

import Banco.exception.ValorInvalidoException;
import Banco.model.conta.Conta;
import Banco.model.conta.ContaCorrente;

import javax.management.monitor.StringMonitor;

public class ContaCorrenteTest03 {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(11, 11);
        ContaCorrente cc2 = new ContaCorrente(11, 11);

        try {
            cc2.deposita(100);
            cc1.deposita(100);
        } catch (ValorInvalidoException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Descrição: " + cc1);

        if (cc1 != cc2) {
            System.out.println("São diferentes");
        }

        if (cc1.equals(cc2)) {
            System.out.println("São iguais com equals");
        } else {
            System.out.println("São diferentes com equals");
        }

        int i = 100;
        String s = "" + i;
        System.out.println(s);

        int stringModificadaParaInt = Integer.parseInt(s);
        System.out.println(stringModificadaParaInt);

        String nome = new String("goku");
        String nome2 = new String("goku");
        System.out.println("Nome 1: " + nome + "\nNome 2: " + nome2);

        System.out.println("\nComparando com ==");
        if (nome == nome2) {
            System.out.println("Apontam para o mesmo objeto");
        } else {
            System.out.println("Apontam para objetos diferentes");
        }

        System.out.println("\nComparando com equals");
        if (nome.equals(nome2)) {
            System.out.println("Objetos tem o mesmo conteúdo");
        } else {
            System.out.println("Objetos tem conteúdo diferente");
        }

        Conta goku = new ContaCorrente(12, 500);
        System.out.println(goku);

    }
}
