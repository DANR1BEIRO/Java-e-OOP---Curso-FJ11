package Banco.test;

import Banco.model.funcionarios.DataDeAdmissaoDoFuncionario;
import Banco.model.funcionarios.Gerente;
import Banco.model.funcionarios.SecretariaAdministrativa;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        DataDeAdmissaoDoFuncionario dataGerente = new DataDeAdmissaoDoFuncionario(12,12,1001);
        Gerente gerente = new Gerente("Goku", "001",123);
        gerente.setDataDeAdmissao(dataGerente);
        gerente.setSalario(1000);
        gerente.info();
        gerente.aplicaBonificacao();
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getIdentificador());
    }
}
