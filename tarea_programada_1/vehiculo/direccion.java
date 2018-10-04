package vehiculo;


/**
 * Write a description of class direccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class direccion
{

    /**
     * Constructor for objects of class direccion
     */
    String provincia;
    String canton;
    String distrito;
    String señas;
    public direccion(String pro,String can,String dis,String se)
    {
        set_pro(pro);
        set_can(can);
        set_dis(dis);
        set_se(se);
    }
    private void set_pro(String pro){provincia=pro;}
    private void set_can(String can){canton=can;}
    private void set_dis(String dis){distrito=dis;}
    private void set_se(String se){señas=se;}
    public String get_pro(){return provincia;}
    public String get_can(){return canton;}
    public String get_dis(){return distrito;}
    public String get_se(){return señas;}
}
