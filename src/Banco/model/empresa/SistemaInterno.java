package Banco.model.empresa;

import Banco.model.funcionarios.autenticacao.AutenticacaoInterface;

public class SistemaInterno {
    final static int SENHA_DO_SISTEMA_INTERNO = 123;

    public void login(AutenticacaoInterface funcionarioAutenticacaoInterface) {
        if (funcionarioAutenticacaoInterface.autenticaSenha(SENHA_DO_SISTEMA_INTERNO)) {
            System.out.println("Acesso permitido.");
            return;
        }
        System.out.println("Acesso negado.");
    }
}
