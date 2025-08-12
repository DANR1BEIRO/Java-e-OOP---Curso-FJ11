package Banco.model.funcionarios;

import Banco.model.funcionarios.autenticacao.AutenticacaoInterface;
import Banco.model.funcionarios.autenticacao.FuncionarioAutenticado;

public class Presidente extends FuncionarioAutenticado implements AutenticacaoInterface {

    public Presidente(int senha) {
        super(senha);
    }

    public Presidente(String nome, String cpf, int senha) {
        super(nome, cpf, senha);
    }

    public Presidente(String nome, String sobreNome, String rg, String cpf, String setorDetrabalho, double salario, DataDeAdmissaoDoFuncionario dataDeAdmissao, int senha) {
        super(nome, sobreNome, rg, cpf, setorDetrabalho, salario, dataDeAdmissao, senha);
    }

    @Override
    public double getBonificacao() {
        return this.salario * 1.5 + 3000;
    }

    @Override
    public boolean autenticaSenha(int senha) {
        if (this.senha != senha) {
            return false;
        }
        return true;
    }
}
