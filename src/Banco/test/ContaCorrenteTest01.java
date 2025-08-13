package Banco.test;

import Banco.exception.SaldoInsuficienteException;
import Banco.exception.ValorInvalidoException;
import Banco.model.conta.Cliente;
import Banco.model.conta.ContaCorrente;

public class ContaCorrenteTest01 {
    public static void main(String[] args) {
        Cliente goku = new Cliente("Goku", "sayan", "225445660", "12345645");
        Cliente vegeta = new Cliente("Vegeta", "Principe", "444777550", "00000000012");

        ContaCorrente contaGoku = new ContaCorrente(1, 100);
        ContaCorrente contaVegeta = new ContaCorrente(2, 100);

        System.out.println("Saldo goku: " + contaGoku.getSaldo());
        try {
            contaGoku.transferePara(contaVegeta, 50);
        } catch (SaldoInsuficienteException | ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo vegeta: " + contaVegeta.getSaldo());
        System.out.println("Limite vegeta: " + contaVegeta.getLimite());

        System.out.println("Saldo goku: " + contaGoku.getSaldo());

//        System.out.println("Limite: " + contaGoku.getLimite());
//        System.out.println("Saque: " + contaGoku.saca(100));
//        System.out.println("");
//        System.out.println("Saldo: " + contaGoku.getSaldo());
//        System.out.println("Limite: " + contaGoku.getLimite());
//        System.out.println("Saque: " + contaGoku.saca(100));
//        System.out.println("");
//        System.out.println("Saldo: " + contaGoku.getSaldo());
//        System.out.println("Limite: " + contaGoku.getLimite());
//        System.out.println("Saque: " + contaGoku.saca(5));
//        System.out.println("Saldo: " + contaGoku.getSaldo());
//        System.out.println("Limite: " + contaGoku.getLimite());
//        System.out.println("Saque: " + contaGoku.saca(800));

        System.out.println("Total de contas: " + ContaCorrente.getTotalDeContas());
    }
}
