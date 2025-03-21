package org.angel.model.figura.figura2;

import org.angel.model.figura.Figura;
import org.angel.util.ReadUtil;
import org.angel.vista.Menu;

public class Circulo extends Figura {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void leeDatos() {
        Menu.leeRadio();
        radio = ReadUtil.readInt();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}