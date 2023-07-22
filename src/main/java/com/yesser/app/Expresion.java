package com.yesser.app;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.security.PublicKey;

public class Expresion extends JInternalFrame {
    private JTextField txtExpresion;
    private JButton btnEvaluar;

    static Expresion miExpresion;

    public Expresion(){
        super("Expresion", true, true, true);
        inicializarExpresion();
        miExpresion = this;
    }

    private void inicializarExpresion() {
        setToolTipText("Datos de la Expresion");
        setOpaque(true);
        setBorder(new LineBorder(new Color(0, 0, 0)));
        setIconifiable(false);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JLabel label1 = new JLabel("expresion:");
        JTextField textField1 = new JTextField();
        textField1.setColumns(30);
        JButton button = new JButton("Aceptar");
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empresa", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.black));
        panel.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(label1);
        panel.add(textField1);
        panel.add(button);

        //Caracteristicas del formulario
        setName("Expresion");
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().setPreferredSize(new Dimension(800,400));
        pack();
    }

    public static Expresion getInstancia() {
        return null == miExpresion ? (new Expresion()) : miExpresion;
    }
}
