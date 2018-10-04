package usuarios;


/**
 * Write a description of class Secretaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Secretaria
{
    /**
     * Constructor for objects of class Secretaria
     */
    String nombre;
    String departamento;
    String nombre_usuario;
    int contrasenia;
    int telefono;
    
    public Secretaria(String nom,String dep,String usu,
    int contrasenia,int telefono)
    {
        set_nom(nom);
        set_dep(dep);
        set_usu(usu);
        set_cont(contrasenia);
        set_tel(telefono);
    }
    //seters
    private void set_nom(String nom){nombre=nom;}
    private void set_dep(String dep){departamento=dep;}
    private void set_usu(String usu){nombre_usuario=usu;}
    private void set_cont(int con){contrasenia=con;}
    private void set_tel(int tel){telefono=tel;}
    //geters
    public String get_nom(){return nombre;}
    public String get_dep(){return departamento;}
    public String get_usu(){return nombre_usuario;}
    public int get_cont(){return contrasenia;}
    public int get_tel(){return telefono;}
}
