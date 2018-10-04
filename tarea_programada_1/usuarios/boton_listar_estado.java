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
public class boton_listar_estado extends JPanel
{
    // instance variables - replace the example below with your own
    private JButton boton_listar_estado;
    /**
     * Constructor for objects of class boton_pasajero
     */
    public boton_listar_estado()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));                        
        this.setLocation(120,280);            
        this.setBackground(Color.white);
        this.boton_listar_estado = new JButton("Listar");               
        boton_listar_estado.addActionListener(new act_bot());
        add(boton_listar_estado);
    }
    private class act_bot implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //new ventana_secretaria(); 
            //accion de venteana
        }
    }    
}
