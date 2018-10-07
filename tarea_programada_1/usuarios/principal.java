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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import tarea_programada_1.vehiculo.vehiculo;
import tarea_programada_1.vehiculo.licencia;
import tarea_programada_1.vehiculo.chofer;
import tarea_programada_1.vehiculo.servicio_mantenimiento;
import tarea_programada_1.vehiculo.empresa;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class principal 
{
    private ArrayList<usuario> Array_usuarios = new ArrayList<usuario>();
    private ArrayList<viaje> Array_viajes = new ArrayList<viaje>();
    private ArrayList<persona> Array_pasajeros = new ArrayList<persona>(); 
    private ArrayList<vehiculo> Array_vehiculos = new ArrayList<vehiculo>();
    private ArrayList<chofer> Array_choferes = new ArrayList<chofer>();
    
    private JSONArray arreglousuarios=new JSONArray();
    private JSONArray arreglopasajeros=new JSONArray();
    private JSONArray arregloviajes=new JSONArray();
    private JSONArray arreglovehiculos=new JSONArray();
    private JSONArray arreglochoferes=new JSONArray();
    
    public void principal(){
        //setArrayusuario(ArrayList<usuario> parregloUsuarios =new ArrayList<usuario>());
        
        
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
        System.out.println("usuario...............");
        System.out.println(usu.get_correo());
        System.out.println(usu.get_contraseña());
        System.out.println(usu.get_nombre());
        System.out.println(usu.get_telefono());
        System.out.println(usu.get_provincia());
        System.out.println(usu.get_distrito());
        System.out.println("usuario...............");
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
           obj.put("Departamento",Array_usuarios.get(i).get_dep());
           
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
        System.out.println("pasajero..............");
        System.out.println(pers.get_ced());
        System.out.println(pers.get_nom());
        System.out.println(pers.get_dir().get_pro());
        System.out.println(pers.get_dir().get_can());
        System.out.println(pers.get_dir().get_dis());
        System.out.println(pers.get_dir().get_se());
        System.out.println(pers.get_correo());
        System.out.println(pers.get_tel());
        System.out.println("pasajero..............");
        Array_pasajeros.add(pers);
        genjson();
        return true;
    }
    private boolean validar_pasajero_choquehorario(int cedaux,String ini,String fin){
        for(int i =0;i< Array_viajes.size();i++){
            for(int j=0;j < Array_viajes.get(i).get_array_pasajeros().size();i++){
                if(cedaux==Array_viajes.get(i).get_array_pasajeros().get(j).get_ced()){
                    String iniv=Array_viajes.get(i).get_ini().get_a()+"-"+
                                Array_viajes.get(i).get_ini().get_m()+"-"+
                                Array_viajes.get(i).get_ini().get_d();
                    String finv=Array_viajes.get(i).get_fin().get_a()+"-"+
                                Array_viajes.get(i).get_fin().get_m()+"-"+
                                Array_viajes.get(i).get_fin().get_d();
                                
                    if(chocan_horarios(ini,fin,iniv,finv))return false;
                }
            }
        }
        return true;
    }
    public boolean solicitar_viaje(String info, String list_pas){
        //obtener informacion
        String pnt_salida="";
        String pnt_destino="";
        String kilometros="";
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
            else if (cont==2)kilometros += k;
            else if (cont==3)dia_salida += k;
            else if (cont==4)mes_salida += k;
            else if (cont==5)ano_salida += k;
            else if (cont==6)dia_llegada += k;
            else if (cont==7)mes_llegada += k;
            else if (cont==8)ano_llegada += k;              
        }
        String ced="";
        int cedaux=0;
        for(int i = 0 ; i < list_pas.length() ; i++){
            char k = list_pas.charAt(i);
            if(k=='/'){
                cedaux=Integer.parseInt(ced);
                String ini = ano_salida+"-"+mes_salida+"-"+dia_salida;
                String fin = ano_llegada+"-"+mes_llegada+"-"+dia_llegada;
                if( validar_pasajero_choquehorario(cedaux,ini,fin)){
                    Array_pasajeros_aux.add(optener_pasajero(cedaux));
                }
                else{
                    JOptionPane.showMessageDialog(null, "el pasajero de cedula "+cedaux+" tiene choque de horarios, no se incluira en el viaje", "ERROR!!!", JOptionPane.WARNING_MESSAGE);
                }
                ced="";
            }
            else {
                ced+=k;
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
            int kil   = Integer.parseInt(kilometros);
            fecha fech_ini = new fecha(dia_s,mes_s,ano_s);
            fecha fech_fin = new fecha(dia_l,mes_l,ano_l);
            viaje iva = new viaje(pnt_salida,pnt_destino,fech_ini,fech_fin,"En confección",kil);
            /**agrega todos los pasajeros*/
            for (int i=0;i<Array_pasajeros_aux.size();i++){
                iva.agregar_pasajero(Array_pasajeros_aux.get(i));
            }
            
            System.out.println("viaje.............");
            //System.out.println(iva.get_chof().get_nom());
            System.out.println(iva.get_consec());
            System.out.println(iva.get_dest());
            System.out.println(iva.get_estado());
            System.out.println(iva.get_fin().get_d());
            System.out.println(iva.get_ini().get_d());
            System.out.println(iva.get_sal());
            //System.out.println(iva.get_vehiculo().get_placa());
            System.out.println("viaje.............");
            
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
                    System.out.println("cancelado");
                    Array_viajes.get(i).cambiar_estado("Cancelado");
                }
                else if(Array_viajes.get(i).get_estado().compareTo("Aprovado")==0){
                    System.out.println("cancelado");
                    Array_viajes.get(i).cambiar_estado("Cancelado");
                /**aqui codigo para notificar a los usuarios*/
                //prueba de bot
                ApiContextInitializer.init();
                TelegramBotsApi telegramBotsApi=new TelegramBotsApi();
                Bot bot=new Bot();
                bot.setestado(Array_viajes.get(i).get_estado());
                
                try{
                    telegramBotsApi.registerBot(bot);
                }
                catch(TelegramApiRequestException e){
                    e.printStackTrace();
                }
                
                }
            }
        }
        return true;
    }
    private boolean valida_espiracion(String fecha_pc,String fecha_expi){
        try{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                     
        Date fechaInicial = dateFormat.parse(fecha_expi);
        Date fechaFinal = dateFormat.parse(fecha_pc);
        int ini1=(int) ((fechaInicial.getTime()-fechaFinal.getTime())/86400000);
        if(ini1<0)return true; //expiro
    }
    catch( Exception e ) {
            System.out.println( "Se ha producido un error" );
        }
        return false;//no expiro
    }
    
    public boolean nuevo_chofer(String info, String list_lic){
        /**info chofer*/
        String cedula="";
        String nombre="";
        String correo="";
        String telefono="";
        /**licencia*/
        String numero="";
        String d_ex="";
        String m_ex="";
        String a_ex="";
        String d_emi="";
        String m_emi="";
        String a_emi="";
        
        ArrayList<licencia> array_lic = new ArrayList<licencia>();
        
        int cont =0;
        /**info del chofer*/
        for(int i = 0 ; i < info.length() ; i++){
            char k = info.charAt(i);
            if(k=='/')cont++;
            else if (cont==0)cedula += k;
            else if (cont==1)nombre += k;
            else if (cont==2)correo += k;
            else if (cont==3)telefono += k;
        }
        /** valida licencias vencidas */
        
        Date d = new Date();        
        Calendar c = new GregorianCalendar(); 
        c.setTime(d);
        
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH));
        String año = Integer.toString(c.get(Calendar.YEAR));
        
        String fecha_pc = año+"-"+mes+"-"+dia; 
        String fecha_expi =a_ex+"-"+m_ex+"-"+d_ex;
        if (valida_espiracion(fecha_pc,fecha_expi)){
            JOptionPane.showMessageDialog(null, "licencia de chofer vencida, no se tomara en cuenta", "ERROR!!!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        /**agregara el nuevo chofer*/
        int tel= Integer.parseInt(telefono);
        int ced= Integer.parseInt(cedula);
        chofer new_chofer = new chofer(nombre,tel,correo,ced);
        /**agrega licencias*/
        for(int i = 0 ; i < list_lic.length() ; i++){
            char k = info.charAt(i);
            if(k=='/')cont++;
            else if (cont==0)numero += k;
            else if (cont==1)d_ex += k;
            else if (cont==2)m_ex += k;
            else if (cont==3)a_ex += k;
            else if (cont==4)d_emi += k;
            else if (cont==5)m_emi += k;
            else if (cont==6)a_emi += k;
            else if (cont==7){
                int de = Integer.parseInt(d_emi);
                int me = Integer.parseInt(m_emi);
                int ae = Integer.parseInt(a_emi);
                int dx = Integer.parseInt(d_ex);
                int mx = Integer.parseInt(m_ex);
                int ax = Integer.parseInt(a_ex);
                fecha emi =new fecha(de,me,ae);
                fecha exp = new fecha(dx,mx,ax);
                int num = Integer.parseInt(numero);
                /**meter licencia*/
                licencia aux = new licencia(num,emi,exp);
                new_chofer.agregar_licencia(aux);
                cont=0;numero="";d_ex="";m_ex="";a_ex="";
                d_emi="";m_emi="";a_emi="";
            }
        }    
        
        
        
        System.out.println("chofer...............");
        System.out.println(new_chofer.get_ced());
        System.out.println(new_chofer.get_correo());
        System.out.println(new_chofer.get_nom());
        System.out.println(new_chofer.get_tel());
        System.out.println("chofer...............");        
        Array_choferes.add(new_chofer);
        genjsoncho();
        return true;
    }
    
        public void genjsoncho(){        
        JSONObject obj = new JSONObject();
        
        //ArrayList<licencia> array_licencias = new ArrayList<licencia>();         
        
        for(int i=0;i<Array_choferes.size();i++){ 
           //array_licencias=Array_choferes.get(i).getlicencias();
           obj.put("Cedula",Array_choferes.get(i).get_ced());
           obj.put("Correo",Array_choferes.get(i).get_correo());
           obj.put("Nombre",Array_choferes.get(i).get_nom());
           obj.put("Telefono",Array_choferes.get(i).get_tel());
           System.out.print(Array_choferes.get(i).get_list_lic().get(0).get_em());
           for(int j=0;j<Array_choferes.get(i).get_list_lic().size();j++){
               obj.put("Emisión",Array_choferes.get(i).get_list_lic().get(j).get_em());
               obj.put("Expira",Array_choferes.get(i).get_list_lic().get(j).get_ex());
               obj.put("numLicencia",Array_choferes.get(i).get_list_lic().get(j).get_num());
            }
           
        }
        arreglochoferes.add(obj);
        
        
        //C:/Users/metal/Documents/GitHub7progra_1_poo/tarea_programada_1/usuarios/
        try (FileWriter file = new FileWriter("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/choferes.json")) {
 
        
        file.write(arreglochoferes.toJSONString());
        }
        catch (IOException e){
        System.out.print(e.getMessage());
        }
    
       
        
    }
    
    boolean registrar_vehiculo(String info){
        String placa="";
        String año="";
        String capacidad="";
        String kilometrage="";
        String numero_vinn="";
        String color="";
        String marca="";
        String sede="";
        String estado="";
        int cont =0;
        for(int i = 0 ; i < info.length() ; i++){
            char k = info.charAt(i);
            if(k=='/')cont++;
            else if (cont==0)placa += k;
            else if (cont==1)año += k;
            else if (cont==2)capacidad += k;
            else if (cont==3)kilometrage += k;
            else if (cont==4)numero_vinn += k;
            else if (cont==5)color += k;
            else if (cont==6)marca += k;
            else if (cont==7)sede += k;
            else if (cont==8)estado += k;
        }
        int pla = Integer.parseInt(placa);
        int an = Integer.parseInt(año);
        int cap = Integer.parseInt(capacidad);
        int kil = Integer.parseInt(kilometrage);
        int vinn = Integer.parseInt(numero_vinn);
        
        vehiculo vei = new vehiculo(pla,an,color,marca,cap,kil,vinn,sede,estado);
        System.out.println("vehiculo..............");
        System.out.println(vei.get_anno());
        System.out.println(vei.get_cap());
        System.out.println(vei.get_color());
        System.out.println(vei.get_estado());
        System.out.println(vei.get_kil());
        System.out.println(vei.get_marca());
        System.out.println(vei.get_placa());
        System.out.println("vehiculo..............");
        /**validar numero de placa o vinn repetidos*/        
        for(int i=0;i< Array_vehiculos.size();i++){
            if(vei.get_placa()==Array_vehiculos.get(i).get_placa() ||
                vei.get_num()==Array_vehiculos.get(i).get_num()){
                    JOptionPane.showMessageDialog(null, "Numero de placa o vinn repetidos, vehiculo no se tomara en cuenta", "ERROR!!!", JOptionPane.WARNING_MESSAGE);
                    return false;
                }
        }
        Array_vehiculos.add(vei);
        genjsonvehiculo();
        return true;
    }
    
    public void genjsonvehiculo(){        
        JSONObject obj = new JSONObject();
        
        for(int i=0;i<Array_vehiculos.size();i++){            
           obj.put("Placa",Array_vehiculos.get(i).get_placa());
           obj.put("Año",Array_vehiculos.get(i).get_anno());
           obj.put("Capacidad",Array_vehiculos.get(i).get_cap());
           obj.put("Color",Array_vehiculos.get(i).get_color());
           obj.put("Estado",Array_vehiculos.get(i).get_estado());
           obj.put("Kilómetros",Array_vehiculos.get(i).get_kil());
           obj.put("Marca",Array_vehiculos.get(i).get_marca());
           obj.put("Número",Array_vehiculos.get(i).get_num());
           obj.put("sede",Array_vehiculos.get(i).get_sede());
           
           
        }
        arreglovehiculos.add(obj);
        
        
        //C:/Users/metal/Documents/GitHub7progra_1_poo/tarea_programada_1/usuarios/
        try (FileWriter file = new FileWriter("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/vehiculos.json")) {
 
        
        file.write(arreglovehiculos.toJSONString());
        }
        catch (IOException e){
        System.out.print(e.getMessage());
        }
    
       
        
    }
    private boolean chocan_horarios(String inib,String finb,String iniv,String finv){//throws ParseException {
        int ini1,ini2,fin1,fin2;
        try{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                     
        Date fechaInicial_b = dateFormat.parse(inib);
        Date fechaInicial_v = dateFormat.parse(iniv);
                     
        Date fechaFinal_b = dateFormat.parse(finb);
        Date fechaFinal_v = dateFormat.parse(finv);
                     
        ini1=(int) ((fechaInicial_v.getTime()-fechaInicial_b.getTime())/86400000);
        ini2=(int) ((fechaInicial_b.getTime()-fechaFinal_v.getTime())/86400000);
                     
        fin1=(int) ((fechaInicial_v.getTime()-fechaFinal_b.getTime())/86400000);
        fin2=(int) ((fechaFinal_b.getTime()-fechaFinal_v.getTime())/86400000);
        
        if( (ini1 <= 0 && ini2 <= 0) || (fin1 <= 0 && fin2 <= 0)){
            //choc= true;
            return  true;
        }
        //choc=false;        
        }
        catch( Exception e ) {
            System.out.println( "Se ha producido un error" );
        }  
        return  false;
    }
    
    public void dar_mantenimiento(String info, String empresa){
        /**mantenimiento*/
        String placa="";
        String ide="";
        String fech_ini_d="";
        String fech_ini_m="";
        String fech_ini_a="";        
        String fech_fin_d="";
        String fech_fin_m="";        
        String fech_fin_a="";   
        String monto="";        
        String detalle="";
        String tipo="";
        /**empresa*/
        String nombre="";
        String razon="";
        String ced="";
        String tel="";
        String dir_p="";
        String dir_c="";
        String dir_d="";
        String dir_s="";
        
        int cont =0;
        for(int i = 0 ; i < info.length() ; i++){
            char k = info.charAt(i);
            if(k=='/')cont++;
            else if (cont==0)placa += k;
            else if (cont==1)ide += k;
            else if (cont==2)fech_ini_d += k;
            else if (cont==3)fech_ini_m += k;
            else if (cont==4)fech_ini_a += k;
            else if (cont==5)fech_fin_d += k;
            else if (cont==6)fech_fin_m += k;
            else if (cont==7)fech_fin_a += k;
            else if (cont==8)monto += k;
            else if (cont==9)detalle += k;
            else if (cont==10)tipo += k;
        }
        cont =0;
        for(int i = 0 ; i < empresa.length() ; i++){
            char k = empresa.charAt(i);
            if(k=='/')cont++;
            else if (cont==0)nombre += k;
            else if (cont==1)razon += k;
            else if (cont==2)ced += k;
            else if (cont==3)tel += k;
            else if (cont==4)dir_p += k;
            else if (cont==5)dir_d += k;
            else if (cont==6)dir_c += k;
            else if (cont==7)dir_s += k;
        }           
        int pla=Integer.parseInt(placa);
        for(int i =0; i< Array_vehiculos.size();i++){
            if(pla == Array_vehiculos.get(i).get_placa() ){
                int p= Integer.parseInt(placa);
                int id=Integer.parseInt(ide);
                int fech_inid=Integer.parseInt(fech_ini_d);
                int fech_inim=Integer.parseInt(fech_ini_m);
                int fech_inia=Integer.parseInt(fech_ini_a);
                int fech_find=Integer.parseInt(fech_fin_d);
                int fech_finm=Integer.parseInt(fech_fin_m);
                int fech_fina=Integer.parseInt(fech_fin_a);
                int mnt=Integer.parseInt(monto);
                int ced_jur=Integer.parseInt(ced);
                int telefono =Integer.parseInt(tel);
                fecha in=new fecha(fech_inid,fech_inim,fech_inia);
                fecha fn=new fecha(fech_find,fech_finm,fech_fina);
                direccion dir= new direccion(dir_p,dir_c,dir_d,dir_s);
                empresa em = new empresa(nombre,razon,ced_jur,telefono,dir);
                servicio_mantenimiento serv =new servicio_mantenimiento(id,in,fn,mnt,detalle,tipo,em);
                Array_vehiculos.get(i).nuevo_servicio_mantenimiento(serv);
                Array_vehiculos.get(i).cambiar_estado("En mantenimiento");
            }
        }
    }
    
    public boolean aprovar_viaje(String consec){
        String chofer="";
        String viaje="";
        String viajeros="";
        String correoChofer="";
        String correoviajero="";
        viaje buscar = new viaje();
        
        for(int i=0; i< Array_viajes.size();i++){
            if(consec.compareTo(Array_viajes.get(i).get_consec()) == 0){
                buscar = Array_viajes.get(i);
            }
        }
        
        /**asigna chofer*/ //no debe chocar en hora con otro viaje        
         for(int i=0; i < Array_choferes.size();i++){
             boolean interruptor = true;
             for(int k=0; k< Array_viajes.size();k++){
                 
                            String inib = buscar.get_ini().get_a()+"-"+
                                          buscar.get_ini().get_m()+"-"+
                                          buscar.get_ini().get_d();
                            String finb = buscar.get_fin().get_a()+"-"+
                                          buscar.get_fin().get_m()+"-"+
                                          buscar.get_fin().get_d();
                            String iniv = Array_viajes.get(k).get_ini().get_a()+"-"+
                                          Array_viajes.get(k).get_ini().get_m()+"-"+
                                          Array_viajes.get(k).get_ini().get_d();
                            String finv = Array_viajes.get(k).get_fin().get_a()+"-"+
                                          Array_viajes.get(k).get_fin().get_m()+"-"+
                                          Array_viajes.get(k).get_fin().get_d();
                                          
                 if((Array_choferes.get(i).get_ced()==Array_viajes.get(k).get_chof().get_ced() )
                        && Array_viajes.get(k).get_estado().compareTo("Aprovado")==0){
                            
                     if(chocan_horarios(inib, finb, iniv, finv)){
                         interruptor = false;
                        }
                    }                  
            }
            //asigna chofer ya que no ubo choque de orario con ningun viaje aprovado
            if(interruptor){
                buscar.asigna_chofer(Array_choferes.get(i));
                chofer=Array_choferes.get(i).get_nom().toString()+"/"+Array_choferes.get(i).get_tel();
                correoChofer=Array_choferes.get(i).get_correo();
                break;
            }
        }
        /**asigna vehiculo*/ // no debe chocar en hora con otro viaje
         for(int i=0; i < Array_vehiculos.size();i++){
             boolean interruptor = true;
             for(int k=0; k< Array_viajes.size();k++){
                 
                            String inib = buscar.get_ini().get_a()+"-"+
                                          buscar.get_ini().get_m()+"-"+
                                          buscar.get_ini().get_d();
                            String finb = buscar.get_fin().get_a()+"-"+
                                          buscar.get_fin().get_m()+"-"+
                                          buscar.get_fin().get_d();
                            String iniv = Array_viajes.get(k).get_ini().get_a()+"-"+
                                          Array_viajes.get(k).get_ini().get_m()+"-"+
                                          Array_viajes.get(k).get_ini().get_d();
                            String finv = Array_viajes.get(k).get_fin().get_a()+"-"+
                                          Array_viajes.get(k).get_fin().get_m()+"-"+
                                          Array_viajes.get(k).get_fin().get_d();
                                          
                 if((Array_vehiculos.get(i).get_placa()==Array_viajes.get(k).get_vehiculo().get_placa())
                        && Array_viajes.get(k).get_estado().compareTo("Aprovado")==0){
                            
                     if(chocan_horarios(inib, finb, iniv, finv)){
                         interruptor = false;
                        }
                    }                  
            }
            //asigna vehiculo ya que no ubo choque de orario con ningun viaje aprovado
            if(interruptor){
                buscar.asigna_vehiculo(Array_vehiculos.get(i));
                break;
            }
        }
         
        /**capacidad de pasajeros menos o igual a capacidad a vehiculo*/
        if(buscar.get_vehiculo().get_cap() < (buscar.cantidad_pasajeros()+1)){//se suma uno por chofer
            /**si esto se cumple no debe realizar viaje*/
            JOptionPane.showMessageDialog(null, "Se excede la cantidad de pasajeros, viaje no se puede realizar", "ERROR!!!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        /**hacer pdf y mandar*/
        /**estado pasa a aprovado*/
        /**Obtener los viajeros para generar el pdf*/
        for (int i=0; i<buscar.get_array_pasajeros().size();i++){
            viajeros+=buscar.get_array_pasajeros().get(i).get_nom()+"/";
            viajeros+=buscar.get_array_pasajeros().get(i).get_tel()+"\n";            
        }
        viaje="Lugar de inicio: "+ buscar.get_dest()+" Fecha inicio: "+buscar.get_ini().get_d()+"-"+buscar.get_ini().get_m()+"-"
        +buscar.get_ini().get_a()+ " Fecha finalización: "+ buscar.get_fin().get_d()+"-"+
        buscar.get_fin().get_m()+"-"+ buscar.get_fin().get_a();
        for(int i=0; i< Array_viajes.size();i++){
            if(consec.compareTo(Array_viajes.get(i).get_consec()) == 0){
                System.out.println("aprovado......");
                Array_viajes.get(i).cambiar_estado("Aprovado");
                Array_viajes.get(i).get_vehiculo().agregar_kilometros(Array_viajes.get(i).get_kil());
                ApiContextInitializer.init();
                TelegramBotsApi telegramBotsApi=new TelegramBotsApi();
                Bot bot=new Bot();
                bot.setestado(Array_viajes.get(i).get_estado());
                
                try{
                    telegramBotsApi.registerBot(bot);
                }
                catch(TelegramApiRequestException e){
                    e.printStackTrace();
                }
            }
        }
        CrearPDF pdf=new CrearPDF();
        pdf.genPDF(chofer, viaje, viajeros);
        MandarCorreo correo=new MandarCorreo();
        correo.generateAndSendEmail(correoChofer);
        for(int i=0;i<buscar.get_array_pasajeros().size();i++){
            correoviajero=buscar.get_array_pasajeros().get(i).get_correo();
            correo.generateAndSendEmail(correoviajero);
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

