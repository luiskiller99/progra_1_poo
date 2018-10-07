package tarea_programada_1.usuarios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CrearPDF{
   private String chofer;
   private String viaje;
   private String viajeros;
   public void setchofer(String pchofer){
       chofer=pchofer;
    }
    
   public void setviaje(String pviaje){
       viaje=pviaje;
    }
    
    public void setviajeros(String pviajeros){
        viajeros=pviajeros;
    }
   public void genPDF(String pchofer, String pviaje, String pviajeros)
   {
      setchofer(pchofer);
      setviaje(pviaje);
      setviajeros(pviajeros);
      Document document = new Document();
      try
      {
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("InfoViajes.pdf"));
         document.open();
         document.add(new Paragraph(chofer+"\n"));
         document.add(new Paragraph(viaje+"\n"));
         document.add(new Paragraph(viajeros+"\n"));
         document.close();
         writer.close();
      } catch (DocumentException e)
      {
         e.printStackTrace();
      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
   }
   
   
}
