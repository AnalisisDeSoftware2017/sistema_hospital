package ar.edu.unlam.analisis.software.controller;

/**
 * Created by sbogado on 4/25/17.
 */
public class ControlPacientesController implements IController {

    private IController controllerAnterior;


    @Override
    public void runController(IController controllerAnterior) {
        this.controllerAnterior = controllerAnterior;
    }
}
