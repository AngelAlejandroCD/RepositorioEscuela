package org.angel.model.figura;

import org.angel.vista.SolicitaDatos;
import org.gerdoc.util.ReadUtil;

public class Cuadrado implements SolicitaDatos {
    private int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public void leeDatos() {
        System.out.print("Introduce el lado del cuadrado: ");
        this.lado = ReadUtil.readInt(); // Read the side length
    }

    public double area() {
        return lado * lado; // Calculate area
    }

    public double perimetro() {
        return 4 * lado; // Calculate perimeter
    }
}