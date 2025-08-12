package Banco.model.conta.imposto;

import Banco.model.conta.tributavel.Tributavel;

public class GerenciadorDeImpostoDeRenda {
    private double total;

    public void adiciona(Tributavel contatributavel) {
        System.out.println("Adicionando tributavel: " + contatributavel.getClass());
        this.total += contatributavel.calculaTributos();
    }

    public double getTotal() {
        return total;
    }
}
