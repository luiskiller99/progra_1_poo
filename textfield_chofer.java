 
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
public class textfield_chofer extends JPanel
{
    // instance variables - replace the example below with your own
    private JTextField textedit_pasajero;

    /**
     * Constructor for objects of class textfield_pasajero
     */
    public textfield_chofer()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(300,20));        
        this.setLocation(10,50);
        this.setBackground(Color.white);
        this.textedit_pasajero = new JTextField("cedula/nombre/correo/telefono");
        add(textedit_pasajero);
    }    
}
