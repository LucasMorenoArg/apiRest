package com.example.algoritmos;

public abstract class FiguraGeometrica {

    private String nombre;

    public FiguraGeometrica (String  nom){
        this.nombre = nom;
    }

    public abstract double area();

    public String toString(){
        return nombre + " (area = " + area()+")";
    }
}
