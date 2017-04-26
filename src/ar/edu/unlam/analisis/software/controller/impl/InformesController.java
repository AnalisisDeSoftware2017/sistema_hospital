package ar.edu.unlam.analisis.software.controller.impl;

import ar.edu.unlam.analisis.software.controller.IController;
import ar.edu.unlam.analisis.software.utils.Menu;

/**
 * Created by sbogado on 4/26/17.
 */
public class InformesController implements IController{

    private static InformesController instance;
    private IController controllerAnterior;
    private Menu menu;

    private InformesController(IController controllerAnterior){
        this.controllerAnterior=controllerAnterior;
    }

    @Override
    public void runController() {
        //TODO:Desarrollar este metodo
        System.out.println("Esta corriendo el Informes controller");
    }
}
