package exemplos.polimorfismo.forma2d;

public class Quadrado implements Forma2D {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = lado * lado;
        System.out.println("Quadrado:" + area);

        return area;
    }
}
