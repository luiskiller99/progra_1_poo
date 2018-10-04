package tarea_programada_1.usuarios;
public class principal
{
    
    public principal()
    {
        // initialise instance variables       
    }
    public boolean validar_adm(String usu,String cont){        
        int us = usu.compareTo("administrador");
        int co = cont.compareTo("123admin!");
        if(us==0 && co==0){return true;}
        return false;        
    }
    public boolean validar_sec(String usu,String cont){        
        int us = usu.compareTo("administrador");
        int co = cont.compareTo("123admin!");
        if(us==0 && co==0){return true;}
        return false;        
    }
}
