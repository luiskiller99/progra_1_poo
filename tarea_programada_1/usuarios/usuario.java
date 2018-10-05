package tarea_programada_1.usuarios;
import tarea_programada_1.vehiculo.persona;
import tarea_programada_1.vehiculo.direccion;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
public class usuario
{
    private persona individuo;
    private String departamento;
    private String usuario;
    private String contraseña;   
    
    public usuario(persona ind,String dep)
    {
        set_persona(ind);
        set_dep(dep);
        set_usu();
        set_cont();
    }
    private void set_persona(persona ind){individuo=ind;}
    private void set_dep(String dep){departamento=dep;}
    private void set_usu(){
        String correo=individuo.get_correo();
        String temp="";
        
        for(char c:correo.toCharArray()){            
            if (c==64)
            break;
            temp+=c;
        }
        usuario=temp;
    }
    private void set_cont(){
       final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz~!#$%&/@Â¿?^";
       SecureRandom rnd = new SecureRandom();
       int cont=0;
       int len=new Random().nextInt(5)+8; 
       StringBuilder sb = new StringBuilder( len );
       for( int i = 0; i < len; i++ ) 
          sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
       
       String respaldo=sb.toString();       
       for(char c:respaldo.toCharArray()){
           if (c==33||c==34||c==35||c==36||
           c==37||c==38||c==47||c==63||
           c==64||c==94||c==126||c==168){
               cont++;
            }           
        }
       if(cont==0)
       set_cont();
       
       contraseña=respaldo;        
    }
    public String get_usuario(){
        return usuario;
    }
    
    public String get_contraseña(){
        return contraseña;
    }
    
    public int get_cedula(){
        return individuo.get_ced();
    }
    
    public String get_nombre(){
        return individuo.get_nom();
    }
    
    public String get_provincia(){
        return individuo.get_dir().get_pro();
    }
    
    public String get_canton(){
        return individuo.get_dir().get_can();           
    }
    
    public String get_distrito(){
        return individuo.get_dir().get_dis();
    }
    
    public String get_señas(){
        return individuo.get_dir().get_se();
    }
    
    public int get_telefono(){
        return individuo.get_tel();
    }
    
    public String get_correo(){
        return individuo.get_correo();
    }
    
}
