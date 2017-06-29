package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.controller.impl.ABMEspecialidadController;
import ar.edu.unlam.analisis.software.grupo2.controller.impl.ABMMedicoController;
import ar.edu.unlam.analisis.software.grupo2.controller.impl.ABMPacienteController;
import ar.edu.unlam.analisis.software.grupo2.controller.impl.ABMUserController;
import ar.edu.unlam.analisis.software.grupo2.ui.IngresoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 5/17/17.
 */
@Controller
public class IngresosController extends AbstractFrameController<IngresoForm>{


    private final ABMEspecialidadController especialidadController;
    private final ABMMedicoController medicoController;
    private final ABMPacienteController pacienteController;
    private final ABMUserController userController;

    @Autowired
    public IngresosController(IngresoForm ingresoForm, ABMMedicoController abmMedicoController, ABMEspecialidadController especialidadController, ABMPacienteController pacienteController, ABMUserController userController) {
        this.frame= ingresoForm;
        this.medicoController=abmMedicoController;
        this.especialidadController=especialidadController;
        this.pacienteController=pacienteController;
        this.userController = userController;
    }

    @Override
    public void prepareAndOpenFrame() {
        registerClickAction(frame.getAnterior(), (event)->anterior());
        registerEnterKeyAction(frame.getAnterior(), ()->anterior());
        registerClickAction(frame.getBtnABMMedico(), (event)->abrirMedico());
        registerEnterKeyAction(frame.getBtnABMMedico(), ()->abrirMedico());
        registerClickAction(frame.getBtnAbmEnfermedades(), (event)->abrirEnfermedades());
        registerEnterKeyAction(frame.getBtnAbmEnfermedades(), ()->abrirEnfermedades());
        registerClickAction(frame.getBtnABMPaciente(), (event)->abrirPaciente());
        registerEnterKeyAction(frame.getBtnABMPaciente(), ()->abrirPaciente());
        registerClickAction(frame.getBtnAbmUsuarios(), (event) -> abrirUsuarios());
        registerEnterKeyAction(frame.getBtnAbmUsuarios(), () -> abrirUsuarios());

        this.frame.setVisible(true);
    }

    private void abrirPaciente() {
        this.frame.setVisible(false);
        this.pacienteController.setControllerAnterior(this);
        this.pacienteController.setVisible(true);
    }

    private void abrirMedico() {
        this.frame.setVisible(false);
        this.medicoController.setControllerAnterior(this);
        this.medicoController.setVisible(true);
    }

    private void abrirEnfermedades() {
        this.frame.setVisible(false);
        this.especialidadController.setControllerAnterior(this);
        this.especialidadController.setVisible(true);
    }

    private void anterior() {
        this.frame.setVisible(false);
        this.controllerAnterior.setVisible(true);
    }


    public void abrirUsuarios() {
        this.frame.setVisible(false);
        this.userController.setControllerAnterior(this);
        this.userController.setVisible(true);
    }






}
