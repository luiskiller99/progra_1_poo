 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;

/**
 * Write a description of class textedit_usu_adm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class textedit_cont_adm extends JPanel
{
    // instance variables - replace the example below with your own
    private JTextField textedit_administrador;

    /**
     * Constructor for objects of class textedit_usu_adm
     */
    public textedit_cont_adm()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));        
        this.setLocation(120,200);
        this.setBackground(Color.white);
        this.textedit_administrador = new JTextField("");
        add(textedit_administrador);
    }
}
