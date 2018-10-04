package tarea_programada_1.usuarios;

public class usuario
{

    private String nombre;
    private String departamento;
    private String nom_usu;
    private String contraseña;
    private int telefono;
    public usuario(String nom, String dep, int tel)
    {
        set_nom(nom);
        set_dep(dep);
        set_tel(tel);
        set_usu();
        set_cont();
    }
    private void set_nom(String nom){nombre=nom;}
    private void set_dep(String dep){departamento=dep;}
    private void set_tel(int tel){telefono=tel;}
    private void set_usu(){}
    private void set_cont(){}
}
