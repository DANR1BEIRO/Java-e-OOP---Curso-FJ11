package Exercicios.INTERFACE.CONTA;

public class ContaInterfaceTest01 {
    public static void main(String[] args) {
        ContaCorrenteInterface c1 = new ContaCorrenteInterface();
        ContaCorrenteInterface c2 = new ContaCorrenteInterface();

        c1.depositar(100);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());

        c1.trasferirPara(c2, 50);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());


    }
}
