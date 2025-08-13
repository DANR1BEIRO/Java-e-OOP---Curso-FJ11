package Banco.test;

import Banco.exception.ValorInvalidoException;
import Banco.model.conta.ContaCorrente;
import Banco.model.conta.SeguroDeVida;
import Banco.model.conta.imposto.GerenciadorDeImpostoDeRenda;

public class GerenciadorImpostoDeRendaTest01 {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda IR = new GerenciadorDeImpostoDeRenda();

        ContaCorrente goku = new ContaCorrente();
        try {
            goku.deposita(1000);
        } catch (ValorInvalidoException e) {
            throw new RuntimeException(e);
        }
        IR.adiciona(goku);

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        IR.adiciona(seguroDeVida);

        System.out.printf("Total dos tributos: %.2f\n", IR.getTotal());
    }
}
