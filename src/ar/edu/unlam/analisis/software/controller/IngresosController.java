package ar.edu.unlam.analisis.software.controller;

/**
 * Created by sbogado on 4/25/17.
 */
public class IngresosController implements IController {

    private IController controllerAnterior;
    private IngresosController instance;

    private IngresosController(IController controllerAnterior){
        this.controllerAnterior = controllerAnterior;
    }

    public IngresosController getInstance(IController controllerAnterior){
        if(instance == null){
            instance = new IngresosController(controllerAnterior);
        }
        return instance;
    }

    @Override
    public void runController() {

    }


}
