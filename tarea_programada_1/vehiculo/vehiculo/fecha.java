package tarea_programada_1.vehiculo;


/**
 * Write a description of class fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fecha
{

    int dia;
    int mes;
    int anno;
    /**
     * Constructor for objects of class fecha
     */
    public fecha(int d,int m,int a)
    {
        set_d(d);
        set_m(m);
        set_a(a);
    }
    //seters
    private void set_d(int d){dia=d;}
    private void set_m(int m){mes=m;}
    private void set_a(int a){anno=a;}    
    //geters
    public int get_d(){return dia;}
    public int get_m(){return mes;}    
    public int get_a(){return anno;}    
}
