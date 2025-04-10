package libro.cap14.algoritmos;

public class TestFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo(23);
        Rectangulo r = new Rectangulo(12,4);
        Triangulo t = new Triangulo(2,5);

        FiguraGeometrica arr[] = {new Circulo(23),
                                  new Rectangulo(12,4),
                                  new Triangulo(2,5)};
        double prom = FiguraGeometrica.areaPromedio(arr);
        System.out.println("Promedio = " + prom);




    }
}
