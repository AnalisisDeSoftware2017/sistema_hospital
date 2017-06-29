package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.ui.MainForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 5/17/17.
 */
@Controller
public class MainMenuController extends AbstractFrameController<MainForm> {

    private IngresosController ingresosController;
    private InformeController informeController;
    private AbstractFrameController controllerAnterior;

    @Autowired
    public MainMenuController(MainForm mainForm, IngresosController ingresosController, InformeController informeController){
        this.frame = mainForm;
        this.ingresosController = ingresosController;
        this.ingresosController.setControllerAnterior(this);
        this.informeController  = informeController;
        this.informeController.setControllerAnterior(this);

    }

    @Override
    public void prepareAndOpenFrame() {
        this.registerClickAction(frame.getInformes(), (e)->dibujarInformes());
        this.registerClickAction(frame.getIngreso(), (e)->dibujarIngreso());
        this.registerClickAction(frame.getSalir(),(e)-> salir());
        this.registerEnterKeyAction(frame.getInformes(),()->dibujarInformes());
        this.registerEnterKeyAction(frame.getIngreso(),()->dibujarIngreso());
        this.registerEnterKeyAction(frame.getSalir(), ()->salir());
        frame.setVisible(true);
    }


    private void dibujarIngreso() {
        this.setVisible(false);
        ingresosController.setControllerAnterior(this);
        ingresosController.setVisible(true);
    }

    private void dibujarInformes() {
        this.setVisible(false);
        informeController.setControllerAnterior(this);
        informeController.setVisible(true);
    }
}
