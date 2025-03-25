package com.example.algoritmos;

public class Circulo extends FiguraGeometrica{

    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio,2);
    }
}
