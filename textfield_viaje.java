package usuarios;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;

/**
 * Write a description of class textfield_pasajero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class textfield_viaje extends JPanel
{
    // instance variables - replace the example below with your own
    private JTextField textedit_viaje;

    /**
     * Constructor for objects of class textfield_pasajero
     */
    public textfield_viaje()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(300,20));        
        this.setLocation(10,140);
        this.setBackground(Color.white);
        this.textedit_viaje = new JTextField("pnt salida/destino salida(dia/mes/año) llegada(dia/mes/año)");
        add(textedit_viaje);
    }    
}
