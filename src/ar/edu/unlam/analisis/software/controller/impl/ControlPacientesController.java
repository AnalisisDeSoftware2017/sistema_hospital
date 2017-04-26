package ar.edu.unlam.analisis.software.controller.impl;

import ar.edu.unlam.analisis.software.controller.IController;

/**
 * Created by sbogado on 4/25/17.
 */
public class ControlPacientesController implements IController {

    private IController controllerAnterior;
    private static ControlPacientesController instance;

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
