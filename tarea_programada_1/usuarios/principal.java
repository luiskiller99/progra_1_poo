package tarea_programada_1.usuarios;
import java.util.ArrayList;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.io.File;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.JOptionPane;

import tarea_programada_1.vehiculo.persona;
import tarea_programada_1.vehiculo.direccion;
import tarea_programada_1.vehiculo.viaje;
import tarea_programada_1.vehiculo.fecha;

public class principal 
{
    ArrayList<usuario> Array_usuarios = new ArrayList<usuario>();
    ArrayList<viaje> Array_viajes = new ArrayList<viaje>();
    ArrayList<persona> Array_pasajeros = new ArrayList<persona>(); 
    JSONArray arreglousuarios=new JSONArray();
    JSONArray arreglopasajeros=new JSONArray();
    JSONArray arregloviajes=new JSONArray();
    
    public principal(){
        //usuario de pruevas
        //por defecto usu = metal0500 cont = luise5847
        direccion res=new direccion("","","","");
        persona hola=new persona("",5,res,"",3);
        usuario aquel=new usuario(hola,"hols");
        Array_usuarios.add(aquel);
        //eliminar
    }
    
    public void nuevo_secretaria(String info){
        String cedula="";
        String nombre="";
        String provincia="";
        String canton="";
        String distrito="";
        String señas="";
        String correo="";
        String telefono="";
        String departamento="";
        /**obtiene informacion de string*/
        int cont=0;
        for(int i = 0 ; i < info.length() ; i++){
            char c = info.charAt(i);
            if(c=='/')cont++;
            else if (cont==0)nombre += c;
            else if (cont==1)cedula += c;
            else if (cont==2)provincia += c;
            else if (cont==3)canton += c;
            else if (cont==4)distrito += c;
            else if (cont==5)señas += c;
            else if (cont==6)correo += c;
            else if (cont==7)departamento += c;
            else if (cont==8)telefono += c;            
        }    
        direccion dir = new direccion(provincia,canton,distrito,señas);
        int ced = Integer.parseInt(cedula);
        int tel = Integer.parseInt(telefono);
        persona pers= new persona(nombre,ced,dir,correo,tel);
        usuario usu= new usuario(pers,departamento);
        Array_usuarios.add(usu);
        genjsonsec();
    }
    
    public void genjsonsec(){        
        JSONObject obj = new JSONObject();
        
        for(int i=0;i<Array_usuarios.size();i++){            
           obj.put("Cedula",Array_usuarios.get(i).get_cedula());
           obj.put("Nombre", Array_usuarios.get(i).get_nombre());            
           obj.put("Cantón",Array_usuarios.get(i).get_canton());
           obj.put("Distrito",Array_usuarios.get(i).get_distrito());
           obj.put("Provincia",Array_usuarios.get(i).get_provincia());
           obj.put("Señas",Array_usuarios.get(i).get_señas());            
           obj.put("Telefono",Array_usuarios.get(i).get_telefono());
           obj.put("Correo",Array_usuarios.get(i).get_correo());
           obj.put("Usuario",Array_usuarios.get(i).get_usuario());
           obj.put("Constraseña",Array_usuarios.get(i).get_contraseña());
           
        }
        arreglousuarios.add(obj);
        
        
        //C:/Users/metal/Documents/GitHub7progra_1_poo/tarea_programada_1/usuarios/
        try (FileWriter file = new FileWriter("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/secretarias.json")) {
 
        
        file.write(arreglousuarios.toJSONString());
        }
        catch (IOException e){
        System.out.print(e.getMessage());
        }
    
       
        
    }
    
    public boolean validar_adm(String usu,String cont){        
        int us = usu.compareTo("administrador");
        int co = cont.compareTo("123admin!");
        if(us==0 && co==0){return true;}
        return false;        
    }
    public boolean validar_sec(String usu,String cont){        
        for (int i = 0 ; i < Array_usuarios.size() ; i++){                          
            int us = usu.compareTo(Array_usuarios.get(i).get_usuario());
            int co = cont.compareTo(Array_usuarios.get(i).get_contraseña());            
            if(us==0 && co==0){return true;}        
        }
        return false;        
    }
    public boolean agregar_pasajero(String info){        
        
        String cedula="";
        String nombre="";
        String provincia="";
        String canton="";
        String distrito="";
        String señas="";
        String correo="";
        String telefono="";
        /**obtiene informacion de string*/
        int cont=0;
        for(int i = 0 ; i < info.length() ; i++){
            char c = info.charAt(i);
            if(c=='/')cont++;
            else if (cont==0)cedula += c;
            else if (cont==1)nombre += c;
            else if (cont==2)provincia += c;
            else if (cont==3)canton += c;
            else if (cont==4)distrito += c;
            else if (cont==5)señas += c;
            else if (cont==6)correo += c;
            else if (cont==7)telefono += c;            
        }    
        /**crea los objetos y procede a verificar si existe otro
        con el mismo numero de cedula*/
        direccion dir = new direccion(provincia,canton,distrito,señas);
        persona pers = new persona(nombre,Integer.parseInt(cedula),dir,correo,Integer.parseInt(telefono));
        for (int i = 0; i < Array_pasajeros.size() ; i++ ){
            if(Array_pasajeros.get(i).get_ced()==pers.get_ced()){
            return false;
            }
        }
        /**agrega nuevo pasajero al arreglo de pasajeros*/
        /**meter en jason*/
        Array_pasajeros.add(pers);
        genjson();
        return true;
    }
    public boolean solicitar_viaje(String info, String list_pas){
        //obtener informacion
        String pnt_salida="";
        String pnt_destino="";
        String dia_salida="";
        String mes_salida="";
        String ano_salida="";
        String dia_llegada="";
        String mes_llegada="";
        String ano_llegada="";
        String cedula_pasajero="";
        /**optener fecha*/
        Date d = new Date();        
        Calendar c = new GregorianCalendar(); 
        c.setTime(d);
        
        String diaa_pc = Integer.toString(c.get(Calendar.DATE));
        String mess_pc = Integer.toString(c.get(Calendar.MONTH));
        String añoo_pc = Integer.toString(c.get(Calendar.YEAR));        
        
        ArrayList<persona> Array_pasajeros_aux = new ArrayList<persona>();
        
        boolean interruptor=true;
        
        /**falta optener info*/
        int cont =0;
        for(int i = 0 ; i < info.length() ; i++){
            char k = info.charAt(i);
            if(k=='/')cont++;
            else if (cont==0)pnt_salida += k;
            else if (cont==1)pnt_destino += k;
            else if (cont==2)dia_salida += k;
            else if (cont==3)mes_salida += k;
            else if (cont==4)ano_salida += k;
            else if (cont==5)dia_llegada += k;
            else if (cont==6)mes_llegada += k;
            else if (cont==7)ano_llegada += k;            
        }
        String ced="";
        int cedaux=0;
        for(int i = 0 ; i < list_pas.length() ; i++){
            char k = list_pas.charAt(i);
            if(k=='/'){
                cedaux=Integer.parseInt(ced);
                Array_pasajeros_aux.add(optener_pasajero(cedaux));
                ced="";
            }
            else {
                ced+=k;
            }
        }
        Array_pasajeros_aux.add(optener_pasajero(cedaux));
        
        //interseccion de fechas vacia
        for (int i =0;i < Array_viajes.size();i++){           
            if((Array_viajes.get(i).get_ini().get_d() <= Integer.parseInt(dia_llegada) && /**dia ini array<= dia llegada info*/
            Integer.parseInt(dia_llegada) <= Array_viajes.get(i).get_fin().get_d() ) &&/**dia llegada info <= dia llegada array*/
            (Array_viajes.get(i).get_ini().get_d() <= Integer.parseInt(dia_llegada) && /**mes ini aray <= mes llegada info*/
            Integer.parseInt(dia_llegada) <= Array_viajes.get(i).get_fin().get_d() ) &&/**mes ini info <= mes llegada array*/
            (Array_viajes.get(i).get_ini().get_d() <= Integer.parseInt(dia_llegada) &&/**año ini array <= año llegada info*/
            Integer.parseInt(dia_llegada) <= Array_viajes.get(i).get_fin().get_d()) /**año ini info <= año llegada array*/
            )/**si esto se cumple no deberia de aplicar viaje */
            { 
                interruptor = false;
                JOptionPane.showMessageDialog(null, "Solicitud de viaje no fue agregada correctamente, choque de fechas", "ERROR!!!", JOptionPane.WARNING_MESSAGE);
            }            
        }
        //fecha con 24 horas de diferencia//tomar fecha de sistema operativo        
        if(dia_llegada.compareTo(diaa_pc) == 0 &&
        mes_llegada.compareTo(mess_pc) == 0 &&
        ano_llegada.compareTo(añoo_pc) == 0){
            interruptor = false;
            JOptionPane.showMessageDialog(null, "Solicitud de viaje no fue agregada correctamente, en menos de 24 horas solicitud no puede ser procesada", "ERROR!!!", JOptionPane.WARNING_MESSAGE);
        }/**si esto se cumple no debe realizarse viaje*/
        //debe aber un pasajero almenos
        if(Array_pasajeros_aux.size()==0){
            interruptor = false;
            JOptionPane.showMessageDialog(null, "Solicitud de viaje no fue agregada correctamente, no hay pasajeros", "ERROR!!!", JOptionPane.WARNING_MESSAGE);
        }/**si esto se cumple no debe realizarse viaje*/
        if(interruptor){
            int dia_s = Integer.parseInt(dia_salida);
            int mes_s = Integer.parseInt(mes_salida);
            int ano_s = Integer.parseInt(ano_salida);
            int dia_l = Integer.parseInt(dia_llegada);
            int mes_l = Integer.parseInt(mes_llegada);
            int ano_l = Integer.parseInt(ano_llegada);            
            fecha fech_ini = new fecha(dia_s,mes_s,ano_s);
            fecha fech_fin = new fecha(dia_l,mes_l,ano_l);
            viaje iva = new viaje(pnt_salida,pnt_destino,fech_ini,fech_fin,"En confección");            
            /**agrega todos los pasajeros*/
            for (int i=0;i<Array_pasajeros_aux.size();i++){
                iva.agregar_pasajero(Array_pasajeros_aux.get(i));
            }
            Array_viajes.add(iva);
        }
        /**escribir en json*/
        genjson();
        return interruptor;
    }
    
    @SuppressWarnings("unchecked")
    public void genjsonviaje(){
        JSONObject obj= new JSONObject();
        for(int i=0;i<Array_viajes.size();i++){
            obj.put("Chofer",Array_viajes.get(i).get_chof());
            obj.put("Destino",Array_viajes.get(i).get_dest());
            obj.put("Estado",Array_viajes.get(i).get_estado());
            obj.put("FechaFin",Array_viajes.get(i).get_fin());
            obj.put("FechaIni",Array_viajes.get(i).get_ini());
            obj.put("Salida",Array_viajes.get(i).get_sal());
            obj.put("Consecutivo",Array_viajes.get(i).get_consec());
        }
        arregloviajes.add(obj);
        //C:/Users/metal/Documents/GitHub7progra_1_poo/tarea_programada_1/usuarios/
        try (FileWriter file = new FileWriter("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/viajes.json")) {
        file.write(arregloviajes.toJSONString());
        }
        catch (IOException e){
        System.out.print(e.getMessage());
        }
    }
    
    persona optener_pasajero(int ced){
        persona aux = new persona();
        for (int i =0;i< Array_pasajeros.size();i++){
            if(Array_pasajeros.get(i).get_ced()==ced) aux = Array_pasajeros.get(i);
        }
        return aux;
    }
    boolean cancelar_viaje(String consec){
        for(int i=0;i<Array_viajes.size();i++){
            if(Array_viajes.get(i).get_consec().compareTo(consec)==0){
                if(Array_viajes.get(i).get_estado().compareTo("En confección")==0){
                Array_viajes.get(i).cambiar_estado("Cancelado");
                }
                else if(Array_viajes.get(i).get_estado().compareTo("Aprovado")==0){
                Array_viajes.get(i).cambiar_estado("Cancelado");
                /**aqui codigo para notificar a los usuarios*/
                }
            }
        }
        return true;
    }
    
    @SuppressWarnings("unchecked")
    public void genjson() {
        JSONObject obj = new JSONObject();
        for(int i=0;i<Array_pasajeros.size();i++){            
            obj.put("Cedula",Array_pasajeros.get(i).get_ced());
            obj.put("Nombre", Array_pasajeros.get(i).get_nom());            
            obj.put("Cantón",Array_pasajeros.get(i).get_dir().get_can());
            obj.put("Distrito",Array_pasajeros.get(i).get_dir().get_dis());
            obj.put("Provincia",Array_pasajeros.get(i).get_dir().get_pro());
            obj.put("Señas",Array_pasajeros.get(i).get_dir().get_se());            
            obj.put("Telefono",Array_pasajeros.get(i).get_tel());
            obj.put("Correo",Array_pasajeros.get(i).get_correo());
        }
        arreglopasajeros.add(obj);
        //C:/Users/metal/Documents/GitHub7progra_1_poo/tarea_programada_1/usuarios/
        try (FileWriter file = new FileWriter("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/file1.json")) {
        file.write(arreglopasajeros.toJSONString());
    }
    catch (IOException e){
        System.out.print(e.getMessage());
       }

    }

}