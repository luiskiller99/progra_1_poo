package tarea_programada_1.usuarios;
import tarea_programada_1.vehiculo.persona;
import tarea_programada_1.vehiculo.direccion;

public class principal
{
    usuario Array_usuarios[] = new usuario[1];
    
    public principal(){
        direccion res=new direccion("","","","");
        persona hola=new persona("",5,res,"",3);
        usuario aquel=new usuario(hola,"hols");
        Array_usuarios[0]=aquel;
    }
    
    public boolean validar_adm(String usu,String cont){        
        int us = usu.compareTo("administrador");
        int co = cont.compareTo("123admin!");
        if(us==0 && co==0){return true;}
        return false;        
    }
    public boolean validar_sec(String usu,String cont){        
        for (int i =0;i<Array_usuarios.length;i++){  
            System.out.println(Array_usuarios[i].get_usuario());
            System.out.println(Array_usuarios[i].get_contraseña());
            int us = usu.compareTo(Array_usuarios[i].get_usuario());
            int co = cont.compareTo(Array_usuarios[i].get_contraseña());            
            System.out.println(us);
            System.out.println(co);
            if(usu==Array_usuarios[i].get_usuario()){
                System.out.println("hola putos");
            }
            if(us==0 && co==0){return true;}        
        }
        return false;        
    }
}
