package tarea_programada_1.usuarios;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.JOptionPane;

public class ventana_principal extends JFrame
{
    JFrame pane = new JFrame();
    principal prin = new principal();
    JButton ADM = new JButton("Ingresar");    
    JButton SEC = new JButton("Ingresar"); 
    
    JLabel label_usu_adm = new JLabel("Usuario: ");
    JLabel label_usu_sec = new JLabel("Usuario: ");
    JLabel label_cont_adm = new JLabel("Contraseña: ");
    JLabel label_cont_sec = new JLabel("Contraseña: ");
    JLabel label_titulo_adm = new JLabel("Administrador");
    JLabel label_titulo_sec = new JLabel("Secretaria");
    
    JTextField textedit_usu_adm = new JTextField("");
    JTextField textedit_cont_adm = new JTextField("");
    JTextField textedit_usu_sec = new JTextField("");    
    JTextField textedit_cont_sec = new JTextField("");
    
    public ventana_principal(){
        configuraciones();
    }
    private void configuraciones(){
        //pane
        pane.getContentPane().setBackground(Color.white);
        pane.getContentPane().setLayout(null);
        pane.setResizable(false);//no permite hacer mas grande
        pane.setUndecorated(false);//quita decoraciones
        pane.setSize(500,500);
        pane.setTitle("Principal");
        pane.setLocationRelativeTo(null);
        pane.setVisible(true);
       
        pane.add(ADM);
        pane.add(SEC);
        pane.add(label_usu_adm);
        pane.add(label_usu_sec);  
        pane.add(label_cont_adm);
        pane.add(label_cont_sec);
        pane.add(label_titulo_adm);
        pane.add(label_titulo_sec);
        pane.add(textedit_usu_adm);
        pane.add(textedit_cont_adm);
        pane.add(textedit_usu_sec);
        pane.add(textedit_cont_sec);
        
        //boton adm
        ADM.setBounds(new Rectangle(100,20));
        ADM.setLocation(120,300);
        ADM.setBackground(Color.white);        
        ADM.addActionListener(new administrador());

        
        //boton sec
        SEC.setBounds(new Rectangle(100,20));                        
        SEC.setLocation(380,300);            
        SEC.setBackground(Color.white);
        SEC.addActionListener(new secretaria());
       
        
        //label_usu_adm                
        label_usu_adm.setBounds(new Rectangle(100,20));        
        label_usu_adm.setLocation(270,100);
        label_usu_adm.setBackground(Color.white);        
        
        //label_usu_sec                        
        label_usu_sec.setBounds(new Rectangle(100,20));        
        label_usu_sec.setLocation(10,100);
        label_usu_sec.setBackground(Color.white);              
        
        //label_cont_adm;                
        label_cont_adm.setBounds(new Rectangle(100,20));        
        label_cont_adm.setLocation(10,200);
        label_cont_adm.setBackground(Color.white);                
        
        // label_cont_sec;                
        label_cont_sec.setBounds(new Rectangle(100,20));        
        label_cont_sec.setLocation(270,200);
        label_cont_sec.setBackground(Color.white);        
        
        //JLabel label_titulo_adm;                
        label_titulo_adm.setBounds(new Rectangle(100,20));        
        label_titulo_adm.setLocation(50,50);
        label_titulo_adm.setBackground(Color.white);                
        
        // JLabel label_titulo_sec;        
        label_titulo_sec.setBounds(new Rectangle(100,20));        
        label_titulo_sec.setLocation(350,50);
        label_titulo_sec.setBackground(Color.white);               
                
        //JTextField textedit_usu_adm;        
        textedit_usu_adm.setBounds(new Rectangle(100,20));        
        textedit_usu_adm.setLocation(120,100);
        textedit_usu_adm.setBackground(Color.white);               
        
        //JTextField textedit_cont_adm ;                
        textedit_cont_adm.setBounds(new Rectangle(100,20));        
        textedit_cont_adm.setLocation(120,200);
        textedit_cont_adm.setBackground(Color.white);                
        
        //JTextField textedit_usu_sec                
        textedit_usu_sec.setBounds(new Rectangle(100,20));        
        textedit_usu_sec.setLocation(380,100);
        textedit_usu_sec.setBackground(Color.white);                
                
        //JTextField textedit_cont_sec;                
        textedit_cont_sec.setBounds(new Rectangle(100,20));        
        textedit_cont_sec.setLocation(380,200);
        textedit_cont_sec.setBackground(Color.white);         
        

    }
    private class administrador implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String usu=textedit_usu_adm.getText();            
            String cont=textedit_cont_adm.getText(); 
            if(prin.validar_adm(usu,cont)){
                new ventana_administrador();
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR!!!", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }
    private class secretaria implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            String usu=textedit_usu_adm.getText();            
            String cont=textedit_cont_adm.getText();                        
            if(prin.validar_sec(usu, cont)){            
                new ventana_secretaria();
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR!!!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

