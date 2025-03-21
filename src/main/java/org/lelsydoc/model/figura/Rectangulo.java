package org.lelsydoc.model.figura;

import org.leslydoc.util.ReadUtil;
import org.leslydoc.vista.Menu;

public class Rectangulo extends Figura
{
    private double base;
    private double altura;

    public Rectangulo()
    {
    }

    public Rectangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area()
    {
        return base * altura;
    }

    @Override
    public double perimetro()
    {
        return 2 * (base + altura);
    }

    @Override
    public void leeDatos()
    {
        Menu.leeBase();
        base = ReadUtil.readInt( );

        Menu.leeAltura();
        altura = ReadUtil.readInt( );
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }
}
