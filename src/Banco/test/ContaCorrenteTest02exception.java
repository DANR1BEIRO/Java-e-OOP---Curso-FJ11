package Banco.test;

import Banco.exception.SaldoInsuficienteException;
import Banco.exception.ValorInvalidoException;
import Banco.model.conta.ContaCorrente;

public class ContaCorrenteTest02exception {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        try {
            cc.deposita(10);
            cc.saca(1);
            System.out.println("Saldo: " + cc.getSaldo());
        } catch (SaldoInsuficienteException | ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
