package usuarios;
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
public class textedit_usu_sec extends JPanel
{
    // instance variables - replace the example below with your own
    private JTextField textedit_secretaria;

    /**
     * Constructor for objects of class textedit_usu_adm
     */
    public textedit_usu_sec()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));        
        this.setLocation(380,100);
        this.setBackground(Color.white);
        this.textedit_secretaria = new JTextField("");
        add(textedit_secretaria);
    }
}
