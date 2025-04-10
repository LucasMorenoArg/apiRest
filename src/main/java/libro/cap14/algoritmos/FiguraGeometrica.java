package libro.cap14.algoritmos;

public abstract class FiguraGeometrica {

    private String nombre;

    public FiguraGeometrica (String  nom){
        this.nombre = nom;
    }

    public abstract double area();

    public static double areaPromedio(FiguraGeometrica arr[]){

        int sum = 0;
        for (int i =0; i<arr.length; i++){
            sum += arr[i].area();
        }
        return sum / arr.length;
    }

    public String toString(){
        return nombre + " (area = " + area()+")";
    }
}
