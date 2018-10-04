 
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
public class textfield_panel_listar extends JPanel
{
    // instance variables - replace the example below with your own
    private JList textedit;
    private JTextField textedit_listar;
    /**
     * Constructor for objects of class textfield_pasajero
     */
    public textfield_panel_listar()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(300,300));        
        this.setLocation(10,320);
        this.setBackground(Color.white);
        this.textedit_listar = new JTextField("aqui mostrar");
        add(textedit_listar);
    }    
}
