package Banco.model.funcionarios;

import Banco.model.funcionarios.autenticacao.AutenticacaoInterface;
import Banco.model.funcionarios.autenticacao.FuncionarioAutenticado;

public class Diretor extends FuncionarioAutenticado implements AutenticacaoInterface {

    public Diretor(int senha) {
        super(senha);
    }

    public Diretor(String nome, String cpf, int senha) {
        super(nome, cpf, senha);
    }

    public Diretor(String nome, String sobreNome, String rg, String cpf, String setorDetrabalho, double salario, DataDeAdmissaoDoFuncionario dataDeAdmissao, int senha) {
        super(nome, sobreNome, rg, cpf, setorDetrabalho, salario, dataDeAdmissao, senha);
    }

    @Override
    public double getBonificacao() {
        return 0;
    }

    @Override
    public boolean autenticaSenha(int senha) {
        if (this.senha != senha) {
            return false;
        }
        return true;
    }
}
