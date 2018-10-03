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
public class textfield_vehiculo extends JPanel
{
    // instance variables - replace the example below with your own
    private JTextField textedit_vehiculo;

    /**
     * Constructor for objects of class textfield_pasajero
     */
    public textfield_vehiculo()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(300,20));        
        this.setLocation(10,170);
        this.setBackground(Color.white);
        this.textedit_vehiculo = new JTextField("placa/año/capacidad/kilometraje/numero vinn/color/marca/sede/estado");
        add(textedit_vehiculo);
    }    
}
