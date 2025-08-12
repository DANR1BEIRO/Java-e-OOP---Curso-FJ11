package Banco.test;

import Banco.model.conta.ContaCorrente;
import Banco.model.conta.SeguroDeVida;
import Banco.model.conta.imposto.GerenciadorDeImpostoDeRenda;

public class GerenciadorImpostoDeRendaTest01 {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda IR = new GerenciadorDeImpostoDeRenda();

        ContaCorrente goku = new ContaCorrente();
        goku.depositar(1000);
        IR.adiciona(goku);

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        IR.adiciona(seguroDeVida);

        System.out.printf("Total dos tributos: %.2f\n", IR.getTotal());
    }
}
