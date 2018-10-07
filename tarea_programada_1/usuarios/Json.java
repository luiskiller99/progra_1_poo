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

public class Json{
    static void leerJSONusuarios() throws FileNotFoundException, IOException, ParseException{
        JSONParser parser=new JSONParser();
        JSONArray arregloJson= (JSONArray) parser.parse(new FileReader("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/secretarias.json"));
        
        //System.out.print(arregloJson);
        
        for(int i=0;i<arregloJson.size();i++){
            JSONObject elemento= (JSONObject) arregloJson.get(i);            
            System.out.print(elemento.get("Nombre")+"/");            
            System.out.print(elemento.get("Cantón")+"/");
            System.out.print(elemento.get("Correo")+"/");
            System.out.print(elemento.get("Señas")+"/");
            System.out.print(elemento.get("Usuario")+"/");
            System.out.print(elemento.get("Telefono")+"/");
            System.out.print(elemento.get("Cedula")+"/");
            System.out.print(elemento.get("Distrito")+"/");
            System.out.print(elemento.get("Contraseña")+"/");
            System.out.print(elemento.get("Provincia")+"\n");
            
        }    
    }
    
    static void leerJSONpasajeros() throws FileNotFoundException, IOException, ParseException{
        JSONParser parser=new JSONParser();
        JSONArray arregloJson=(JSONArray) parser.parse(new FileReader("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/file1.json"));
        for(int i=0;i<arregloJson.size();i++){
            JSONObject elemento= (JSONObject) arregloJson.get(i);            
            System.out.print(elemento.get("Nombre")+"/");            
            System.out.print(elemento.get("Cantón")+"/");
            System.out.print(elemento.get("Correo")+"/");
            System.out.print(elemento.get("Señas")+"/");            
            System.out.print(elemento.get("Telefono")+"/");
            System.out.print(elemento.get("Cedula")+"/");
            System.out.print(elemento.get("Distrito")+"/");
            System.out.print(elemento.get("Provincia")+"\n");
            
        }  
        
    }
    
    static void leerJSONviajes() throws FileNotFoundException, IOException, ParseException{
        JSONParser parser=new JSONParser();
        JSONArray arregloJson=(JSONArray) parser.parse(new FileReader("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/viajes.json"));
        for(int i=0;i<arregloJson.size();i++){
            JSONObject elemento= (JSONObject) arregloJson.get(i);
            System.out.print(elemento.get("Destino")+"/");            
            System.out.print(elemento.get("Chofer")+"/");
            System.out.print(elemento.get("Salida")+"/");
            System.out.print(elemento.get("Estado")+"/");            
            System.out.print(elemento.get("Consecutivo")+"/");
            System.out.print(elemento.get("FechaFin")+"/");
            System.out.print(elemento.get("FechaIni")+"\n");
        }
    }
    
    static void main(String Args[]) throws FileNotFoundException, IOException, ParseException{
        Json prueba=new Json();
        System.out.print("=========================Usuarios=========================\n");
        Json.leerJSONusuarios();
        System.out.print("=========================Pasajeros=========================\n");
        Json.leerJSONpasajeros();
        System.out.print("=========================Viajes=========================\n");
        Json.leerJSONviajes();
    }
    
    
}

