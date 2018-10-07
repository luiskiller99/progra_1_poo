package tarea_programada_1.usuarios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.nio.file.Files;
import tarea_programada_1.vehiculo.persona;
import tarea_programada_1.vehiculo.direccion;

public class Json{    
    
    public void leerJSONusuarios() {
        try{
        JSONParser parser=new JSONParser();
        JSONArray arregloJson= (JSONArray) parser.parse(new FileReader("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/secretarias.json"));
        for(int i=0;i<arregloJson.size();i++){
            JSONObject elemento= (JSONObject) arregloJson.get(i);
            direccion direccion=new direccion(elemento.get("Provincia").toString(),elemento.get("Canton").toString(),
            elemento.get("Distrito").toString(),elemento.get("Señas").toString());
            persona individuo = new persona(elemento.get("Nombre").toString(),Integer.parseInt(elemento.get("Cedula").toString()),
            direccion,elemento.get("Correo").toString(),Integer.parseInt(elemento.get("Numero").toString()));
            usuario usuario=new usuario(individuo,elemento.get("Departamento").toString(),
            elemento.get("Usuario").toString(),elemento.get("Contraseña").toString());
         
        }
        }
        catch (FileNotFoundException e){
          System.out.print(e);
        
        }
        catch (IOException e){
          System.out.print(e);
        }
        catch (ParseException e){
        System.out.print(e);        
        }
        //System.out.print(arregloJson);
        
    
    }
    
    public void leerJSONpasajeros() {
        try{
        JSONParser parser=new JSONParser();
        JSONArray arregloJson=(JSONArray) parser.parse(new FileReader("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/file1.json"));
        for(int i=0;i<arregloJson.size();i++){
            JSONObject elemento= (JSONObject) arregloJson.get(i);
            direccion direccion=new direccion(elemento.get("Provincia").toString(),elemento.get("Canton").toString(),
            elemento.get("Distrito").toString(),elemento.get("Señas").toString());
            persona individuo = new persona(elemento.get("Nombre").toString(),Integer.parseInt(elemento.get("Cedula").toString()),
            direccion,elemento.get("Correo").toString(),Integer.parseInt(elemento.get("Numero").toString()));
            
        }
    }
    catch (FileNotFoundException e){
          System.out.print(e);
        
        }
        catch (IOException e){
          System.out.print(e);
        }
        catch (ParseException e){
        System.out.print(e);        
        }
    }    
}

