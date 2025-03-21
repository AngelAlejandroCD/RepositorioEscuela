package org.leslydoc.vista;

import org.angel.model.figura.Cuadrado; // Import from org.angel
import org.angel.model.figura.Figura;
import org.lelsydoc.model.figura.Equilatero; // Import from org.leslydoc
import org.leslydoc.model.figura.figura2.Isosceles; // Import from org.leslydoc
import org.gerdoc.model.figura.figura2.Escaleno; // Import from org.gerdoc
import org.angel.model.figura.figura2.Rectangulo; // Import from org.gerdoc
import org.angel.model.figura.figura2.Circulo; // Import from org.angel
import org.gerdoc.util.ReadUtil;

public class Consola implements Ejecutable {
    private static Consola consola;

    private Consola() {
    }

    public static Consola getInstance() {
        if (consola == null) {
            consola = new Consola();
        }
        return consola;
    }

    @Override
    public void run() {
        boolean flag = true;
        int opcion = 0;
        Object figura = null;

        while (flag) {
            Menu.principal();
            Menu.seleccionaOpcion();
            opcion = ReadUtil.readInt();
            figura = null;
            switch (opcion) {
                case 1:
                    figura = new Cuadrado(); // From org.angel
                    break;
                case 2:
                    figura = new Equilatero(); // From org.leslydoc
                    break;
                case 3:
                    figura = new Isosceles(); // From org.leslydoc
                    break;
                case 4:
                    figura = new Escaleno(); // From org.gerdoc
                    break;
                case 5:
                    figura = new Rectangulo(); // From org.gerdoc
                    break;
                case 6:
                    figura = new Circulo(); // From org.angel
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();
            }
            if (figura != null && figura instanceof SolicitaDatos) {
                ((SolicitaDatos) figura).leeDatos();
                Menu.calcula((Figura) figura);
            }
        }
    }
}