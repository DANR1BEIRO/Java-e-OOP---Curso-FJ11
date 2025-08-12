package Banco.model.funcionarios;

public abstract class Secretaria extends Funcionario {

    public Secretaria(String nome, String cpf) {
        super(nome, cpf);
    }

    public Secretaria(String nome, String sobreNome, String rg, String cpf, String setorDetrabalho, double salario, DataDeAdmissaoDoFuncionario dataDeAdmissaoDoFuncionarioDeAdmissao) {
        super(nome, sobreNome, rg, cpf, setorDetrabalho, salario, dataDeAdmissaoDoFuncionarioDeAdmissao);
    }

    public Secretaria() {
        super();
    }
}
