package Banco.model.conta;

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
    public boolean sacar(double saque) {
        double saldo = getSaldo();
        double total = saldo > 0 ? saldo + limite : limite;
        System.out.println("Total disponível: " + total);

        if (saque > total) return false;

        if (saque > saldo) {
            double usarLimite = 0;
            if (saldo > 0) {
                usarLimite = saque - saldo;
            } else {
                usarLimite = saque;
            }

            if (limite < usarLimite) {
                throw new IllegalArgumentException("Limite excedido");
            }
            limite -= usarLimite;
        }
        diminuirSaldo(saque);
        return true;
    }

    @Override
    public boolean transferePara(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }

    @Override
    public void atualiza(double taxaSelic) {
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    public double getLimite() {
        return limite;
    }
}
