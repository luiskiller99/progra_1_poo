package usuarios;
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
public class label_cancelar extends JPanel
{
    // instance variables - replace the example below with your own
    private JLabel label_viaje_titulo;

    /**
     * Constructor for objects of class label_pasajero
     */
    public label_cancelar()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(150,20));        
        this.setLocation(350,10);
        this.setBackground(Color.white);
        this.label_viaje_titulo = new JLabel("Cancelar viaje");
        add(label_viaje_titulo);
    }

 
}
