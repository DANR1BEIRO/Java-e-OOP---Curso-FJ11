package Banco.test;

import Banco.exception.SaldoInsuficienteException;
import Banco.exception.ValorInvalidoException;
import Banco.model.conta.ContaCorrente;

public class ReferenciaContaTest01 {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = c1;
        ContaCorrente c3 = new ContaCorrente();
        ContaCorrente c4 = new ContaCorrente();
        try {
            c1.deposita(1000);
            c2.deposita(1500);
            System.out.println(c1.getSaldo());
            c1.deposita(1000);
            System.out.println(c2.getSaldo());
            c3.deposita(1000);
            c4.deposita(1000);
            System.out.println(c3 == c4);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }

        /**
         * O operador = copia o valor de uma variável. Como o valor de c1 é
         * uma referência (endereco) de onde o objeto do tipo Conta se encontra
         * na memória, c2 passa fazer referência para o mesmo objeto que c1.

         * O operador == guarda o conteúdo das variáveis, porém as variáveis não
         * guardam o objeto em si, mas uma referência (endereco) onde ele se
         * encontra na memória. Como cada variável guarda referencias a objetos
         * diferentes em memória, o resultado será false.
         */

        System.out.println("");
        System.out.println("Saldo c4 antes da transferência: " + c4.getSaldo());
        try {
            c4.transferePara(c3, 500);
        } catch (SaldoInsuficienteException | ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo c3: " + c3.getSaldo());
        System.out.println("Saldo c4 depois da transferência: " + c4.getSaldo());
    }
}
