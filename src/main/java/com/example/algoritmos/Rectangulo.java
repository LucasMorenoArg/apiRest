package com.example.algoritmos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return 0;
    }
}
