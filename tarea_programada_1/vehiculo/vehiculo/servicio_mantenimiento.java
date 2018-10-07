package tarea_programada_1.vehiculo;


/**
 * Write a description of class servicio_mantenimiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class servicio_mantenimiento
{
    // instance variables - replace the example below with your own
    private static int consecutivo_num=0;
    private int identificador_servicio=0;
    private fecha fecha_inicio;
    private fecha fecha_final ;
    private int monto=0;
    private String consecutivo="";//el formato “ID-SM-XXX�?. Donde XXX es un consecutivo numérico que inicia en 1.
    private String detalle="";    
    private String tipo="";
    empresa empresa_l;

    /**
     * Constructor for objects of class servicio_mantenimiento
     */
    public servicio_mantenimiento(int ide,fecha fech_ini,fecha fech_fin,
            int monto,String detalle, String tipo,empresa empresa_nom)
    {
        set_ide(ide);
        set_fech_ini(fech_ini);
        set_fech_fin(fech_fin);
        set_monto(monto);
        set_detalle(detalle);
        set_tipo(tipo);
        set_empresa(empresa_nom);
        set_consecutivo();
    }
    //seters
    private void set_ide(int ide){identificador_servicio=ide;}
    private void set_fech_ini(fecha fech_ini){fecha_inicio=fech_ini;}    
    private void set_fech_fin(fecha fech_fin){fecha_final=fech_fin;}
    private void set_monto(int mont){monto=mont;}
    private void set_detalle(String detale){detalle=detale;}
    private void set_tipo(String tip){tipo=tip;}
    private void set_empresa(empresa emp){empresa_l=emp;}
    private void set_consecutivo(){consecutivo="ID-SM"+ Integer.toString(consecutivo_num);}    
    //geters
    public int get_ide(){return identificador_servicio;}
    public fecha get_fech_ini(){return fecha_inicio;}
    public fecha get_fech_fin(){return fecha_final;}
    public int get_monto(){return monto;}
    public String get_detalle(){return detalle;}
    public String get_tipo(){return tipo;}
    public empresa get_emp(){return empresa_l;}
    //public String get_empresa(){return empresa;}    
}
