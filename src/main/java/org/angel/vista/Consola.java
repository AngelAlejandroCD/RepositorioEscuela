package org.angel.vista;

import org.angel.model.figura.Cuadrado;
import org.angel.model.figura.Equilatero;
import org.angel.model.figura.Figura;
import org.angel.model.figura.figura2.*;
import org.angel.util.ReadUtil;

public class Consola implements Ejecutable
{
    private static Consola consola;
    private Consola()
    {
    }

    public static Consola getInstance( )
    {
        if(consola==null)
        {
            return new Consola();
        }
        return consola;
    }

    @Override
    public void run() {
        boolean flag = true;
        int opcion = 0;
        Figura figura = null;
        while (flag) {
            Menu.principal();
            Menu.seleccionaOpcion();
            opcion = ReadUtil.readInt();
            figura = null;
            switch (opcion) {
                case 1:
                    figura = new Figura() {
                        @Override
                        public double area() {
                            return 0;
                        }

                        @Override
                        public double perimetro() {
                            return 0;
                        }
                    };
                    break;
                case 2:
                    figura = new Equilatero();
                    break;
                case 3:
                    figura = new Isosceles();
                    break;
                case 4:
                    figura = new Escaleno();
                    break;
                case 5:
                    figura = new Rectangulo();
                    break;
                case 6:
                    figura = new Rombo();
                    break;
                case 7:
                    figura = new Circulo();
                    break;
                case 8:
                    figura = new Pentagono();
                    break;
                case 9:
                    figura = new PoligonoRegular();
                    break;
                case 10:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();
            }
            if (figura != null) {
                ((SolicitaDatos) figura).leeDatos();
                Menu.calcula(figura);
            }
        }
    }

}