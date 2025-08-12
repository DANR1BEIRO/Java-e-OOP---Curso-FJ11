package Exercicios;

public class Exercicios01 {
    public static void main(String[] args) {
        // Labeled loop
        externo:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break externo;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // imprimir de 150 a 300
        for (int i = 150; i <= 300; i++) {
            System.out.print(i == 300 ? i + "." : i + ", ");
        }

        System.out.println("");

        // Imprime o valor de 1 até 1000
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            soma += i;
            System.out.println("Soma até " + i + ": " + soma);
        }

        // Múltiplos de 3 de 1 a 100
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // fatorial
        System.out.println("\nFatorial:");
        long fatorial = 1;
        for (long i = 1; i <= 5; i++) {
            fatorial *= i;
            System.out.println(i + "! é " + fatorial);
        }


        // fibonacci
        int a = 0;
        int b = 1;
        System.out.println("\nFibonacci até 100:");
        while (a < 100) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

        int y = 0;
        int z = 1;
        System.out.println("\nFibo por termo usando apenas duas variaveis:");
        for (int i = 0; i < 5 ; i++) {
            System.out.print(y + " ");
            z = y + z;
            y = z - y;
        }

        // Conjectura de Collatz
        System.out.println("\n \nConjectura de Collatz:");
        int x = 113;

        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = x * 3 + 1;
            }
            System.out.print(x == 1 ? x + "." : x + " -> ");
        }
    }
}



