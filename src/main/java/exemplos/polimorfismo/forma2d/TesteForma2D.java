package exemplos.polimorfismo.forma2d;

public class TesteForma2D {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2);
        Circulo circulo = new Circulo(2);
        Forma2D retangulo = new Retangulo(2, 3);

        Forma2D[] formas2D = new Forma2D[]{quadrado, circulo, retangulo};

        for (int i = 0; i < formas2D.length; i++) {
            Forma2D forma2D = formas2D[i];
            forma2D.calcularArea();
        }

    }
}
