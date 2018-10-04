 


/**
 * Write a description of class empresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class empresa
{
    /**
     * Constructor for objects of class empresa
     */
    String nombre;
    String razon_social;
    int ced_juridica;
    int telefono;
    direccion direc;
    public empresa(String nom,String razon_soc,int ced_jur,int tel,
    direccion dir)    
    {
        set_nom(nom);
        set_razon(razon_soc);
        set_cedjur(ced_jur);
        set_tel(tel);
        set_dir(dir);
    }
    //seters
    private void set_nom(String nom){nombre=nom;}    
    private void set_razon(String razon_soc){razon_social=razon_soc;}
    private void set_cedjur(int ced_jur){ced_juridica=ced_jur;}
    private void set_tel(int tel){telefono=tel;}
    private void set_dir(direccion dir){direc=dir;}
    //geters
    public String get_nom(){return nombre;}    
    public String get_razon(){return razon_social;}
    public int get_cedjur(){return ced_juridica;}
    public int get_tel(){return telefono;}
    public direccion get_dir(){return direc;}   
}
