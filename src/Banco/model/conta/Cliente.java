package Banco.model.conta;

import Banco.model.empresa.Pessoa;

public class Cliente extends Pessoa {

    public Cliente() {
    }

    public Cliente(String nome, String sobreNome, String rg, String cpf) {
        super(nome, sobreNome, rg, cpf);
    }
}
