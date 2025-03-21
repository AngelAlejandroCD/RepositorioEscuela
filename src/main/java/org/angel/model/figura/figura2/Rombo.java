package org.angel.model.figura.figura2;

import org.angel.util.ReadUtil;
import org.angel.vista.Menu;

public class Rombo extends Cuadrilatero {

    public Rombo() {
    }

    public Rombo(double diagonal1, double diagonal2) {
        super(diagonal1, diagonal2);
    }

    @Override
    public double area() {
        // Área = (d1 * d2) / 2
        return (lado1 * lado2) / 2;
    }

    @Override
    public double perimetro() {
        // Calculamos la longitud de un lado usando el teorema de Pitágoras
        double lado = Math.sqrt(Math.pow(lado1 / 2, 2) + Math.pow(lado2 / 2, 2));
        // Perímetro = 4 * lado
        return 4 * lado;
    }

    @Override
    public void leeDatos() {
        Menu.leeDiagonal1();
        lado1 = ReadUtil.readInt(); // Diagonal 1
        Menu.leeDiagonal2();
        lado2 = ReadUtil.readInt(); // Diagonal 2
    }
}