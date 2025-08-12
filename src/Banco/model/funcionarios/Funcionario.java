package Banco.model.funcionarios;

import Banco.model.empresa.Pessoa;

import java.util.Objects;

public abstract class Funcionario extends Pessoa {
    private String setorDetrabalho;
    protected double salario;
    private DataDeAdmissaoDoFuncionario dataDeAdmissao;
    private static int id = 1;
    private int identificador;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
        identificador = id;
        id++;
    }

    public Funcionario(String nome, String sobreNome, String rg, String cpf, String setorDetrabalho, double salario, DataDeAdmissaoDoFuncionario dataDeAdmissao) {
        super(nome, sobreNome, rg, cpf);
        this.setorDetrabalho = setorDetrabalho;
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public Funcionario() {
        super();
    }

    public void aplicaBonificacao() {
        this.salario += getBonificacao();
    }

    public abstract double getBonificacao();

    public void calculaGanhoAnual() {
        System.out.println("Ganho anual: " + salario * 12);
    }

    public void info() {
        System.out.println("Nome: " + this.getNome());
        System.out.print("Data de admissão: ");
        this.dataDeAdmissao.dataFormatada();
        System.out.println("Bonificação: " + getBonificacao());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Double.compare(salario, that.salario) == 0 && Objects.equals(setorDetrabalho, that.setorDetrabalho) && Objects.equals(dataDeAdmissao, that.dataDeAdmissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setorDetrabalho, salario, dataDeAdmissao);
    }

    public String getSetorDetrabalho() {
        return setorDetrabalho;
    }

    public void setSetorDetrabalho(String setorDetrabalho) {
        this.setorDetrabalho = setorDetrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public DataDeAdmissaoDoFuncionario getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(DataDeAdmissaoDoFuncionario dataDeAdmissaoDoFuncionarioDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissaoDoFuncionarioDeAdmissao;
    }

    public int getIdentificador() {
        return identificador;
    }
}

