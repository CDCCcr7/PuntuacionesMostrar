package com.company;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JLabel equipo1, equipo2;
    private JTextField campo1, campo2, score1, score2;
    private JButton boton1;

    public Ventana(){
        super("Marcador");
        //FlowLayout f = new FlowLayout();
        setLayout(null);
        equipo1 = new JLabel("EQUIPO 1");
        equipo1.setBounds(100, 100, 85, 25);
        equipo2 = new JLabel("EQUIPO 2");
        equipo2.setBounds(100, 150, 85, 25);
        campo1 = new JTextField(50);
        campo1.setBounds(200, 100, 150, 25);
        campo2 = new JTextField(50);
        campo2.setBounds(200, 150, 150, 25);
        score1 = new JTextField(20);
        score1.setBounds(400, 100, 25,25);
        score2 = new JTextField(20);
        score2.setBounds(400, 150, 25, 25);
        boton1 = new JButton("Aceptar");
        boton1.setBounds(250, 200, 100, 25);

        add(equipo1);
        add(equipo2);
        add(campo1);
        add(campo2);
        add(score1);
        add(score2);
        add(boton1);
    }

}
