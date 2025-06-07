package libro.cap14.colecciones.arrays;

import java.util.Scanner;

public class TestMiColeccion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Creammos uns coleccion con capacidad inicial =5;
        MiColeccion mc = new MiColeccion(5);

        //Leemos el primer nombre
        System.out.println("Ingrese nombre: ");
        String nom = scanner.next();

        while ( !nom.equals("FIN") ){

            mc.insertar(nom,0);
        }
        String aux;
        //recorremos la coleccion y tomamos cada uno de sus elementos
        for (int i = 0; i < mc.cantidad(); i++) {
        //el metodo obtener retona un Object
        //entonces tenemos que castear (convertir) a String
        aux = (String) mc.obtner(i);
            System.out.println(aux + " - " + aux.length() + " caracteres");
        }
    }
}
