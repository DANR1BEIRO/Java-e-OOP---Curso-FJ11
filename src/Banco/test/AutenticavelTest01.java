package Banco.test;

import Banco.model.funcionarios.autenticacao.AutenticacaoInterface;
import Banco.model.empresa.SistemaInterno;
import Banco.model.funcionarios.Gerente;

public class AutenticavelTest01 {
    public static void main(String[] args) {
        AutenticacaoInterface a = new Gerente("trunks", "2222", 123);
        SistemaInterno sistemaInterno = new SistemaInterno();

        sistemaInterno.login(a);

    }
}
