package Exercicios.INTERFACE.CALCULAR_AREA;

public class Quadrado implements CalcularArea {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
}
