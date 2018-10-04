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
    //choferes
    label_chofer Lcho = new label_chofer();
    textfield_chofer Tcho = new textfield_chofer();
    licencias_chofer TLcho = new licencias_chofer();
    boton_chofer Bcho = new boton_chofer();
    //vehiculo
    label_vehiculo Lve = new label_vehiculo();
    textfield_vehiculo Tve = new textfield_vehiculo();
    boton_vehiculo Bve = new boton_vehiculo();
    //listar adm
    label_list_adm LLadm = new label_list_adm();
    textfield_list_adm TLadm = new textfield_list_adm();
    boton_list_adm BLadm = new boton_list_adm();
    //aprovar
    label_aprovar Lapro = new label_aprovar();
    textfield_aprovar Tapro = new textfield_aprovar(); 
    boton_aprovar Bapro = new boton_aprovar();
    //registrar
    label_registrar Lre = new label_registrar();
    textfield_registrar Tre = new textfield_registrar();
    boton_registrar Bre = new boton_registrar();
    //botones de estadisticas
    boton_topcho Btcho = new boton_topcho();
    boton_topdep Btdep = new boton_topdep();
    
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
        //labels
        pane.add(Lcho);
        pane.add(Lve);        
        pane.add(Lre);
        pane.add(Lapro);
        pane.add(LLadm);
        //textfields
        pane.add(TLcho);
        pane.add(Tcho);        
        pane.add(Tve);
        pane.add(Tre);
        pane.add(Tapro);
        pane.add(TLadm);                       
        //botones        
        pane.add(Bcho);
        pane.add(Bve);   
        pane.add(Bre);
        pane.add(Bapro);
        pane.add(BLadm);     
        pane.add(Btcho);     
        pane.add(Btdep);     
    }
}
