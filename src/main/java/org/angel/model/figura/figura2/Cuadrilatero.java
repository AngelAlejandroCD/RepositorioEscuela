package org.angel.model.figura.figura2;

import org.angel.model.figura.Figura;
import org.angel.vista.SolicitaDatos;

public abstract class Cuadrilatero extends Figura implements SolicitaDatos {
    protected double lado1;
    protected double lado2;

    public Cuadrilatero() {
    }

    public Cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public abstract double area();

    @Override
    public abstract double perimetro();
}