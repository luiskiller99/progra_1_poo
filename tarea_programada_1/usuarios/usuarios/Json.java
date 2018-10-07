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
import tarea_programada_1.vehiculo.viaje;
import tarea_programada_1.vehiculo.fecha;
import tarea_programada_1.vehiculo.vehiculo;
import tarea_programada_1.vehiculo.licencia;
import tarea_programada_1.vehiculo.chofer;
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
    
    public void leerJSONviajes() {
        try{
        JSONParser parser=new JSONParser();
        JSONArray arregloJson=(JSONArray) parser.parse(new FileReader("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/viajes.json"));
        for(int i=0;i<arregloJson.size();i++){
            JSONObject elemento= (JSONObject) arregloJson.get(i);
            fecha inicio=new fecha(Integer.parseInt(elemento.get("DiaI").toString()),
            Integer.parseInt(elemento.get("MesI").toString()), Integer.parseInt(elemento.get("AñoI").toString()));
            fecha finalizacion=new fecha(Integer.parseInt(elemento.get("DiaF").toString()),
            Integer.parseInt(elemento.get("MesF").toString()), Integer.parseInt(elemento.get("AñoF").toString()));
            viaje viaje=new viaje(elemento.get("Salida").toString(),elemento.get("Destino").toString(),
            inicio, finalizacion, elemento.get("Estado").toString(), Integer.parseInt(elemento.get("Kilometros").toString()));
            
            
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
    
    public void leerJSONvehiculos() {
        try{
        JSONParser parser=new JSONParser();
        JSONArray arregloJson=(JSONArray) parser.parse(new FileReader("D:/Descargas/GitHub/progra_1_poo/tarea_programada_1/usuarios/vehiculos.json"));
        for(int i=0;i<arregloJson.size();i++){
            JSONObject elemento= (JSONObject) arregloJson.get(i);
            vehiculo vehiculo=new vehiculo(Integer.parseInt(elemento.get("Placa").toString()),
            Integer.parseInt(elemento.get("Año").toString()),elemento.get("Color").toString(),
            elemento.get("Marca").toString(),Integer.parseInt(elemento.get("Capacidad").toString()),
            Integer.parseInt(elemento.get("Kilómetros").toString()),Integer.parseInt(elemento.get("Número").
            toString()),elemento.get("Sede").toString(),elemento.get("Estado").toString());            
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

