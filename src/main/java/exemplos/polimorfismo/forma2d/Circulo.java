package exemplos.polimorfismo.forma2d;

public class Circulo implements Forma2D {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Circulo:" + area);

        return area;
    }
}
