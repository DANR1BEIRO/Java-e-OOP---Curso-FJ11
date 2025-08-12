package Banco.model.conta;

import Banco.model.conta.tributavel.Tributavel;

public class SeguroDeVida implements Tributavel {

    @Override
    public double calculaTributos() {
        return 42;
    }
}
