package org.angel.model.figura.figura2;

import org.angel.util.ReadUtil;
import org.angel.vista.Menu;

public class Rectangulo extends Cuadrilatero {

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        super(lado1, lado2);
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }

    @Override
    public double perimetro() {
        return 2 * (lado1 + lado2);
    }

    @Override
    public void leeDatos() {
        Menu.leeLado1();
        lado1 = ReadUtil.readInt();
        Menu.leeLado2();
        lado2 = ReadUtil.readInt();
    }
}