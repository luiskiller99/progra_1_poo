 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;

/**
 * Write a description of class boton_pasajero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boton_topcho extends JPanel
{
    // instance variables - replace the example below with your own
    private JButton boton_topcho;
    /**
     * Constructor for objects of class boton_pasajero
     */
    public boton_topcho()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(130,20));                        
        this.setLocation(10,400);            
        this.setBackground(Color.white);
        this.boton_topcho = new JButton("Top choferes");               
        boton_topcho.addActionListener(new act_bot());
        add(boton_topcho);
    }
    private class act_bot implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //new ventana_secretaria(); 
            //accion de venteana
        }
    }

    
}
