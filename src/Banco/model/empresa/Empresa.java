package Banco.model.empresa;

import Banco.model.funcionarios.Funcionario;

public class Empresa {
    private String name;
    private String cnpj;
    private Funcionario[] funcionario;

    public Empresa(String name, String cnpj, int capacidade) {
        this.name = name;
        this.cnpj = cnpj;
        this.funcionario = new Funcionario[capacidade];
    }

    public void adiciona(Funcionario empregado) {
        boolean adicionado = false;
        for (int i = 0; i < funcionario.length; i++) {
            if (funcionario[i] == null) {
                funcionario[i] = empregado;
                adicionado = true;
                System.out.println("Empregado " + empregado.getNome() + " adicionado na posição " + i);
                break;
            }
        }

        if (!adicionado) {
            System.out.println("Array cheia, redimensionando...");
            Funcionario[] novaArray = new Funcionario[funcionario.length * 2];

            for (int i = 0; i < funcionario.length; i++) {
                novaArray[i] = funcionario[i];
            }

            funcionario = novaArray;
            funcionario[funcionario.length / 2] = empregado;
            System.out.println("Array expandida e empregado " + empregado.getNome() + " adicionado na posição " + (funcionario.length / 2));
        }
    }

    public void mostrarFuncionarios() {
        System.out.println("informações de funcionários:");
        for (Funcionario empregado : funcionario) {
            if (empregado != null) {
                System.out.println("ID " + empregado.getIdentificador() + " - Nome: " + empregado.getNome());
            }
        }
    }

    public void contem(Funcionario empregado) {
        for (Funcionario funcionario : funcionario) {
            if (empregado.equals(funcionario)) {
                System.out.println("Empresa contém " + empregado.getNome() + " no quadro de funcionários");
                return;
            }
        }
        System.out.println("Empresa não contém " + empregado.getNome() + " no quadro de funcionários");
    }


    public String getName() {
        return name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Funcionario getFuncionario(int idx) {
        return this.funcionario[idx];
    }

    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }
}
