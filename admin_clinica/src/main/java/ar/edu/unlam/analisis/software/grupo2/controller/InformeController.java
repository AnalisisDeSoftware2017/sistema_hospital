package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.services.impl.UserService;
import ar.edu.unlam.analisis.software.grupo2.ui.InformesForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 5/17/17.
 */
@Controller
public class InformeController extends AbstractFrameController<InformesForm>{

    private DatosMedicosController datosMedicosController;
    private DatosPacienteController datosPacienteController;

    private UserService userService;

    @Autowired
    public InformeController(InformesForm informesForm, UserService userService, DatosMedicosController datosMedicosController, DatosPacienteController datosPacienteController){
        this.frame = informesForm;
        this.userService = userService;
        this.datosMedicosController=datosMedicosController;
        this.datosPacienteController=datosPacienteController;
    }

    public void prepareAndOpenFrame() {
        frame.setVisible(true);
        registerClickAction(this.frame.getAnterior(), (event)->anterior());
        registerEnterKeyAction(this.frame.getAnterior(), ()->anterior());
        registerClickAction(this.frame.getEnfermedadesBtn(),(event)->enfermedades());
        registerEnterKeyAction(this.frame.getEnfermedadesBtn(),()->enfermedades());
        registerClickAction(this.frame.getListaddoPacXMedBtn(),(event)->listadoPacientesMedico());
        registerEnterKeyAction(this.frame.getListaddoPacXMedBtn(),()->listadoPacientesMedico());
    }

    private void listadoPacientesMedico() {
        this.frame.setVisible(false);
        this.datosPacienteController.setControllerAnterior(this);
        this.datosPacienteController.setVisible(true);
    }

    private void enfermedades() {
        this.frame.setVisible(false);
        this.datosMedicosController.setControllerAnterior(this);
        this.datosMedicosController.setVisible(true);
    }

    private void anterior() {
        this.frame.setVisible(false);
        this.controllerAnterior.setVisible(true);
    }

    @Override
    protected void setTextoFrame() {

    }



}
