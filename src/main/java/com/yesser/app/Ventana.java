package com.yesser.app;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    static JDesktopPane desktopPane;
    static Ventana miVentana;
    public Ventana(){
        inicializar();
        miVentana = this;
    }

    private void inicializar() {
        setTitle("Mi Compilador");
        setName("vPrincipal");
        setBounds(100, 100, 626, 375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        desktopPane = new JDesktopPane();
        getContentPane().add(desktopPane, BorderLayout.CENTER);
    }

    public void mostrar(){
        setVisible(true);
    }
}
