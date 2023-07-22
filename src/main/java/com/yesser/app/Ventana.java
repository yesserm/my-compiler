package com.yesser.app;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;

public class Ventana extends JFrame {
    private static final java.util.logging.Logger LOGGER = Logger.getLogger(App.class.getName());

    static JDesktopPane desktopPane;
    static Ventana miVentana;
    public Ventana(){
        inicializar();
        miVentana = this;
    }

    private void inicializar() {
        setTitle("Mi Compilador");
        setName("vPrincipal");
        setBounds(200, 200, 1000, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        desktopPane = new JDesktopPane();
        getContentPane().add(desktopPane, BorderLayout.CENTER);
        agregarAVentana(Expresion.getInstancia());
    }

    public void mostrar(){
        setVisible(true);
    }
    public static void agregarAVentana(JInternalFrame ventanaInterna){
        desktopPane.add(ventanaInterna);
        Dimension dskSize = desktopPane.getSize();
        Dimension frmSize = ventanaInterna.getSize();
        LOGGER.info("desktop" + dskSize);
        ventanaInterna.setLocation(0,0);
        //ventanaInterna.setLocation((dskSize.width - frmSize.width) / 2, (dskSize.height - frmSize.height) / 2);
        ventanaInterna.setVisible(true);
    }
}
