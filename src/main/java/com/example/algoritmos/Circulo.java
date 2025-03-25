package com.example.algoritmos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circulo extends FiguraGeometrica{

    private int radio;

    public Circulo(int rad) {
        super("Circulo");
        radio = rad;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio,2);
    }
}
