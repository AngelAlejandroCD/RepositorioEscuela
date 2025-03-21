package org.gerdoc.vista;

import org.angel.model.figura.Cuadrado; // Import from org.angel
import org.angel.model.figura.figura2.Circulo; // Import from org.angel
import org.gerdoc.historial.Historiales;
import org.lelsydoc.model.figura.Equilatero; // Import from org.leslydoc
import org.leslydoc.model.figura.figura2.Isosceles; // Import from org.leslydoc
import org.gerdoc.model.figura.figura2.Escaleno; // Import from org.gerdoc
import org.angel.model.figura.figura2.Rectangulo; // Import from org.gerdoc
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

        while (flag) {
            Menu.principal(); // Display the main menu
            Menu.seleccionaOpcion(); // Prompt for option
            opcion = ReadUtil.readInt(); // Read user input

            switch (opcion) {
                case 1: // Cuadrado
                    Cuadrado cuadrado = new Cuadrado();
                    cuadrado.leeDatos(); // Read data for Cuadrado
                    Menu.calcula(cuadrado); // Calculate and display results
                    break;
                case 2: // Equilatero
                    Equilatero equilatero = new Equilatero();
                    equilatero.leeDatos(); // Read data for Equilatero
                    Menu.calcula(equilatero); // Calculate and display results
                    break;
                case 3: // Isosceles
                    Isosceles isosceles = new Isosceles();
                    isosceles.leeDatos(); // Read data for Isosceles
                    Menu.calcula(isosceles); // Calculate and display results
                    break;
                case 4: // Escaleno
                    Escaleno escaleno = new Escaleno();
                    escaleno.leeDatos(); // Read data for Escaleno
                    Menu.calcula(escaleno); // Calculate and display results
                    break;
                case 5: // Rectangulo
                    Rectangulo rectangulo = new Rectangulo();
                    rectangulo.leeDatos(); // Read data for Rectangulo
                    Menu.calcula(rectangulo); // Calculate and display results
                    break;
                case 6: // Circulo
                    Circulo circulo = new Circulo();
                    circulo.leeDatos(); // Read data for Circulo
                    Menu.calcula(circulo); // Calculate and display results
                    break;
                case 7: // Exit
                    flag = false; // Exit the loop
                    break;
                default:
                    Menu.opcionInvalida(); // Handle invalid option
            }
        }
    }

    @Override
    public void addHistoriales(Historiales historiales) {

    }
}