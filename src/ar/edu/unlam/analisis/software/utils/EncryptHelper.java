package ar.edu.unlam.analisis.software.utils;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
//import org.apache.commons.codec.binary.Base64;
 
public class EncryptHelper {
    static String secretKey = "Pacientes"; //llave para encriptar datos
 
    public static String Encriptar(String texto) {
        String base64EncryptedString = ""; 
        try {             
            MessageDigest md = MessageDigest.getInstance("MD5"); //Crea un hash con la clave elegida
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede"); //Crea la clave
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);//Inicializa el cifrado con la clave
            byte[] plainTextBytes = texto.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);//Cifra el texto
            //byte[] base64Bytes = Base64.encodeBase64(buf);//Encodea el texto en base64
            //base64EncryptedString = new String(base64Bytes); 
        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }
 
    public static String Desencriptar(String textoEncriptado){ 
        String base64EncryptedString = ""; 
        try {
            //byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));//Desencodea el texto en base64
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8")); //Crea un hash con la clave elegida
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");//Crea la clave 
            Cipher decipher = Cipher.getInstance("DESede");  
            decipher.init(Cipher.DECRYPT_MODE, key); //Inicia el descifrado
            //byte[] plainText = decipher.doFinal(message);//Descifra el texto
            //base64EncryptedString = new String(plainText, "UTF-8"); 
        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }
}