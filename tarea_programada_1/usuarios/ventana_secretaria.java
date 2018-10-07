package tarea_programada_1.usuarios;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.JOptionPane;

/**
 * Write a description of class ventana_secretaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ventana_secretaria
{
    private principal prin;
    private JFrame pane = new JFrame();
    private JLabel label_pasajero = new JLabel("Registrar nuevo pasajero");
    private JLabel label_viaje = new JLabel("Solicitar nuevo viaje");
    private JTextField textfield_pasajero = new JTextField("cedula/nombre/provincia/canton/distrito/señas/correo/telefono");    
    private JButton boton_pas = new JButton("Registrar");    
    private JTextField textfield_viaje = new JTextField("pnt salida/destino/kilometros salida(dia/mes/año) llegada(dia/mes/año)");
    private JTextField textfield_viaje_pasajeros = new JTextField("cedula pasajero1 / cedula pasajero2/");
    private JButton boton_viaje = new JButton("Solicitar");  
    private JLabel label_listar = new JLabel("Listar solicitudes de viajes");
    private JTextField textfield_listar_fecha = new JTextField("dd/mm/aa");
    private JTextField textfield_listar_estado = new JTextField("En confeccion/Aprovado/Cancelado/No aprovado");
    private JTextField textfield_listar_destino = new JTextField("Destino");
    //private JTextField textfield_panel_listar = new JTextField("aqui mostrar");
    private JButton boton_listar_fecha = new JButton("Listar");
    private JButton boton_listar_estado = new JButton("Listar");               
    private JButton boton_listar_destino = new JButton("Listar");  
    private JLabel label_cancelar = new JLabel("Cancelar viaje");
    private JTextField textfield_cancelar = new JTextField("consecutivo");
    private JButton boton_cancelar = new JButton("Cancelar");              
    private JLabel label_detalle = new JLabel("Consultar detalle de viaje");
    private JTextField textfield_detalle = new JTextField("consecutivo");
    //private JTextField textfield_panel_detalle = new JTextField("aqui mostrar");
    private JButton boton_detalle = new JButton ("Consultar");     
    
    usuario usu_prin= new usuario();
    
    public ventana_secretaria(principal pr, usuario us){
        set_prin(pr);
        configuraciones();
        set_usu(us);
    }    
    private void set_usu(usuario us){
        usu_prin=us;
    }
    private void set_prin(principal pr){
        prin=pr;
    }
    private void configuraciones(){
        
        pane.getContentPane().setBackground(Color.WHITE);
        pane.getContentPane().setLayout(null);
        pane.setResizable(false);//no permite hacer mas grande
        pane.setUndecorated(false);//quita decoraciones
        pane.setSize(400,450);
        pane.setTitle("Secretaria");
        pane.setLocationRelativeTo(null);
        pane.setVisible(true);
        
        pane.add(label_pasajero);
        pane.add(textfield_pasajero);
        pane.add(boton_pas);
        pane.add(label_viaje);        
        pane.add(textfield_viaje);        
        pane.add(textfield_viaje_pasajeros);  
        pane.add(boton_viaje);  
        pane.add(label_listar);  
        pane.add(textfield_listar_fecha); 
        pane.add(textfield_listar_estado); 
        pane.add(textfield_listar_destino); 
        //pane.add(textfield_panel_listar);
        pane.add(boton_listar_fecha);
        pane.add(boton_listar_estado);     
        pane.add(boton_listar_destino);  
        pane.add(label_cancelar);          
        pane.add(textfield_cancelar);         
        pane.add(boton_cancelar);             
        pane.add(label_detalle);      
        pane.add(textfield_detalle); 
        //pane.add(textfield_panel_detalle); 
        pane.add(boton_detalle); 
        
        //label_pasajero        
        label_pasajero.setBounds(new Rectangle(150,20));        
        label_pasajero.setLocation(10,10);
        label_pasajero.setBackground(Color.white);
        //textfield_pasajero
        textfield_pasajero.setBounds(new Rectangle(300,20));        
        textfield_pasajero.setLocation(10,50);
        textfield_pasajero.setBackground(Color.white);
        //boton_pas
        boton_pas.setBounds(new Rectangle(100,20));                        
        boton_pas.setLocation(10,70);            
        boton_pas.setBackground(Color.white);
        boton_pas.addActionListener(new act_bot_pas());
        //label_viaje
        label_viaje.setBounds(new Rectangle(150,20));        
        label_viaje.setLocation(10,110);
        label_viaje.setBackground(Color.white);
        //textfield_viaje
        textfield_viaje.setBounds(new Rectangle(300,20));        
        textfield_viaje.setLocation(10,140);
        textfield_viaje.setBackground(Color.white);
        //textfield_viaje_pasajeros
        textfield_viaje_pasajeros.setBounds(new Rectangle(300,20));        
        textfield_viaje_pasajeros.setLocation(10,160);
        textfield_viaje_pasajeros.setBackground(Color.white);
        //boton_viaje
        boton_viaje.setBounds(new Rectangle(100,20));                        
        boton_viaje.setLocation(10,180);            
        boton_viaje.setBackground(Color.white);
        boton_viaje.addActionListener(new act_bot_viaje());
        //label_listar
        label_listar.setBounds(new Rectangle(170,20));        
        label_listar.setLocation(10,220);
        label_listar.setBackground(Color.white);
        //textfield_listar_fecha
        textfield_listar_fecha.setBounds(new Rectangle(100,20));        
        textfield_listar_fecha.setLocation(10,260);
        textfield_listar_fecha.setBackground(Color.white);
        //textfield_listar_estado
        textfield_listar_estado.setBounds(new Rectangle(100,20));        
        textfield_listar_estado.setLocation(120,260);
        textfield_listar_estado.setBackground(Color.white);
        //textfield_listar_destino
        textfield_listar_destino.setBounds(new Rectangle(100,20));        
        textfield_listar_destino.setLocation(230,260);
        textfield_listar_destino.setBackground(Color.white);
        //textfield_panel_listar
        //textfield_panel_listar.setBounds(new Rectangle(300,300));        
        /**textfield_panel_listar.setLocation(10,320);*/
        //textfield_panel_listar.setBackground(Color.white);
        //boton_listar_fecha
        boton_listar_fecha.setBounds(new Rectangle(100,20));                        
        boton_listar_fecha.setLocation(10,280);            
        boton_listar_fecha.setBackground(Color.white);
        boton_listar_fecha.addActionListener(new act_bot_listar_fecha());
        //boton_listar_estado
        boton_listar_estado.setBounds(new Rectangle(100,20));                        
        boton_listar_estado.setLocation(120,280);            
        boton_listar_estado.setBackground(Color.white);
        //boton_listar_estado.addActionListener(new act_bot_listar_estado());
        /**siguiente*/
        //boton_listar_destino
        boton_listar_destino.setBounds(new Rectangle(100,20));                        
        boton_listar_destino.setLocation(230,280);            
        boton_listar_destino.setBackground(Color.white);
        //boton_listar_destino.addActionListener(new act_bot_listar_destino());
        /**siguiente*/
        //label_cancelar
        label_cancelar.setBounds(new Rectangle(150,20));        
        label_cancelar.setLocation(10,320);
        label_cancelar.setBackground(Color.white);
        //textfield_cancelar
        textfield_cancelar.setBounds(new Rectangle(100,20));        
        textfield_cancelar.setLocation(10,360);
        textfield_cancelar.setBackground(Color.white);
        //boton_cancelar
        boton_cancelar.setBounds(new Rectangle(100,20));                        
        boton_cancelar.setLocation(10,390);            
        boton_cancelar.setBackground(Color.white);
        boton_cancelar.addActionListener(new act_bot_cancelar());
        //label_detalle
        label_detalle.setBounds(new Rectangle(200,20));        
        label_detalle.setLocation(180,320);
        label_detalle.setBackground(Color.white);
        //textfield_detalle
        textfield_detalle.setBounds(new Rectangle(100,20));        
        textfield_detalle.setLocation(180,360);
        textfield_detalle.setBackground(Color.white);
        //textfield_panel_detalle
        //textfield_panel_detalle.setBounds(new Rectangle(300,300));        
        //textfield_panel_detalle.setLocation(350,200);
        //textfield_panel_detalle.setBackground(Color.white);
        
        //boton_detalle
        boton_detalle.setBounds(new Rectangle(100,20));                        
        boton_detalle.setLocation(180,390);            
        boton_detalle.setBackground(Color.white);
        boton_detalle.addActionListener(new act_bot_detalle());
        
        
    }
    private class act_bot implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //new ventana_secretaria(); 
            //accion de venteana
        }
    }
    private class act_bot_pas implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(prin.agregar_pasajero(textfield_pasajero.getText())){
                JOptionPane.showMessageDialog(null, "Pasajero agregado correctamente", "just now", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Pasajero no fue agregado correctamente", "ERROR!!!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class act_bot_viaje implements ActionListener{
        public void actionPerformed(ActionEvent e){          
        if (prin.solicitar_viaje(textfield_viaje.getText(),textfield_viaje_pasajeros.getText(),usu_prin)){
            JOptionPane.showMessageDialog(null, "Solicitud creada", "just now", JOptionPane.INFORMATION_MESSAGE);            
        }
        }
    }
    private class act_bot_cancelar implements ActionListener{
        public void actionPerformed(ActionEvent e){          
        if (prin.cancelar_viaje(textfield_cancelar.getText(),usu_prin)){
            JOptionPane.showMessageDialog(null, "Viaje cancelado con exito", "just now", JOptionPane.INFORMATION_MESSAGE);            
        }
        }
    }
     private class act_bot_listar_fecha implements ActionListener{
        public void actionPerformed(ActionEvent e){          
        String hola = prin.listar_fecha(textfield_listar_fecha.getText(),usu_prin);
            JOptionPane.showMessageDialog(null,hola,"Viajes de la fecha"+textfield_listar_fecha.getText() , JOptionPane.INFORMATION_MESSAGE);                    
        }
    }
    private class act_bot_listar_destino implements ActionListener{
        public void actionPerformed(ActionEvent e){          
        String hola = prin.listar_destino(textfield_listar_destino.getText(),usu_prin);
            JOptionPane.showMessageDialog(null,hola,"Viajes del destino"+textfield_listar_destino.getText() , JOptionPane.INFORMATION_MESSAGE);                    
        }
    }
    private class act_bot_listar_estado implements ActionListener{
        public void actionPerformed(ActionEvent e){          
        String hola = prin.listar_estado(textfield_listar_estado.getText(),usu_prin);
            JOptionPane.showMessageDialog(null,hola,"Viajes del estado"+textfield_listar_estado.getText() , JOptionPane.INFORMATION_MESSAGE);                    
        }
    }
    private class act_bot_detalle implements ActionListener{
        public void actionPerformed(ActionEvent e){          
        String hola = prin.detalle_viaje(textfield_detalle.getText());
            JOptionPane.showMessageDialog(null,hola,"Detalles del ID "+textfield_detalle.getText() , JOptionPane.INFORMATION_MESSAGE);                    
        }
    }
}

