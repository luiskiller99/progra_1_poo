package tarea_programada_1.vehiculo;


/**
 * Write a description of class vehiculo here.
 * 
 * @author (Luis) 
 * @version (a version number or a date)
 */
public class vehiculo
{    
    //Atributos
    private int placa=0;
    private int año =0;
    private int capacidad=0;
    private int Kilometraje =0;
    private int numero_vin =0;    
    private String color="";
    private String marca="";
    private String sede="";
    private String estado="";
    servicio_mantenimiento[] lista_servicio_mantenimiento = new servicio_mantenimiento[0];
    //metodos
    
    /**
     * Constructor for objects of class vehiculo
     */
    public vehiculo(int pla,int anno,String col, String mar,
                        int cap,int kil,int num,String sede, 
                        String estado){
        set_placa(pla);
        set_anno(anno);
        set_color(col);
        set_marca(mar);
        set_cap(cap);
        set_kil(kil);
        set_num(num);
        set_sede(sede);
        set_estado(estado);
    }
    private void set_placa(int pla){placa=pla;}
    private void set_anno(int ann){año=ann;}
    private void set_color(String col){color=col;}
    private void set_marca(String mar){marca=mar;}
    private void set_cap(int cap){capacidad=cap;}
    private void set_kil(int kil){Kilometraje=kil;}
    private void set_num(int num){numero_vin=num;}
    private void set_sede(String sed){sede=sed;}
    private void set_estado(String est){estado=est;}
    
    public int get_placa(){return placa;}
    public int get_anno(){return año;}
    public String get_color(){return color;}
    public String get_marca(){return marca;}
    public int get_cap(){return capacidad;}
    public int get_kil(){return Kilometraje;}
    public int get_num(){return numero_vin;}
    public String get_sede(){return sede;}
    public String get_estado(){return estado;}   
    public void agregar_kilometros(int kil){Kilometraje+=kil;}   
}

