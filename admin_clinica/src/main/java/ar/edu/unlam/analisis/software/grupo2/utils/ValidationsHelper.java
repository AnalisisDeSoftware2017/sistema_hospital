package ar.edu.unlam.analisis.software.grupo2.utils;

import ar.edu.unlam.analisis.software.grupo2.core.model.TipoDocumentoEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by sbogado on 6/22/17.
 */
@Component
public class ValidationsHelper {

    private static final int LONG_NOMBRE = 40;
    private static final int LONG_APELLIDO = 40;
    private static final int LONG_CODIGO = 20;
    private static final int MIN_LONG_APELLIDO = 4;
    private static final int MIN_LONG_NOMBRE = 4;


    @Autowired
    private MessageSource messageSource;

    public List<String> validarNombrePersona(String nombre){
        List<String> errores = new ArrayList<>();
        if(null == nombre || nombre.isEmpty()){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.nombrePersona", null, AppContext.getLocale()));
        }else{
            if(nombre.length()>LONG_NOMBRE){
                errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.violation.max.length.nombrePersona",null, AppContext.getLocale()));
            }
            if(nombre.length()<MIN_LONG_NOMBRE){
                errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.violation.min.length.nombrePersona",null, AppContext.getLocale()));
            }
            if(!validarSiEsUnNombreDePersonaValido(nombre)){
                errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.violation.nombrePersona.format",null, AppContext.getLocale()));
            }
        }
        return errores;
    }


    public List<String> validarApellidoDePersona(String apellido){
        List<String> errores = new ArrayList<>();
        if(null == apellido|| apellido.isEmpty()){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.apellidoPersona",null,AppContext.getLocale()));
        }else{
            if(apellido.length()>LONG_APELLIDO){
                errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.violation.max.length.apellidoPersona",null, AppContext.getLocale()));
            }
            if(apellido.length()<MIN_LONG_APELLIDO){
                errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.violation.min.length.nombrePersona",null, AppContext.getLocale()));
            }
            if(!validarSiEsUnNombreDePersonaValido(apellido)){
                errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.violation.apellidoPersona.format",null, AppContext.getLocale()));
            }
        }
        return errores;
    }


    private boolean validarSiEsUnNombreDePersonaValido(String cadena) {
        return matchString("[A-Za-z\\u00C0-\\u00ff ]+$",cadena);
    }


    public List<String> validarCodigoPersona(String codigo){
        List<String> errores = new ArrayList<>();
        if(null == codigo || codigo.isEmpty()){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.codigoPersona",null,AppContext.getLocale()));
        }else{
            if(codigo.length()>LONG_CODIGO){
                errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.violation.max.length",null, AppContext.getLocale()));
            }
        }
        return errores;
    }

    public List<String> validarDocumentoPersona(String numeroDocumento, TipoDocumentoEnum tipoDocumentoEnum){
        List<String> errores = new ArrayList<>();
        if(null == numeroDocumento || numeroDocumento.isEmpty()){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.documentoPersona",null,AppContext.getLocale()));
        }else{
            if(!matchString(tipoDocumentoEnum.getRegex() , numeroDocumento)){
                errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.numeroDocumentoNoValido",null, AppContext.getLocale()));
            }
        }
        return errores;
    }

    private boolean matchString(String regex, String numeroDocumento) {
        return numeroDocumento.matches(regex);
    }

    public List<String> validateEspecialidad(String nombreEspecialidad) {

        List<String> errores  = new ArrayList<>();
        if(null == nombreEspecialidad || nombreEspecialidad.isEmpty() ){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.emptyEspecialidad",null, AppContext.getLocale()));
        }else{
            if(nombreEspecialidad.length()>40){
                errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.max.length.emptyEspecialidad",null, AppContext.getLocale()));
            }
        }
        return errores;
    }


}
