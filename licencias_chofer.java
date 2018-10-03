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
public class licencias_chofer extends JPanel
{
    // instance variables - replace the example below with your own
    private JTextField textedit_chofer;

    /**
     * Constructor for objects of class textfield_pasajero
     */
    public licencias_chofer()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(300,20));        
        this.setLocation(10,80);
        this.setBackground(Color.white);
        this.textedit_chofer = new JTextField("numero /fecha exp(dd//mm//aa) /fecha emi(dd/mm/aa))");
        add(textedit_chofer);
    }    
}
