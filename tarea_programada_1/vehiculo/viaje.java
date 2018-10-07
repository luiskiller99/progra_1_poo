package tarea_programada_1.vehiculo;
import java.util.ArrayList;

/**
 * Write a description of class viaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class viaje
{
    /**
     * Constructor for objects of class viaje
     */
    private int consec_num=0;
    private String consecutivo="VIA-";
    private String punto_salida;
    private fecha fech_ini;
    private fecha fech_fin;
    private String destino;
    private chofer chofer_asignado;
    private int kilometrage;//de un auto, meter auto
    private String estado;
    private ArrayList<persona> lista_pasajeros = new ArrayList<persona>();
    private fecha solicitud;//se pide al OS
    private vehiculo vehiculo_asignado;
    
    public viaje(){}
    public viaje(String sal,String dest,fecha ini,fecha fin,String estado)
    
    {
        set_consec();
        set_sal(sal);
        set_ini(ini);
        set_fin(fin);
        set_dest(dest);
        //set_chof(chof);
        set_estado(estado);
    }
    //seters
    private void set_consec(){consecutivo=consecutivo+Integer.toString(consec_num);}
    private void set_sal(String sal){punto_salida=sal;}
    private void set_ini(fecha ini){fech_ini=ini;}
    private void set_fin(fecha fin){fech_fin=fin;}
    private void set_dest(String des){destino=des;}
    private void set_chof(chofer chof){chofer_asignado=chof;}
    private void set_estado(String est){estado=est;}
    //geters
    public String get_consec(){return consecutivo;}
    public String get_sal(){return punto_salida;}
    public fecha get_ini(){return fech_ini;}
    public fecha get_fin(){return fech_fin;}
    public String get_dest(){return destino;}
    public chofer get_chof(){return chofer_asignado;}
    public String get_estado(){return estado;}    
    public vehiculo get_vehiculo(){return vehiculo_asignado;}  
    public ArrayList<persona> get_array_pasajeros(){return lista_pasajeros;}
    //metodos normales
    public void agregar_pasajero(persona pers){
        lista_pasajeros.add(pers);
    }
    public void cambiar_estado(String est){
        estado=est;
    }
    public void asigna_chofer(chofer ch){
        chofer_asignado=ch;
    }
    public void asigna_vehiculo(vehiculo ve){
        vehiculo_asignado=ve;
    }
    public int cantidad_pasajeros(){
        return lista_pasajeros.size();
    }
 
}
