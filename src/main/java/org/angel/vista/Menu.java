package org.angel.vista;

import org.angel.model.figura.Figura;

public class Menu {
    public static void principal() {
        System.out.println("WELCOME");
        System.out.println("PROGRAMA DE FIGURAS");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Equilatero");
        System.out.println("3.- Isosceles");
        System.out.println("4.- Escaleno");
        System.out.println("5.- Rectangulo");
        System.out.println("6.- Rombo");
        System.out.println("7.- Circulo");
        System.out.println("8.- Pentagono");
        System.out.println("9.- Poligono Regular");
        System.out.println("10.- Salir");
    }

    public static void principal2() {
        System.out.println("WELCOME");
        System.out.println("PROGRAMA DE FIGURAS");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- Salir");
    }

    public static void opcionInvalida() {
        System.out.println("La opción no es correcta");
    }

    public static void seleccionaOpcion() {
        System.out.println("Dame una opción");
    }

    public static void errorDato() {
        System.out.println("No es un dato valido");
    }

    public static void calcula(Figura figura) {
        System.out.println("El area es: " + figura.area());
        System.out.println("El perimetro es: " + figura.perimetro());
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


    public static void leeDiagonal1() {
        System.out.println("Dame la diagonal 1");
    }

    public static void leeDiagonal2() {
        System.out.println("Dame la diagonal 2");
    }
    public static void leeRadio() {
        System.out.println("Dame el radio");
    }

    public static void leeApotema() {
        System.out.println("Dame la apotema");
    }

    public static void leeNumLados() {
        System.out.println("Dame el número de lados");
    }
}