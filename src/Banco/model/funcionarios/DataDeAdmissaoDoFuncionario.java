package Banco.model.funcionarios;

public class DataDeAdmissaoDoFuncionario {
    private int dia;
    private int mes;
    private int ano;

    public DataDeAdmissaoDoFuncionario(int dia, int mes, int ano) {

        if (!dataValida(dia, mes, ano)) {
            throw new IllegalArgumentException("Data inválida");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12) {
            return false;
        }

        int[] quantidadeDeDiasDeCadaMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && isAnoBissexto(ano)) {
            return dia <= 29;
        }
        return dia <= quantidadeDeDiasDeCadaMes[mes - 1];
    }

    private boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) | (ano % 400 == 0);
    }

    public void dataFormatada() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
