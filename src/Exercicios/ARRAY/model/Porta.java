package Exercicios.ARRAY.model;

public class Porta {
    private String descricao;
    private boolean isOpen;

    public Porta() {
    }

    public Porta(String descricao, boolean isOpen) {
        this.descricao = descricao;
        this.isOpen = isOpen;
    }

    public void abrir() {
        if (isOpen) {
            System.out.println(getDescricao() + " já está aberta.");
            return;
        }
        isOpen = true;
        System.out.println(getDescricao() + " foi aberta.");
    }

    public void fechar() {
        if (!isOpen) {
            System.out.println(getDescricao() + " já está fechada.");
            return;
        }
        isOpen = false;
        System.out.println(getDescricao() + " foi fechada.");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
