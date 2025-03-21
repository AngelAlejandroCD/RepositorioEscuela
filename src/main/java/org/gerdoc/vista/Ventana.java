
        package org.gerdoc.vista;

import org.angel.model.figura.Cuadrado;
import org.angel.model.figura.Figura;
import org.gerdoc.historial.Historiales;
import org.lelsydoc.model.figura.Equilatero;
import org.leslydoc.model.figura.figura2.Isosceles;
import org.gerdoc.model.figura.figura2.Escaleno;
import org.angel.model.figura.figura2.Rectangulo;
import org.angel.model.figura.figura2.Circulo;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.util.ReadUtil;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable {
    private static Ventana ventana;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private Object figura;

    private Ventana() {
        super("Programa de figuras");
        init();
    }

    private void init() {
        jLabel = new JLabel("Dame un lado");
        jLabel.setBounds(10, 10, 100, 20);
        jTextField = new JTextField();
        jTextField.setBounds(120, 10, 100, 20);
        jButton = new JButton("Calcular");
        jButton.setBounds(10, 40, 100, 20);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel);
        getContentPane().add(jTextField);
        getContentPane().add(jButton);

        jButton.addActionListener((event) -> {
            // Default to Cuadrado for simplicity, but you can change this
            figura = new Cuadrado(); // From org.angel
            ((Cuadrado) figura).setLado(ReadUtil.string2Integer(jTextField.getText()));
            System.out.println(((Cuadrado) figura).area());
            System.out.println(((Cuadrado) figura).perimetro());
        });
    }

    public static Ventana getInstance() {
        if (ventana == null) {
            ventana = new Ventana();
        }
        return ventana;
    }

    @Override
    public void run() {
        setBounds(100, 100, 300, 200);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void addHistoriales(Historiales historiales) {

    }
}