package tarea_programada_1.usuarios;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot{
    @Override
    public void onUpdateReceived(Update update){
        System.out.println(update.getMessage().getFrom().getFirstName()+": "+update.getMessage()
        .getText());
        
        SendMessage sendMessage=new SendMessage().setChatId(update.getMessage().getChatId());
        String mensaje=update.getMessage().getText();
        System.out.print(mensaje);
        if (mensaje.equals("!validarviaje"))
        sendMessage.setText("El viaje ha sido aceptado, ¡que disfrute su estadía!");
        else if (mensaje.equals("!cancelarviaje"))
        sendMessage.setText("Lo sentimos, pero el viaje ha sido cancelado.");
        else
        sendMessage.setText("Comando no reconocido.");
        
        try {
            sendMessage(sendMessage);
        }
        catch(TelegramApiException e){
            e.printStackTrace();
        }        
    }
    
    @Override
    public String getBotUsername(){
        return "Prograpoo1bot";
    }
    
    @Override
    public String getBotToken(){
        return "689327470:AAFkoSKw1NF5ZDHrwbpETfC3D3FWdHIdXYw";
    }    
}
