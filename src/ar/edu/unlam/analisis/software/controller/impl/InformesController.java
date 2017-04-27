package ar.edu.unlam.analisis.software.controller.impl;

import ar.edu.unlam.analisis.software.controller.IController;
import ar.edu.unlam.analisis.software.utils.Menu;

import java.io.IOException;

/**
 * Created by sbogado on 4/26/17.
 */
public class InformesController implements IController{

    private static InformesController instance;
    private IController controllerAnterior;

    private final static String[] MENU={"1. Listado de pacientes por medico", "2. Enfermedades que atiende cada medico ", "3. Anterior"};
    private final static String[] ENCABEZADO =
                                                {
                                                "...............................................",
                                                "   :-:  C O N T R O L  D E  P A C I E N T E S  :-:",
                                                "   ...............................................",
                                                "   :-:           - I N F O R M E S -           :-:",
                                                "   :-:.........................................:-:"};
    private final static String DECORADOR_LINEA = ":-:";
    private final static String [] PIE ={"   .............................................."};
    private final static String DECORADOR_OPCIONES= "   :-:";



    private Menu menu;

    private InformesController(IController controllerAnterior) throws Exception {
        this.controllerAnterior=controllerAnterior;
        this.menu = new Menu(MENU,ENCABEZADO,PIE,DECORADOR_LINEA, DECORADOR_OPCIONES, "\\." );
    }

    public static InformesController getInstance(IController controllerAnterior) throws Exception {
        if(instance==null){
            instance = new InformesController(controllerAnterior);
        }
        return instance;
    }



    @Override
    public void runController() throws Exception {
        String opcion = this.menu.getOptionFromMenu();
        switch (opcion){
            case "1":  consultarPacientesDeMedico(); break;
            case "2":  consultarEspecialidadesDelMedico();break;
            case "3":  irPantallaAnterior(); break;
        }
    }

    private void irPantallaAnterior() throws Exception {
        this.controllerAnterior.runController();
    }

    private void consultarEspecialidadesDelMedico() {

    }

    private void consultarPacientesDeMedico() {

    }
}
