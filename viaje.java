package vehiculo;


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
    int consec_num=0;
    String consecutivo="VIA-";
    String punto_salida;
    fecha fech_ini;
    fecha fech_fin;
    String destino;
    chofer chofer_asignado;
    int kilometrage;//de un auto, meter auto
    String estado;
    persona[] lista_pasajeros = new persona[0];    
    fecha solicitud;//se pide al OS
    public viaje(String sal,fecha ini,fecha fin,String dest,
    chofer chof,String estado)
    {
        set_consec();
        set_sal(sal);
        set_ini(ini);
        set_fin(fin);
        set_dest(dest);
        set_chof(chof);
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

 
}
