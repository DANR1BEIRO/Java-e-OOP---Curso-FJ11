package Exercicios.INTERFACE.CALCULAR_AREA;

public class CalcularAreaTest01 {
    public static void main(String[] args) {
        CalcularArea retangulo = new Retangulo(6, 5);
        System.out.printf("Área do retângulo: %.2f\n", retangulo.calcularArea());

        CalcularArea quadrado = new Quadrado(7);
        System.out.printf("Área do quadrado: %.2f\n", quadrado.calcularArea());

        CalcularArea circulo = new Circulo(5);
        System.out.printf("Area do círculo: %.2f\n", circulo.calcularArea());
    }
}
