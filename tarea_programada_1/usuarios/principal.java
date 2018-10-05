package tarea_programada_1.usuarios;
import tarea_programada_1.vehiculo.persona;
import tarea_programada_1.vehiculo.direccion;
import java.util.ArrayList;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
public class principal
{
    ArrayList<usuario> Array_usuarios = new ArrayList<usuario>();
    ArrayList<persona> Array_pasajeros = new ArrayList<persona>();    
    
    public principal(){
        //usuario de pruevas
        direccion res=new direccion("","","","");
        persona hola=new persona("",5,res,"",3);
        usuario aquel=new usuario(hola,"hols");
        Array_usuarios.add(aquel);
        //eliminar
    }
    
    public void nuevo_secretaria(String info){
        String cedula="";
        String nombre="";
        String provincia="";
        String canton="";
        String distrito="";
        String señas="";
        String correo="";
        String telefono="";
        String departamento="";
        /**obtiene informacion de string*/
        int cont=0;
        for(int i = 0 ; i < info.length() ; i++){
            char c = info.charAt(i);
            if(c=='/')cont++;
            else if (cont==0)nombre += c;
            else if (cont==1)cedula += c;
            else if (cont==2)provincia += c;
            else if (cont==3)canton += c;
            else if (cont==4)distrito += c;
            else if (cont==5)señas += c;
            else if (cont==6)correo += c;
            else if (cont==7)departamento += c;
            else if (cont==8)telefono += c;            
        }    
        direccion dir = new direccion(provincia,canton,distrito,señas);
        int ced = Integer.parseInt(cedula);
        int tel = Integer.parseInt(telefono);
        persona pers= new persona(nombre,ced,dir,correo,tel);
        usuario usu= new usuario(pers,departamento);
        Array_usuarios.add(usu);
    }
    
    public void genjsonsec(){
        JSONObject obj = new JSONObject();
        for(int i=0;i<Array_usuarios.size();i++){            
           obj.put("Cedula",Array_usuarios.get(i).get_cedula());
           obj.put("Nombre", Array_usuarios.get(i).get_nombre());            
           obj.put("Cantón",Array_usuarios.get(i).get_canton());
           obj.put("Distrito",Array_usuarios.get(i).get_distrito());
           obj.put("Provincia",Array_usuarios.get(i).get_provincia());
           obj.put("Señas",Array_usuarios.get(i).get_señas());            
           obj.put("Telefono",Array_usuarios.get(i).get_telefono());
           obj.put("Correo",Array_usuarios.get(i).get_correo());
           obj.put("Usuario",Array_usuarios.get(i).get_usuario());
           obj.put("Constraseña",Array_usuarios.get(i).get_contraseña());
        }
        //C:/Users/metal/Documents/GitHub7progra_1_poo/tarea_programada_1/usuarios/
        try (FileWriter file = new FileWriter("C:/Users/metal/Documents/GitHub/progra_1_poo/tarea_programada_1/usuarios/secretarias.json",true)) {
		file.append(obj.toJSONString());
	}
	catch (IOException e){
	    System.out.print(e.getMessage());
	   }
        
    }
    
    public boolean validar_adm(String usu,String cont){        
        int us = usu.compareTo("administrador");
        int co = cont.compareTo("123admin!");
        if(us==0 && co==0){return true;}
        return false;        
    }
    public boolean validar_sec(String usu,String cont){        
        for (int i = 0 ; i < Array_usuarios.size() ; i++){                          
            int us = usu.compareTo(Array_usuarios.get(i).get_usuario());
            int co = cont.compareTo(Array_usuarios.get(i).get_contraseña());            
            if(us==0 && co==0){return true;}        
        }
        return false;        
    }
    public boolean agregar_pasajero(String info){        
        
        String cedula="";
        String nombre="";
        String provincia="";
        String canton="";
        String distrito="";
        String señas="";
        String correo="";
        String telefono="";
        /**obtiene informacion de string*/
        int cont=0;
        for(int i = 0 ; i < info.length() ; i++){
            char c = info.charAt(i);
            if(c=='/')cont++;
            else if (cont==0)cedula += c;
            else if (cont==1)nombre += c;
            else if (cont==2)provincia += c;
            else if (cont==3)canton += c;
            else if (cont==4)distrito += c;
            else if (cont==5)señas += c;
            else if (cont==6)correo += c;
            else if (cont==7)telefono += c;            
        }    
        /**crea los objetos y procede a verificar si existe otro
        con el mismo numero de cedula*/
        direccion dir = new direccion(provincia,canton,distrito,señas);
        persona pers = new persona(nombre,Integer.parseInt(cedula),dir,correo,Integer.parseInt(telefono));
        for (int i = 0; i < Array_pasajeros.size() ; i++ ){
            if(Array_pasajeros.get(i).get_ced()==pers.get_ced()){
            return false;
            }
        }
        /**agrega nuevo pasajero al arreglo de pasajeros*/
        /**meter en jason*/
        Array_pasajeros.add(pers);
        genjson();
        return true;
    }
    public void solicitar_viaje(String info, String list_pas){
        //obtener informacion
        String pnt_salida="";
        String pnt_destino="";
        String dia_salida="";
        String mes_salida="";
        String ano_salida="";
        String dia_llegada="";
        String mes_llegada="";
        String ano_llegada="";
        String cedula_pasajero="";
        //interseccion de fechas vasia
        //fecha con 24 horas de diferencia//tomar fecha de sistema operativo        
        //debe aber un pasajero almenos
        //escribir en json
    }
    @SuppressWarnings("unchecked")
    public void genjson() {
        JSONObject obj = new JSONObject();
        for(int i=0;i<Array_pasajeros.size();i++){            
            obj.put("Cedula",Array_pasajeros.get(i).get_ced());
            obj.put("Nombre", Array_pasajeros.get(i).get_nom());            
            obj.put("Cantón",Array_pasajeros.get(i).get_dir().get_can());
            obj.put("Distrito",Array_pasajeros.get(i).get_dir().get_dis());
            obj.put("Provincia",Array_pasajeros.get(i).get_dir().get_pro());
            obj.put("Señas",Array_pasajeros.get(i).get_dir().get_se());            
            obj.put("Telefono",Array_pasajeros.get(i).get_tel());
            obj.put("Correo",Array_pasajeros.get(i).get_correo());
        }
        //C:/Users/metal/Documents/GitHub7progra_1_poo/tarea_programada_1/usuarios/
        try (FileWriter file = new FileWriter("C:/Users/metal/Documents/GitHub/progra_1_poo/tarea_programada_1/usuarios/file1.json",true)) {
		file.append(obj.toJSONString());
	}
	catch (IOException e){
	    System.out.print(e.getMessage());
	   }

    }

}