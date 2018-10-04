 
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
public class label_cont_sec extends JPanel
{
    // instance variables - replace the example below with your own
    private JLabel label_secretaria;

    /**
     * Constructor for objects of class label_cont_sec
     */
    public label_cont_sec()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));        
        this.setLocation(270,200);
        this.setBackground(Color.white);
        this.label_secretaria = new JLabel("Contraseña: ");
        add(label_secretaria);
    }
}
