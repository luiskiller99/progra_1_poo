 
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
public class titulo_sec extends JPanel
{
    // instance variables - replace the example below with your own
    private JLabel label_titulo_sec;

    /**
     * Constructor for objects of class label_cont_sec
     */
    public titulo_sec()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));        
        this.setLocation(350,50);
        this.setBackground(Color.white);
        this.label_titulo_sec = new JLabel("Secretaria");
        add(label_titulo_sec);
    }
}
