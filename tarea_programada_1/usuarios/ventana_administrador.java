package usuarios;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;
/**
 * Write a description of class ventana_administrador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ventana_administrador
{
    JFrame pane;
    JLabel label_chofer = new JLabel("Registrar nuevo chofer");
    JTextField textfield_chofer = new JTextField("cedula/nombre/correo/telefono");
    JButton boton_chofer= new JButton("Registrar");  
    JTextField licencias_chofer= new JTextField("numero /fecha exp(dd//mm//aa) /fecha emi(dd/mm/aa))");
    JLabel label_vehiculo = new JLabel("Registrar nuevo vehiculo");
    JTextField textfield_vehiculo = new JTextField("placa/año/capacidad/kilometraje/numero vinn/color/marca/sede/estado");
    JButton boton_vehiculo = new JButton("Registrar");      
    JLabel label_list_adm = new JLabel("Listar informacion");
    JTextField textfield_list_adm = new JTextField("aqui mostrar");
    
    public ventana_administrador(){
        configuraciones();
    }
    private void configuraciones(){
        pane=new JFrame();
        pane.getContentPane().setBackground(Color.WHITE);
        pane.getContentPane().setLayout(null);
        pane.setResizable(false);//no permite hacer mas grande
        pane.setUndecorated(false);//quita decoraciones
        pane.setSize(700,500);
        pane.setTitle("Administrador");
        pane.setLocationRelativeTo(null);
        pane.setVisible(true);

        pane.add(label_chofer);
        pane.add(textfield_chofer);
        pane.add(boton_chofer);
        pane.add(licencias_chofer);
        pane.add(label_vehiculo);
        pane.add(textfield_vehiculo);
        pane.add(boton_vehiculo);
        pane.add(textfield_list_adm);
        pane.add(label_list_adm);
        
        //label_chofer
        label_chofer.setBounds(new Rectangle(150,20));        
        label_chofer.setLocation(10,10);
        label_chofer.setBackground(Color.white);
        //textfield_chofer
        textfield_chofer.setBounds(new Rectangle(300,20));        
        textfield_chofer.setLocation(10,50);
        textfield_chofer.setBackground(Color.white);
        //boton_chofer
        boton_chofer.setBounds(new Rectangle(100,20));                        
        boton_chofer.setLocation(10,100);            
        boton_chofer.setBackground(Color.white);
        boton_chofer.addActionListener(new act_bot());
        //licencias_chofer
        licencias_chofer.setBounds(new Rectangle(300,20));        
        licencias_chofer.setLocation(10,80);
        licencias_chofer.setBackground(Color.white);
        //label_vehiculo
        label_vehiculo.setBounds(new Rectangle(150,20));        
        label_vehiculo.setLocation(10,130);
        label_vehiculo.setBackground(Color.white);
        //textfield_vehiculo
        textfield_vehiculo.setBounds(new Rectangle(300,20));        
        textfield_vehiculo.setLocation(10,170);
        textfield_vehiculo.setBackground(Color.white);
        //boton_vehiculo
        boton_vehiculo.setBounds(new Rectangle(100,20));                        
        boton_vehiculo.setLocation(10,190);            
        boton_vehiculo.setBackground(Color.white);
        boton_vehiculo.addActionListener(new act_bot());
        //label_list_adm
        label_list_adm.setBounds(new Rectangle(150,20));        
        label_list_adm.setLocation(350,10);
        label_list_adm.setBackground(Color.white);
        //textfield_list_adm
        textfield_list_adm.setBounds(new Rectangle(300,350));        
        textfield_list_adm.setLocation(350,40);
        textfield_list_adm.setBackground(Color.white);
        //boton_list_adm
        boton_list_adm.setBounds(new Rectangle(100,20));                        
        boton_list_adm.setLocation(350,400);            
        boton_list_adm.setBackground(Color.white);
    }
     private class act_bot implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //new ventana_secretaria(); 
            //accion de venteana
        }
    }
}
