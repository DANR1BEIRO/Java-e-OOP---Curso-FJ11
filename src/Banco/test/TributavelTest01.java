package Banco.test;

import Banco.model.conta.Conta;
import Banco.model.conta.ContaCorrente;
import Banco.model.conta.tributavel.Tributavel;

public class TributavelTest01 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(100);
        System.out.println(contaCorrente.calculaTributos());

        Tributavel tributavel = contaCorrente;
        System.out.println(tributavel.calculaTributos());
    }
}
