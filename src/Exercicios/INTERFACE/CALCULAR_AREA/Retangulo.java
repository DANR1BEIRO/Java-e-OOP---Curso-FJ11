package Exercicios.INTERFACE.CALCULAR_AREA;

public class Retangulo implements CalcularArea {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return this.altura * this.largura;
    }
}
