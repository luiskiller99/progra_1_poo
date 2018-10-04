 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;

/**
 * Write a description of class label_cont_adm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class label_cont_adm extends JPanel
{
    // instance variables - replace the example below with your own
    private JLabel label_administrador;

    /**
     * Constructor for objects of class label_cont_adm
     */
    public label_cont_adm()
    {
        // put your code here
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));        
        this.setLocation(10,200);
        this.setBackground(Color.white);
        this.label_administrador = new JLabel("Contraseña: ");
        add(label_administrador); 
    }
}
