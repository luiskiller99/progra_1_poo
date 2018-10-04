 
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class ventana_secretaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ventana_secretaria
{
    JFrame pane;
    //pasajeros
    label_pasajero Lpas = new label_pasajero();
    textfield_pasajero Tpas = new textfield_pasajero();
    boton_pasajero Bpas = new boton_pasajero();
    //viajes
    label_viaje Lvia = new label_viaje();
    textfield_viaje Tvia = new textfield_viaje();
    textfield_viaje_pasajeros TPvia = new textfield_viaje_pasajeros();
    boton_viaje Bvia = new boton_viaje();
    //listar
    label_listar Llis = new label_listar();
    textfield_listar_fecha TLfech = new textfield_listar_fecha();
    textfield_listar_estado TLestado = new textfield_listar_estado();
    textfield_listar_destino TLdes = new textfield_listar_destino();;
    textfield_panel_listar TLpan = new textfield_panel_listar();
    boton_listar_fecha BLfech = new boton_listar_fecha();
    boton_listar_estado BLestado = new boton_listar_estado();
    boton_listar_destino BLdes = new boton_listar_destino();
    //cancelar
    label_cancelar Lcan = new label_cancelar();
    textfield_cancelar Tcan = new textfield_cancelar(); 
    boton_cancelar Bcan = new boton_cancelar();
    //detalle
    label_detalle Lde = new label_detalle();
    textfield_detalle Tde = new textfield_detalle();
    textfield_panel_detalle TPde = new textfield_panel_detalle();
    boton_detalle Bde = new boton_detalle();
    
    public ventana_secretaria(){
        configuraciones();
    }
    private void configuraciones(){
        pane=new JFrame();
        pane.getContentPane().setBackground(Color.WHITE);
        pane.getContentPane().setLayout(null);
        pane.setResizable(false);//no permite hacer mas grande
        pane.setUndecorated(false);//quita decoraciones
        pane.setSize(680,700);
        pane.setTitle("Secretaria");
        pane.setLocationRelativeTo(null);
        pane.setVisible(true);
        //labels
        pane.add(Lpas);
        pane.add(Lvia);        
        pane.add(Llis);                
        pane.add(Lcan);
        pane.add(Lde);
        //textfields
        pane.add(Tpas);       
        pane.add(Tvia);        
        pane.add(TPvia);                
        pane.add(TLfech); 
        pane.add(TLestado);
        pane.add(TLdes);
        pane.add(TLpan);
        pane.add(Tcan);
        pane.add(Tde);
        pane.add(TPde);
        //botones
        pane.add(Bpas);
        pane.add(Bvia); 
        pane.add(BLfech);
        pane.add(BLestado);
        pane.add(BLdes);
        pane.add(Bcan);
        pane.add(Bde);
    }
}
