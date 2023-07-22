package com.yesser.app;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LOGGER.info("Mostrando la ventana");
        Ventana miVentana = new Ventana();
        miVentana.mostrar();
    }
}
