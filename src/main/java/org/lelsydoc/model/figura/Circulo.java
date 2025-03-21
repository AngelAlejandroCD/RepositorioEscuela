package org.lelsydoc.model.figura;

import org.leslydoc.util.ReadUtil;
import org.leslydoc.vista.Menu;

public class Circulo extends Figura
{

    private double radio;


    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return 3.14 * radio * radio;
    }

    @Override
    public double perimetro() {
        return 3.14 * (2*radio);
    }

    @Override
    public void leeDatos() {
        Menu.leeRadio();
        radio = ReadUtil.readInt( );
    }
}
