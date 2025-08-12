package Banco.test;

import Banco.model.conta.ContaCorrente;

public class ReferenciaContaTest01 {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();
        c1.depositar(1000);

        ContaCorrente c2 = c1;
        c2.depositar(1500);

        System.out.println(c1.getSaldo());
        c1.depositar(1000);
        System.out.println(c2.getSaldo());

        /**
         * O operador = copia o valor de uma variável. Como o valor de c1 é
         * uma referência (endereco) de onde o objeto do tipo Conta se encontra
         * na memória, c2 passa fazer referência para o mesmo objeto que c1.
         */

        ContaCorrente c3 = new ContaCorrente();
        c3.depositar(1000);

        ContaCorrente c4 = new ContaCorrente();
        c4.depositar(1000);

        System.out.println(c3 == c4);

        /**
         * O operador == guarda o conteúdo das variáveis, porém as variáveis não
         * guardam o objeto em si, mas uma referência (endereco) onde ele se
         * encontra na memória. Como cada variável guarda referencias a objetos
         * diferentes em memória, o resultado será false.
         */

        System.out.println("");
        System.out.println("Saldo c4 antes da transferência: " + c4.getSaldo());
        c4.transferePara(c3, 500);
        System.out.println("Saldo c3: " +c3.getSaldo());
        System.out.println("Saldo c4 depois da transferência: " +c4.getSaldo());
    }
}
