import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json{
    static void leerJSON() throws FileNotFoundException, IOException, ParseException{
        JSONParser parser=new JSONParser();
        JSONArray arregloJson= (JSONArray) parser.parse(new FileReader("Ubicacion de archivo"));
        
        for(int i=0;i<arregloJson.size();i++){
            JSONObject elemento= (JSONObject) arregloJson.get(i);
            System.out.println(elemento.get("tipo"));
            System.out.println(elemento.get("nombre"));        
        }    
    }
}

