package usuarios;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;

public class boton_sec extends JPanel{    
    //boton secrtaria
    private JButton boton_secretaria;
    public boton_sec(){    
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));                        
        this.setLocation(380,300);            
        this.setBackground(Color.white);
        this.boton_secretaria = new JButton("Ingresar");               
        boton_secretaria.addActionListener(new secretaria());
        add(boton_secretaria);
    }
    private class secretaria implements ActionListener{
        public void actionPerformed(ActionEvent e){            
            new ventana_secretaria();
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
    
       
    

