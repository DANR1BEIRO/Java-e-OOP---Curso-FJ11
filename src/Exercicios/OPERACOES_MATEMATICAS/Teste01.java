package Exercicios.OPERACOES_MATEMATICAS;

public class Teste01 {
    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int gastoTotal = janeiro + fevereiro + marco;
        System.out.println("Gasto total: " + gastoTotal);

        int media = gastoTotal / 3;
        System.out.println("Média: " + media);

        for (int j = 1; j < 10; j++) {
            System.out.println("Dentro do loop " + j);
        }

        for (int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                continue;
            }
            System.out.println(i);

        }
    }
}
