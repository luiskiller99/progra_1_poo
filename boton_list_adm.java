 
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
public class boton_list_adm extends JPanel
{
    // instance variables - replace the example below with your own
    private JButton boton_list;
    /**
     * Constructor for objects of class boton_pasajero
     */
    public boton_list_adm()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));                        
        this.setLocation(350,400);            
        this.setBackground(Color.white);
        this.boton_list = new JButton("Listar");               
        boton_list.addActionListener(new act_bot());
        add(boton_list);
    }
    private class act_bot implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //new ventana_secretaria(); 
            //accion de venteana
        }
    }

    
}
