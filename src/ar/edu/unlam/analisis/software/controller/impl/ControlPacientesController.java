package ar.edu.unlam.analisis.software.controller.impl;

import ar.edu.unlam.analisis.software.controller.IController;

/**
 * Created by sbogado on 4/25/17.
 */
public class ControlPacientesController implements IController {

    private IController controllerAnterior;
    private static ControlPacientesController instance;

    private final static String[] MENU={"1-  Ingreso de datos", "2-  Informes", "3-  Salir"};
    private final static String[] ENCABEZADO =
            {
                    "   ..............................................",
                    "   :-:        C E N T R O  M E D I C O        :-:",
                    "   :-:   >>>> L O S  L A U R E L E S <<<<     :-:",
                    "   :-:  C O N T R O L  D E  P A C I E N T E S :-:",
                    "   :-:........................................:-:"};
    private final static String DECORADOR_LINEA = ":-:";
    private final static String [] PIE ={"   .............................................."};
    private final static String DECORADOR_OPCIONES= "   :-:";


    private ControlPacientesController(IController controllerAnterior) {
        this.controllerAnterior = controllerAnterior;
    }


    public static ControlPacientesController getInstance(IController controllerAnterior){
        if(instance==null){
            instance= new ControlPacientesController(controllerAnterior);
        }
        return instance;
    }

    @Override
    public void runController() {
        System.out.println("Corre el control pacientes controller");
    }
}
