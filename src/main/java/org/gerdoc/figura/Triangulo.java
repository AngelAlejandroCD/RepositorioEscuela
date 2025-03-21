package org.gerdoc.figura;


import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.SolicitaDatos;
public class Triangulo implements SolicitaDatos {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
    }

    public Triangulo() {
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void leeDatos() {
        System.out.print("Introduce la base del triángulo: ");
        this.base = ReadUtil.readDouble(); // Assuming you have a method to read double
        System.out.print("Introduce la altura del triángulo: ");
        this.altura = ReadUtil.readDouble(); // Assuming you have a method to read double
    }

    public double area() {
        return (base * altura) / 2; // Calculate area
    }

    public double perimetro() {
        // Implement perimeter calculation if needed
        return 0; // Placeholder
    }
}