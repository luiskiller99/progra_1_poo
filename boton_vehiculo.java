 
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
public class boton_vehiculo extends JPanel
{
    // instance variables - replace the example below with your own
    private JButton boton_vehiculo;
    /**
     * Constructor for objects of class boton_pasajero
     */
    public boton_vehiculo()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));                        
        this.setLocation(10,190);            
        this.setBackground(Color.white);
        this.boton_vehiculo = new JButton("Registrar");               
        boton_vehiculo.addActionListener(new act_bot());
        add(boton_vehiculo);
    }
    private class act_bot implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //new ventana_secretaria(); 
            //accion de venteana
        }
    }

    
}
