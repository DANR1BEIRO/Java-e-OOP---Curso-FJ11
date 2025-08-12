package Exercicios.INTERFACE.CONTA;

public interface ContaInterface {
    double getSaldo();
    void depositar(double valor);
    double sacar(double valor);
    void trasferirPara(ContaInterface conta, double valor);
}
