package usuarios;
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
public class boton_cancelar extends JPanel
{
    // instance variables - replace the example below with your own
    private JButton boton_listar_destino;
    /**
     * Constructor for objects of class boton_pasajero
     */
    public boton_cancelar()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));                        
        this.setLocation(350,70);            
        this.setBackground(Color.white);
        this.boton_listar_destino = new JButton("Cancelar");               
        boton_listar_destino.addActionListener(new act_bot());
        add(boton_listar_destino);
    }
    private class act_bot implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //new ventana_secretaria(); 
            //accion de venteana
        }
    }    
}
