 


/**
 * Write a description of class licencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class licencia
{
  
    int numero;
    fecha emicion;
    fecha expiracion;
    /**
     * Constructor for objects of class licencia
     */
    public licencia(int num, fecha em, fecha ex)
    {
        set_num(num);
        set_em(em);
        set_ex(ex);
    }
    //seters
    private void set_num(int num){numero=num;}
    private void set_em(fecha em){emicion=em;}
    private void set_ex(fecha ex){expiracion=ex;}    
    //geters
    public int get_num(){return numero;}    
    public fecha get_em(){return emicion;}        
    public fecha get_ex(){return expiracion;}        

 
}
