package tarea_programada_1.usuarios;
import tarea_programada_1.vehiculo.persona;
import tarea_programada_1.vehiculo.direccion;
public class usuario
{
    private persona individuo;
    private String departamento;
    private String usuario="metal0500";
    private String contraseña="luise5847";
    public usuario(persona ind,String dep)
    {
        set_persona(ind);
        set_dep(dep);
        set_usu();
        set_cont();
    }
    private void set_persona(persona ind){individuo=ind;}
    private void set_dep(String dep){departamento=dep;}
    private void set_usu(){}
    private void set_cont(){}
    public String get_usuario(){
        return usuario;
    }
    public String get_contraseña(){
        return contraseña;
    }
}

