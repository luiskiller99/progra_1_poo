package usuarios;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;

/**
 * Write a description of class label_cont_sec here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class titulo_adm extends JPanel
{
    // instance variables - replace the example below with your own
    private JLabel label_titulo_adm;

    /**
     * Constructor for objects of class label_cont_sec
     */
    public titulo_adm()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));        
        this.setLocation(50,50);
        this.setBackground(Color.white);
        this.label_titulo_adm = new JLabel("Administrador");
        add(label_titulo_adm);
    }
}
