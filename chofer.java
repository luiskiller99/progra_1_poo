 


/**
 * Write a description of class chofer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chofer
{
    /**
     * Constructor for objects of class chofer
     */
    String nombre;
    int telefono;
    String correo;
    int cedula;
    licencia[] lista_licencias = new licencia[0];
    //metodos
    public chofer(String nom,int tel,String correo,int ced)
    {
        set_nom(nom);
        set_tel(tel);
        set_correo(correo);
        set_ced(ced);
    }
    //seters
    private void set_nom(String nom){nombre=nom;}    
    private void set_tel(int tel){telefono=tel;}
    private void set_correo(String cor){correo=cor;}
    private void set_ced(int ced){cedula=ced;}
    //geters
    public String get_nom(){return nombre;}    
    public int get_tel(){return telefono;}
    public String get_correo(){return correo;}
    public int get_ced(){return cedula;}
}
