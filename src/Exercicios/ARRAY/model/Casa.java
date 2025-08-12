package Exercicios.ARRAY.model;

public class Casa {
    private String cor;
    private int totalPortas;
    private Porta[] portas;

    public Casa() {
    }

    public Casa(String cor, int totalPortas) {
        this.cor = cor;
        this.totalPortas = totalPortas;
        this.portas = new Porta[totalPortas];
    }

    public void pinta(String pintarCasa) {
        setCor(pintarCasa);
        System.out.println("A casa foi pintada de " + getCor());
    }

    public int totalDePortas() {
        int counter = 0;
        for (Porta porta : portas) {
            if (porta != null) {
                counter++;
            }
        }
        return counter;
    }

    public int quantasPortasAbertas() {
        int counter = 0;
        for (Porta porta : portas) {
            if (porta != null) {
                if (porta.isOpen()) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public void adicionarPorta(Porta novaPorta) {
        boolean adiciona = false;
        for (int i = 0; i < portas.length; i++) {
            if (portas[i] == null) {
                portas[i] = novaPorta;
                adiciona = true;
                System.out.println("Porta adicionada");
                break;
            }
        }

        if (!adiciona) {
            System.out.println("Sem espaço para porta, abrindo um buraco na parede...");
            Porta[] novaArray = new Porta[portas.length * 2];

            for (int i = 0; i < portas.length; i++) {
                novaArray[i] = portas[i];
            }

            portas = novaArray;
            portas[portas.length / 2] = novaPorta;
            System.out.println("Estrutura da casa quebrada para adicionar " + novaPorta.getDescricao());
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTotalPortas() {
        return totalPortas;
    }

    public void setTotalPortas(int totalPortas) {
        this.totalPortas = totalPortas;
    }

    public Porta[] getPortas() {
        return portas;
    }

    public void setPortas(Porta[] portas) {
        this.portas = portas;
    }
}
