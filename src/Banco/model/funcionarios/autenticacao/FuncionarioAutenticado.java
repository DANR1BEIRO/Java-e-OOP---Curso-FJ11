package Banco.model.funcionarios.autenticacao;

import Banco.model.funcionarios.DataDeAdmissaoDoFuncionario;
import Banco.model.funcionarios.Funcionario;

public abstract class FuncionarioAutenticado extends Funcionario implements AutenticacaoInterface {
    protected int senha;

    public FuncionarioAutenticado(String nome, String cpf, int senha) {
        super(nome, cpf);
        this.senha = senha;
    }

    public FuncionarioAutenticado(String nome, String sobreNome, String rg, String cpf, String setorDetrabalho, double salario, DataDeAdmissaoDoFuncionario dataDeAdmissao, int senha) {
        super(nome, sobreNome, rg, cpf, setorDetrabalho, salario, dataDeAdmissao);
        this.senha = senha;
    }

    public FuncionarioAutenticado(int senha) {
        this.senha = senha;
    }
}
