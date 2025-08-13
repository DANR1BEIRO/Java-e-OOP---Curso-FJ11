package Banco.model.conta;

import Banco.exception.SaldoInsuficienteException;
import Banco.exception.ValorInvalidoException;
import Banco.model.conta.tributavel.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
    private double limite;

    public ContaCorrente() {
    }

    public ContaCorrente(double limite) {
        this.limite = limite;
    }

    public ContaCorrente(int numero, double saldo, Cliente titular, double limite) {
        super(numero, saldo, titular);
        this.limite = limite;
    }

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void saca(double saque) throws SaldoInsuficienteException, ValorInvalidoException {
        double saldo = getSaldo();
        double total = saldo > 0 ? saldo + limite : limite;
        System.out.println("Total disponível: " + total);

        if (saque > total) throw new SaldoInsuficienteException("Saldo insuficiente");

        if (saque > saldo) {
            double usarLimite = 0;
            if (saldo > 0) {
                usarLimite = saque - saldo;
            } else {
                usarLimite = saque;
            }
            limite -= usarLimite;
        }
        diminuirSaldo(saque);
    }

    @Override
    public void transferePara(Conta destino, double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        if (destino == null) throw new IllegalArgumentException("Conta destino inválida");
        saca(valor);
        destino.deposita(valor);
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }

    @Override
    public void atualiza(double taxaSelic) {
    }

    @Override
    public void deposita(double valor) throws ValorInvalidoException {
        super.deposita(valor);
    }

    public double getLimite() {
        return limite;
    }
}
