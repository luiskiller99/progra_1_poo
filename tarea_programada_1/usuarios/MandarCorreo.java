package tarea_programada_1.usuarios;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
/**
 * @author Crunchify.com
 * 
 */
 
public class MandarCorreo {
 
    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;
    private String correo;
 
    /*public static void main(String args[]) throws AddressException, MessagingException {
        generateAndSendEmail();
        System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
    }*/
    
    public void setcorreo(String pcorreo){
        correo=pcorreo;
    }
 
    public void generateAndSendEmail(String pcorreo) {
        this.setcorreo(pcorreo);
        // Step1
        System.out.println("\n 1st ===> setup Mail Server Properties..");
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");
        System.out.println("Mail Server Properties have been setup successfully..");
 
        // Step2
        try{
        System.out.println("\n\n 2nd ===> get Mail Session..");
        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
        generateMailMessage = new MimeMessage(getMailSession);
        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
        //generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("test2@crunchify.com"));
        generateMailMessage.setSubject("Información del viaje");
        String emailBody = "Se ha aceptado el viaje, la información completa estára en el pdf adjunto " + "<br><br> Saludos, <br>Admin";    
        generateMailMessage.setContent(emailBody, "text/html");
        generateMailMessage.setFileName("InfoViajes.pdf");
        
        System.out.println("Mail Session has been created successfully..");
 
        // Step3
        System.out.println("\n\n 3rd ===> Get Session and Send mail");
        Transport transport = getMailSession.getTransport("smtp");
        //https://myaccount.google.com/lesssecureapps Meterse a esa pagina para poder usar programas de terceros como este.
        // Enter your correct gmail UserID and Password
        // if you have 2FA enabled then provide App Specific Password
        transport.connect("smtp.gmail.com", "Gmail ID", "----password-----"); // Donde dice Gmail ID ingresan su correo, y en password, su contraseña, debe tener el correo abierto.
        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
        transport.close();
    }
    catch(AddressException e){
        System.out.print(e);
    }
    catch(MessagingException e){
        System.out.print(e);
    }
   
    
    }
}