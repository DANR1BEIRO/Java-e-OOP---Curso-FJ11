package Exercicios.INTERFACE.CONTA;

public class ContaCorrenteInterface implements ContaInterface {
    private double saldo;

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito");
        }
        this.saldo += valor;

    }

    @Override
    public double sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito");
        }
        return this.saldo -= valor;
    }

    @Override
    public void trasferirPara(ContaInterface conta, double valor) {
        double valorTransferir = sacar(valor);
        conta.depositar(valorTransferir);
        System.out.println("Transferência realizada");
    }
}
