package org.gerdoc.vista;

import org.angel.model.figura.Cuadrado;
import org.angel.model.figura.figura2.Circulo;
import org.angel.model.figura.figura2.Rectangulo;
import org.gerdoc.model.figura.figura2.Escaleno;
import org.lelsydoc.model.figura.Equilatero;
import org.leslydoc.model.figura.figura2.Isosceles;

public class Menu {
    public static void principal() {
        System.out.println("WELCOME");
        System.out.println("PROGRAMA DE FIGURAS");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Cuadrado (org.angel)");
        System.out.println("2.- Equilatero (org.leslydoc)");
        System.out.println("3.- Isosceles (org.leslydoc)");
        System.out.println("4.- Escaleno (org.gerdoc)");
        System.out.println("5.- Rectangulo (org.gerdoc)");
        System.out.println("6.- Circulo  (org.angel)");
        System.out.println("7.- Salir");
    }

    public static void seleccionaOpcion() {
        System.out.println("Dame una opción");
    }

    public static void opcionInvalida() {
        System.out.println("La opción no es correcta");
    }

    public static void calcula(Isosceles figura) {
        System.out.println("El area es: " + figura.area());
        System.out.println("El perimetro es: " + figura.perimetro());
    }
    public static void calcula(Cuadrado figura) {
        System.out.println("El area es: " + figura.area());
        System.out.println("El perimetro es: " + figura.perimetro());
    }
    public static void calcula(Equilatero figura) {
        System.out.println("El area es: " + figura.area());
        System.out.println("El perimetro es: " + figura.perimetro());
    }    public static void calcula(Escaleno figura) {
        System.out.println("El area es: " + figura.area());
        System.out.println("El perimetro es: " + figura.perimetro());

    }
    public static void calcula(Rectangulo figura) {
        System.out.println("El area es: " + figura.area());
        System.out.println("El perimetro es: " + figura.perimetro());
    }
    public static void calcula(Circulo figura) {
        System.out.println("El area es: " + figura.area());
        System.out.println("El perimetro es: " + figura.perimetro());
    }


    public static void principal2() {
        System.out.println("WELCOME");
        System.out.println("PROGRAMA DE FIGURAS");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- Historial");
        System.out.println("4.- Salir");
    }

    public static void errorDato() {
    }

    public static void leeLado() {
        System.out.println("Dame un lado");
    }

    public static void leeBase() {
        System.out.println("Dame una base");
    }

    public static void leeAltura() {
        System.out.println("Dame una altura");
    }

    public static void leeLado1() {
        System.out.println("Dame un lado 1");
    }

    public static void leeLado2() {
        System.out.println("Dame un lado 2");
    }

    public static void leeLado3() {
        System.out.println("Dame un lado 3");
    }
}
