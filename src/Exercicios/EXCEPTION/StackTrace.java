package Exercicios.EXCEPTION;

public class StackTrace {
    public static void main(String[] args) {
        System.out.println("início do main");
        try {
            metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e);
        }
        System.out.println("Fim do main");
    }

    static void metodo1() {
        System.out.println("início do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    static void metodo2() {
        System.out.println("Início do método 2");
        int[] array = new int[10];
        for (int i = 0; i <= 11; i++) {
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("Fim do método 2");
    }
}

