package tarea_programada_1.usuarios;
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
    private principal prin;
    private JFrame pane;
    private JLabel label_chofer = new JLabel("Registrar nuevo chofer");
    private JTextField textfield_chofer = new JTextField("cedula/nombre/correo/telefono");
    private JButton boton_chofer= new JButton("Registrar");  
    private JTextField licencias_chofer= new JTextField("numero /fecha exp(dd//mm//aa) /fecha emi(dd/mm/aa))");
    private JLabel label_vehiculo = new JLabel("Registrar nuevo vehiculo");
    private JTextField textfield_vehiculo = new JTextField("placa/a�o/capacidad/kilometraje/numero vinn/color/marca/sede/estado");
    private JButton boton_vehiculo = new JButton("Registrar");      
    private JLabel label_list_adm = new JLabel("Listar informacion");
    //private JTextField textfield_list_adm = new JTextField("aqui mostrar");
    private JButton boton_list_adm = new JButton("Listar");      
    private JLabel label_aprovar = new JLabel("Aprovar solicitud de viaje");
    private JTextField textfield_aprovar  = new JTextField("consecutivo viaje");
    private JButton boton_aprovar = new JButton("Aprovar");   
    private JLabel label_registrar  = new JLabel("Registrar nuevo usuario");
    private JTextField textfield_registrar  = new JTextField("nombre/cedula/provincia/canton/distrito/se�as/correo/departamento/telefono");
    private JButton boton_registrar = new JButton("Registrar");
    private JButton boton_topcho  = new JButton("Top choferes"); 
    private JButton boton_topdep = new JButton("Top departamentos");               
    
    private JLabel label_mantenimiento = new JLabel("Servicio de mantenimiento");
    private JTextField textfield_mantenimiento = new JTextField("placa/identificador/fech_ini(d/m/a)/fech_fin(d/m/a)/monto/detalle/tipo");
    private JTextField textfield_mantenimiento_empresa = new JTextField("nombre/razon_social/cedula juridica/telefono/provincia/distrito/canton/se�as");
    private JButton boton_mantenimiento = new JButton ("Dar mantenimiento");    
    
    public ventana_administrador(principal pr){
        set_prin(pr);
        configuraciones();
    }
    private void set_prin(principal pr){
        prin=pr;
    }
    private void configuraciones(){
        pane=new JFrame();
        pane.getContentPane().setBackground(Color.WHITE);
        pane.getContentPane().setLayout(null);
        pane.setResizable(false);//no permite hacer mas grande
        pane.setUndecorated(false);//quita decoraciones
        pane.setSize(350,650);
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
        pane.add(label_registrar);
        //pane.add(textfield_list_adm);
        pane.add(label_list_adm);
        pane.add(boton_list_adm);
        pane.add(label_aprovar);
        pane.add(textfield_aprovar);
        pane.add(boton_aprovar);      
        pane.add(textfield_registrar); 
        pane.add(boton_registrar); 
        pane.add(boton_topcho); 
        pane.add(boton_topdep); 
        pane.add(label_mantenimiento);
        pane.add(textfield_mantenimiento);
        pane.add(textfield_mantenimiento_empresa);
        pane.add(boton_mantenimiento);
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
        boton_chofer.addActionListener(new act_bot_chofer());
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
        boton_vehiculo.addActionListener(new act_bot_vehiculo());
        //label_list_adm
        label_list_adm.setBounds(new Rectangle(150,20));        
        label_list_adm.setLocation(10,440);
        label_list_adm.setBackground(Color.white);
        //textfield_list_adm
        //textfield_list_adm.setBounds(new Rectangle(300,350));        
        //textfield_list_adm.setLocation(350,40);
        //textfield_list_adm.setBackground(Color.white);
        //boton_list_adm
        boton_list_adm.setBounds(new Rectangle(100,20));                        
        boton_list_adm.setLocation(10,460);            
        boton_list_adm.setBackground(Color.white);
        //label_aprovar
        label_aprovar.setBounds(new Rectangle(150,20));        
        label_aprovar.setLocation(10,310);
        label_aprovar.setBackground(Color.white);
        //textfield_aprovar
        textfield_aprovar.setBounds(new Rectangle(300,20));        
        textfield_aprovar.setLocation(10,340);
        textfield_aprovar.setBackground(Color.white);
        //boton_aprovar
        boton_aprovar.setBounds(new Rectangle(100,20));                        
        boton_aprovar.setLocation(10,360);            
        boton_aprovar.setBackground(Color.white);
        boton_aprovar.addActionListener(new act_bot_aprovar());
        //label_registrar
        label_registrar.setBounds(new Rectangle(150,20));        
        label_registrar.setLocation(10,220);
        label_registrar.setBackground(Color.white);
        //textfield_registrar
        textfield_registrar.setBounds(new Rectangle(300,20));        
        textfield_registrar.setLocation(10,260);
        textfield_registrar.setBackground(Color.white);
        //boton_registrar
        boton_registrar.setBounds(new Rectangle(100,20));                        
        boton_registrar.setLocation(10,280);            
        boton_registrar.setBackground(Color.white);
        boton_registrar.addActionListener(new act_bot_registar());
        //boton_topcho
        boton_topcho.setBounds(new Rectangle(130,20));                        
        boton_topcho.setLocation(10,400);            
        boton_topcho.setBackground(Color.white);
        boton_topcho.addActionListener(new act_bot_registar());
        //boton_topdep
        boton_topdep.setBounds(new Rectangle(130,20));                        
        boton_topdep.setLocation(170,400);            
        boton_topdep.setBackground(Color.white);
        boton_topdep.addActionListener(new act_bot_registar());
        
        //label mantenimiento
        label_mantenimiento.setBounds(new Rectangle(200,20));                        
        label_mantenimiento.setLocation(10,490);            
        label_mantenimiento.setBackground(Color.white);
        //texfield mantenimiento
        textfield_mantenimiento.setBounds(new Rectangle(200,20));                        
        textfield_mantenimiento.setLocation(10,520);            
        textfield_mantenimiento.setBackground(Color.white);
        //textfield mantenimiento empresa
        textfield_mantenimiento_empresa.setBounds(new Rectangle(200,20));                        
        textfield_mantenimiento_empresa.setLocation(10,550);            
        textfield_mantenimiento_empresa.setBackground(Color.white);
        //boton mantenimiento
        boton_mantenimiento.setBounds(new Rectangle(150,20));                        
        boton_mantenimiento.setLocation(10,580);            
        boton_mantenimiento.setBackground(Color.white);
        boton_mantenimiento.addActionListener(new act_bot_mantenimiento());
    }
     private class act_bot_registar implements ActionListener{
        public void actionPerformed(ActionEvent e){
            prin.nuevo_secretaria(textfield_registrar.getText());
            JOptionPane.showMessageDialog(null, "Usuario agregado correctamente", "just now", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private class act_bot_mantenimiento implements ActionListener{
        public void actionPerformed(ActionEvent e){
            prin.dar_mantenimiento(textfield_mantenimiento.getText(),textfield_mantenimiento_empresa.getText());
            JOptionPane.showMessageDialog(null, "Servicio realizado con exito", "just now", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private class act_bot_chofer implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(prin.nuevo_chofer(textfield_chofer.getText(),licencias_chofer.getText())){
                JOptionPane.showMessageDialog(null, "Chofer agregado correctamente", "just now", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    private class act_bot_vehiculo implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(prin.registrar_vehiculo(textfield_vehiculo.getText())){
                JOptionPane.showMessageDialog(null, "Vehiculo agregado correctamente", "just now", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    private class act_bot_aprovar implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(prin.aprovar_viaje(textfield_aprovar.getText())){
                JOptionPane.showMessageDialog(null, "Viaje aprovado correctamente", "just now", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
