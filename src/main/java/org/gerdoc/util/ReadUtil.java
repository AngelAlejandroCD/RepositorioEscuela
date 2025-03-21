package org.gerdoc.util;

import org.gerdoc.vista.Menu;

import java.util.Scanner;

public class ReadUtil {
    private Scanner scanner;
    private static ReadUtil readUtil;

    private ReadUtil() {
        scanner = new Scanner(System.in);
    }

    public static ReadUtil getInstance() {
        if (readUtil == null) {
            readUtil = new ReadUtil();
        }
        return readUtil;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public static String read() {
        return getInstance().getScanner().nextLine();
    }

    public static Double readDouble() {
        String valor = null;
        boolean flag = true;
        Double aux = null;

        while (flag) {
            valor = read();
            if (valor != null && !valor.isEmpty()) {
                try {
                    aux = Double.valueOf(valor);
                    if (aux != null) {
                        return aux;
                    }
                } catch (Exception e) {
                    Menu.errorDato(); // Mostrar mensaje de error si la conversión falla
                }
            } else {
                Menu.errorDato(); // Mostrar mensaje de error si el valor es nulo o vacío
            }
        }
        return null;
    }

    public static Integer readInt() {
        String valor = null;
        boolean flag = true;
        Integer aux = null;

        while (flag) {
            valor = read();
            if (valor != null && !valor.isEmpty()) {
                try {
                    aux = Integer.valueOf(valor);
                    if (aux != null) {
                        return aux;
                    }
                } catch (Exception e) {
                    Menu.errorDato(); // Mostrar mensaje de error si la conversión falla
                }
            } else {
                Menu.errorDato(); // Mostrar mensaje de error si el valor es nulo o vacío
            }
        }
        return null;
    }

    public static Integer string2Integer(String valor) {
        try {
            return Integer.valueOf(valor);
        } catch (Exception e) {
            Menu.errorDato(); // Mostrar mensaje de error si la conversión falla
        }
        return null;
    }
}