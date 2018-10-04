 
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
public class boton_registrar extends JPanel
{
    // instance variables - replace the example below with your own
    private JButton boton_registrar;
    /**
     * Constructor for objects of class boton_pasajero
     */
    public boton_registrar()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));                        
        this.setLocation(10,280);            
        this.setBackground(Color.white);
        this.boton_registrar = new JButton("Registrar");               
        boton_registrar.addActionListener(new act_bot());
        add(boton_registrar);
    }
    private class act_bot implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //new ventana_secretaria(); 
            //accion de venteana
        }
    }

    
}
