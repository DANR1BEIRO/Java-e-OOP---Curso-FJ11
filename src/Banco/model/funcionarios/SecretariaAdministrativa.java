package Banco.model.funcionarios;

public class SecretariaAdministrativa extends Secretaria {

    public SecretariaAdministrativa(String nome, String cpf) {
        super(nome, cpf);
    }

    public SecretariaAdministrativa(String nome, String sobreNome, String rg, String cpf, String setorDetrabalho, double salario, DataDeAdmissaoDoFuncionario dataDeAdmissaoDoFuncionarioDeAdmissao) {
        super(nome, sobreNome, rg, cpf, setorDetrabalho, salario, dataDeAdmissaoDoFuncionarioDeAdmissao);
    }

    public SecretariaAdministrativa() {
        super();
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}
