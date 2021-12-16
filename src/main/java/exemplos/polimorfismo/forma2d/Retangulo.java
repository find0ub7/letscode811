package exemplos.polimorfismo.forma2d;

public class Retangulo implements Forma2D {

    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        double area = lado1 * lado2;
        System.out.println("Retangulo: " + area);

        return area;
    }
}
