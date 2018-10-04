 package vehiculo;


/**
 * Write a description of class persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class persona
{
    String nombre;
    int cedula;
    direccion direc;
    String correo;
    int telefono;
    
    public persona(String nombre,int cedula,direccion direc,
    String correo,int telefono)
    {
            set_nom(nombre);
            set_ced(cedula);
            set_dir(direc);
            set_correo(correo);
            set_tel(telefono);
    }
    //seters
    private void set_nom(String nom){nombre=nom;}
    private void set_ced(int ced){cedula=ced;}
    private void set_dir(direccion dir){direc=dir;}
    private void set_correo(String corr){correo=corr;}
    private void set_tel(int tel){telefono=tel;}
    //geters
    public String get_nom(String nom){return nombre;}
    public int get_ced(int ced){return cedula;}
    public direccion get_dir(direccion dir){return direc;}
    public String get_correo(String corr){return correo;}
    public int get_tel(int tel){return telefono;}


}
