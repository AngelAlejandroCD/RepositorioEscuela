package org.angel.model.figura.figura2;

import org.angel.model.figura.Figura;
import org.angel.util.ReadUtil;
import org.angel.vista.Menu;

public class PoligonoRegular extends Figura {
    private int numLados;
    private double lado;
    private double apotema;

    public PoligonoRegular() {
    }

    public PoligonoRegular(int numLados, double lado, double apotema) {
        this.numLados = numLados;
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double area() {
        return (numLados * lado * apotema) / 2;
    }

    @Override
    public double perimetro() {
        return numLados * lado;
    }

    @Override
    public void leeDatos() {
        Menu.leeNumLados();
        numLados = ReadUtil.readInt();
        Menu.leeLado();
        lado = ReadUtil.readInt();
        Menu.leeApotema();
        apotema = ReadUtil.readInt();
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
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