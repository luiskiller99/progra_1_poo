package usuarios;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.*;
/**
 * Write a description of class ventana_principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ventana_principal extends JFrame
{
    JFrame pane;
    
    boton_adm panelbotonesadm = new boton_adm();
    boton_sec panelbotonessec = new boton_sec();    
    
    label_usu_adm Lusuadm = new label_usu_adm();
    label_usu_sec Lususec = new label_usu_sec();
    label_cont_adm Lcontadm = new label_cont_adm();
    label_cont_sec Lcontsec = new label_cont_sec();
    titulo_adm Tadm = new titulo_adm();
    titulo_sec Tsec = new titulo_sec();    
    
    textedit_usu_adm Tusuadm = new textedit_usu_adm();
    textedit_cont_adm Tcontadm = new textedit_cont_adm();    
    textedit_usu_sec Tususec = new textedit_usu_sec();
    textedit_cont_sec Tcontsec = new textedit_cont_sec();    
    
    public ventana_principal(){
        configuraciones();
    }
    private void configuraciones(){
        pane = new JFrame();
        pane.getContentPane().setBackground(Color.white);
        pane.getContentPane().setLayout(null);
        pane.setResizable(false);//no permite hacer mas grande
        pane.setUndecorated(false);//quita decoraciones
        pane.setSize(500,500);
        pane.setTitle("Principal");
        pane.setLocationRelativeTo(null);
        pane.setVisible(true);
        //agrega botones
        pane.add(panelbotonesadm);        
        pane.add(panelbotonessec);
        //agrega labes
        pane.add(Lusuadm);
        pane.add(Lususec);        
        pane.add(Lcontadm);                        
        pane.add(Lcontsec);                           
        pane.add(Tadm);                
        pane.add(Tsec);                     
        //textedit
        pane.add(Tusuadm);
        pane.add(Tcontadm);
        pane.add(Tususec);
        pane.add(Tcontsec);

    }
}
