package Banco.test;

import Banco.exception.ValorInvalidoException;
import Banco.model.conta.ContaCorrente;
import Banco.model.conta.tributavel.Tributavel;

public class TributavelTest01 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        try {
            contaCorrente.deposita(100);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(contaCorrente.calculaTributos());

        Tributavel tributavel = contaCorrente;
        System.out.println(tributavel.calculaTributos());
    }
}
