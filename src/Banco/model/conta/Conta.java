package Banco.model.conta;

import Banco.exception.SaldoInsuficienteException;
import Banco.exception.ValorInvalidoException;

public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;
    private static int totalDeContas;

    public Conta() {
        Conta.totalDeContas += 1;
    }

    public Conta(int numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        Conta.totalDeContas += 1;
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    protected void aumentarSaldo(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException(valor);
        }
        this.saldo += valor;
    }

    protected void diminuirSaldo(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException(valor);
        }
        this.saldo -= valor;
    }

    public abstract void atualiza(double taxaSelic);

    public abstract void saca(double valor) throws SaldoInsuficienteException, ValorInvalidoException;

    public abstract void transferePara(Conta destino, double valor) throws SaldoInsuficienteException, ValorInvalidoException;

    public void deposita(double valor) throws ValorInvalidoException {
        aumentarSaldo(valor);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }
}
