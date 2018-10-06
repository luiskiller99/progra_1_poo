import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;

public class RandomString {

    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz~!#$%&/@¿?^";
    static SecureRandom rnd = new SecureRandom();
    static int cont=0;
    public static String randomString( int len ){
       StringBuilder sb = new StringBuilder( len );
       for( int i = 0; i < len; i++ ) 
          sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
       
       String respaldo=sb.toString();
       //System.out.print("hola "+respaldo+"\n");
       for(char c:respaldo.toCharArray()){
           if (c==33||c==34||c==35||c==36||
           c==37||c==38||c==47||c==63||
           c==64||c==94||c==126||c==168){
               cont++;
            }           
        }
       
       if(cont==0)
       return randomString(len);       
       
       return sb.toString();
    }
    
    public static String encrypt(String strClearText,String strKey) throws Exception{
	String strData="";
	
	try {
		SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
		Cipher cipher=Cipher.getInstance("Blowfish");
		cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
		byte[] encrypted=cipher.doFinal(strClearText.getBytes());
		strData=new String(encrypted);
		
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception(e);
	}
	return strData;
}
    
        
    
    public static void main(String args[])throws Exception{
        RandomString prueba=new RandomString();        
        int num=new Random().nextInt(5)+8; 
        String hola=prueba.randomString(num);
        String prueba2=prueba.encrypt(hola, "1");
        System.out.print(hola+"\n");
        System.out.print(prueba2);
    }
}
    