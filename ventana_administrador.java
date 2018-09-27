package usuarios;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class ventana_administrador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ventana_administrador
{
    JFrame pane;
    public ventana_administrador(){
        configuraciones();
    }
    private void configuraciones(){
        pane=new JFrame();
        pane.getContentPane().setBackground(Color.GREEN);
        pane.getContentPane().setLayout(null);
        pane.setResizable(false);//no permite hacer mas grande
        pane.setUndecorated(false);//quita decoraciones
        pane.setSize(300,200);
        pane.setTitle("Administrador");
        pane.setLocationRelativeTo(null);
        pane.setVisible(true);
    }
}
