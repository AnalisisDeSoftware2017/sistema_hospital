package ar.edu.unlam.analisis.software.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by sbogado on 4/26/17.
 */
public class AppUtils {

    public static String LeerCadena(){
        String linea= new String("");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            linea = br.readLine();
        }catch(Exception e){ e.printStackTrace();}
        double ne=0;
        return(linea);
    }
}
