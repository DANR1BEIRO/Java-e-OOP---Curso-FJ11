package Exercicios.ARRAY.test;

import Exercicios.ARRAY.model.Casa;
import Exercicios.ARRAY.model.Porta;

public class CasaTest01 {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa("amarela", 3);
        Porta portaSala = new Porta("Porta da sala", false);
        Porta portaCozinha = new Porta("Porta da cozinha", false);
        Porta portaBanheiro = new Porta("Porta do banheiro", false);
        Porta portaQuarto = new Porta("Porta do quarto", false);

        minhaCasa.adicionarPorta(portaSala);
        minhaCasa.adicionarPorta(portaCozinha);
        minhaCasa.adicionarPorta(portaBanheiro);
        minhaCasa.adicionarPorta(portaQuarto);

        portaSala.abrir();
        portaCozinha.fechar();
        portaCozinha.abrir();
        portaQuarto.fechar();

        System.out.println("Quantidade de portas abertas: " + minhaCasa.quantasPortasAbertas());
        System.out.println("Quantidade de portas na casa: " + minhaCasa.totalDePortas());
    }
}
