package Banco.model.conta;

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

    protected void aumentarSaldo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito.");
        } else {
            this.saldo += valor;
        }
    }

    protected void diminuirSaldo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque.");
        }
        this.saldo -= valor;
    }

    public abstract void atualiza(double taxaSelic);

    public abstract boolean sacar(double valor);

    public abstract boolean transferePara(Conta destino, double valor);

    public void depositar(double valor) {
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
