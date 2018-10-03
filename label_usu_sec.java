package usuarios;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;

/**
 * Write a description of class label_usu_sec here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class label_usu_sec extends JPanel
{
    // instance variables - replace the example below with your own
    private JLabel label_secretaria;

    /**
     * Constructor for objects of class label_usu_sec
     */
    public label_usu_sec()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));        
        this.setLocation(10,100);
        this.setBackground(Color.white);
        this.label_secretaria = new JLabel("Usuario: ");
        add(label_secretaria);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}
