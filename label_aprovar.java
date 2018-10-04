 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;

/**
 * Write a description of class label_pasajero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class label_aprovar extends JPanel
{
    // instance variables - replace the example below with your own
    private JLabel label_titulo_apro;

    /**
     * Constructor for objects of class label_pasajero
     */
    public label_aprovar()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(150,20));        
        this.setLocation(10,310);
        this.setBackground(Color.white);
        this.label_titulo_apro = new JLabel("Aprovar solicitud de viaje");
        add(label_titulo_apro);
    }

 
}
