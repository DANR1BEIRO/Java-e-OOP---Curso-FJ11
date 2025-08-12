package Exercicios.INTERFACE.CALCULAR_AREA;

public class Circulo implements CalcularArea {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }
}
