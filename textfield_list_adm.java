 
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
public class textfield_list_adm extends JPanel
{
    // instance variables - replace the example below with your own
    private JTextField textedit_apro;

    /**
     * Constructor for objects of class textfield_pasajero
     */
    public textfield_list_adm()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(300,350));        
        this.setLocation(350,40);
        this.setBackground(Color.white);
        this.textedit_apro = new JTextField("aqui mostrar");
        add(textedit_apro);
    }    
}
