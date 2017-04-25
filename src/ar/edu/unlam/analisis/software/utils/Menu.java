package ar.edu.unlam.analisis.software.utils;

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

    public void imprimirMenu(){
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


    public void imprimirOpciones(){
        //TODO: calcular la cantidad de caracteres que hay y agregarle espacios;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < this.cantidadOpciones ; i++){
            System.out.println(sb.append(this.options[i]).append(this.separador).append(this.descripcionOpciones[i]));
        }
    }

    //TODO: write this method and return a valid option
    public String getOption(){
        return null;
    }

    private Boolean validateOption(String option){
        return false;
    }

}
