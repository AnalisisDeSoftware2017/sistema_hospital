package ar.edu.unlam.analisis.software.utils;

/**
 * Created by sbogado on 4/24/17.
 */
public class Menu {

    public Menu(String[] opciones, String separador) throws Exception {
        parseOpcionesSeparador(opciones,separador);
    }

    private void parseOpcionesSeparador(String [] opciones, String separador) throws Exception {
        this.options = new String[opciones.length];
        this.descripcionOpciones = new String[opciones.length];
        for (int i = 0 ; i< opciones.length ; i++) {
            String[] auxiliar  = opciones[i].split(separador);
            if(auxiliar.length!=2){
                throw new Exception();
            }
            this.options[i] = auxiliar[0];
            this.descripcionOpciones[i] = auxiliar[1];
        }
    }

    private String[] options;
    private String[] descripcionOpciones;


    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String[] getDescripcionOpciones() {
        return descripcionOpciones;
    }

    public void setDescripcionOpciones(String[] descripcionOpciones) {
        this.descripcionOpciones = descripcionOpciones;
    }
}
