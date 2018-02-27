package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana xxx = new Ventana();
                Toolkit miPantalla = Toolkit.getDefaultToolkit();
                Dimension tamañoPantalla = miPantalla.getScreenSize();
                int alturaMarco = tamañoPantalla.height;
                int anchoMarco = tamañoPantalla.width;

                xxx.setTitle("Marcacion");
                xxx.setSize(anchoMarco/2, alturaMarco/2);
                xxx.setLocation(anchoMarco/4, alturaMarco/4);
                xxx.setVisible(true);
                xxx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Image icono = miPantalla.getImage("balonFutbol1.jpg");
                xxx.setIconImage(icono);
                /*xxx.setSize(600,400);
                xxx.setVisible(true);
                xxx.setLocation(600, 400);*/
            }
        });
    }
}
