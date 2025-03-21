package org.angel.model.figura.figura2;

import org.angel.model.figura.Figura;
import org.angel.util.ReadUtil;
import org.angel.vista.Menu;

public class Pentagono extends Figura {
    private double lado;
    private double apotema;

    public Pentagono() {
    }

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double area() {
        return (5 * lado * apotema) / 2;
    }

    @Override
    public double perimetro() {
        return 5 * lado;
    }

    @Override
    public void leeDatos() {
        Menu.leeLado();
        lado = ReadUtil.readInt();
        Menu.leeApotema();
        apotema = ReadUtil.readInt();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
}