package Banco.model.funcionarios;

import Banco.model.funcionarios.autenticacao.AutenticacaoInterface;
import Banco.model.funcionarios.autenticacao.FuncionarioAutenticado;

public class Gerente extends FuncionarioAutenticado implements AutenticacaoInterface {
    private int numeroDeFuncionariosGerenciados;

    public Gerente(int senha) {
        super(senha);
    }

    public Gerente(String nome, String cpf, int senha) {
        super(nome, cpf, senha);
    }

    public Gerente(String nome, String sobreNome, String rg, String cpf, String setorDetrabalho, double salario, DataDeAdmissaoDoFuncionario dataDeAdmissao, int senha) {
        super(nome, sobreNome, rg, cpf, setorDetrabalho, salario, dataDeAdmissao, senha);
    }

    @Override
    public boolean autenticaSenha(int senha) {
        if (this.senha != senha) {
            return false;
        }
        return true;
    }

    @Override
    public void aplicaBonificacao() {
        salario += getBonificacao();
    }

    @Override
    public double getBonificacao() {
        return this.salario * 0.10 + 1000;
    }

}
