package usuarios;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;
/**
 * Write a description of class botones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boton_adm extends JPanel{    
    private JButton boton_administrador;
    public boton_adm(){
        //boton administrador
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));
        this.setLocation(120,300);
        this.setBackground(Color.white);
        this.boton_administrador = new JButton("Ingresar");
        boton_administrador.addActionListener(new administrador());
        add(boton_administrador);
    }
    private class administrador implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new ventana_administrador();
        }
    }
    private class aviso implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JOptionPane mensaje=new JOptionPane();
            mensaje.showMessageDialog(null,"hola soy una ventana mensaje",
            "boton",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
