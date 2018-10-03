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
public class textfield_detalle extends JPanel
{
    // instance variables - replace the example below with your own
    private JTextField textedit_detalle;

    /**
     * Constructor for objects of class textfield_pasajero
     */
    public textfield_detalle()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));        
        this.setLocation(350,130);
        this.setBackground(Color.white);
        this.textedit_detalle = new JTextField("consecutivo");
        add(textedit_detalle);
    }    
}
