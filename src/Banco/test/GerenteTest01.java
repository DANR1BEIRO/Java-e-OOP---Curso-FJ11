package Banco.test;

import Banco.model.funcionarios.Gerente;

public class GerenteTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Piccollo", "122", 1288);
        gerente.autenticaSenha(1280);
        gerente.setSalario(1000);
        System.out.println(gerente.getSalario());
        gerente.getBonificacao();
        System.out.println(gerente.getSalario());
    }
}
