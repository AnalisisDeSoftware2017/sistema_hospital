package ar.edu.unlam.analisis.software.grupo2.utils;

import java.util.Locale;

/**
 * Created by sbogado on 5/9/17.
 */

public class AppContext {

    private static final Locale SPANISH_SPAIN = new Locale.Builder().setLanguage("es").setRegion("ES").build();


    public static Locale getLocale(){
        return SPANISH_SPAIN;
    }



}
