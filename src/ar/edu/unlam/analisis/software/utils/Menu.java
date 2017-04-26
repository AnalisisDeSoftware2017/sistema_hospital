package ar.edu.unlam.analisis.software.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sbogado on 4/24/17.
 */
public class Menu {


    private String separador;
    private String[] options;
    private String[] cabezera;
    private String[] pie;
    private String decorador;
    private String decoradorOpcion;
    private String[] descripcionOpciones;
    private Integer cantidadOpciones;

    public Menu(String [] opciones, String[] cabezera, String [] pie, String decorador, String decoradorOpcion, String separador) throws Exception {
        parseOpcionesSeparador(opciones,cabezera, pie, decorador, decoradorOpcion,separador);
    }

    private void parseOpcionesSeparador(String [] opciones, String[] cabezera, String [] pie, String decorador, String decoradorOpcion, String separador) throws Exception {
        this.separador = separador;
        this.cabezera = cabezera;
        this.cantidadOpciones = opciones.length;
        this.options = new String[opciones.length];
        this.descripcionOpciones = new String[opciones.length];
        this.decorador =decorador;
        this.decoradorOpcion=decoradorOpcion;
        this.pie = pie;

        for (int i = 0 ; i< opciones.length ; i++) {
            String[] auxiliar  = opciones[i].split(separador);
            if(auxiliar.length!=2){
                throw new Exception();
            }
            this.options[i] = auxiliar[0];
            this.descripcionOpciones[i] = auxiliar[1];
        }
    }


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

    private void imprimirMenu(){
        imprimirCabezera();
        imprimirOpciones();
        imprimirPie();
        StringBuilder sb = new StringBuilder();
        System.out.println("   ....Elija la opcion deseada: ");
    }

    private void imprimirCabezera(){
        for(int  i = 0 ; i< this.cabezera.length ; i++){
            System.out.println(this.cabezera[i]);
        }
    }

    private void imprimirPie(){
        for(int  i = 0 ; i< this.pie.length ; i++){
            System.out.println(this.pie[i]);
        }
    }


    private void imprimirOpciones(){
        //TODO: calcular la cantidad de caracteres que hay y agregarle espacios;
        String auxSeparador = this.separador;
        auxSeparador.replace('\\',' ');
        for(int i = 0 ; i < this.cantidadOpciones ; i++){
            System.out.println(this.options[i]+auxSeparador+this.descripcionOpciones[i]);
        }
    }

    private Boolean validateOption(String option){
        for(String opt : this.options) {
            if (opt.equals(option)) {
                return true;
            }
        }
        return false;
    }

    public String getOptionFromMenu() throws IOException {
        String option ="";
        Boolean isValid= false;
        do{
            imprimirMenu();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            option = br.readLine();
            isValid = validateOption(option);
            if(!isValid) {
                imprimirIsNoValid();
            }
        }while(!isValid);
        return option;
    }

    private void imprimirIsNoValid() {
        System.out.println("Debe digitar una opcion del menu\n\n\n\n\n");
    }
}
