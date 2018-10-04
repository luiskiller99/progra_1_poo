 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;

/**
 * Write a description of class label_usu_adm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class label_usu_adm extends JPanel
{
    // instance variables - replace the example below with your own
    private JLabel label_administrador;
    
    public label_usu_adm()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));        
        this.setLocation(270,100);
        this.setBackground(Color.white);
        this.label_administrador = new JLabel("Usuario: ");
        add(label_administrador);
    }    
}
