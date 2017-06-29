package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.UserService;
import ar.edu.unlam.analisis.software.grupo2.data.MedicoData;
import ar.edu.unlam.analisis.software.grupo2.data.PacienteData;
import ar.edu.unlam.analisis.software.grupo2.ui.InformesForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 5/17/17.
 */
@Controller
public class InformeController extends AbstractFrameController<InformesForm>{

    private AbstracttSearchReporteController<Medico, MedicoData> datosMedicosController;
    private AbstracttSearchReporteController<Paciente, PacienteData> datosPacienteController;

    private UserService userService;

    @Autowired
    public InformeController(InformesForm informesForm, UserService userService, AbstracttSearchReporteController<Medico, MedicoData> searchMedicoController, AbstracttSearchReporteController<Paciente, PacienteData> searchPacienteController) {
        this.frame = informesForm;
        this.userService = userService;
        this.datosMedicosController = searchMedicoController;
        this.datosPacienteController = searchPacienteController;
    }


    public void prepareAndOpenFrame() {
        frame.setVisible(true);
        registerClickAction(this.frame.getAnterior(), (event)->anterior());
        registerEnterKeyAction(this.frame.getAnterior(), ()->anterior());
        registerClickAction(this.frame.getBtnMedico(), (event) -> openMedicosController());
        registerEnterKeyAction(this.frame.getBtnMedico(), () -> openMedicosController());
        registerClickAction(this.frame.getBtnPaciente(), (event) -> openPacienteController());
        registerEnterKeyAction(this.frame.getBtnPaciente(), () -> openPacienteController());
    }

    private void openPacienteController() {
        this.frame.setVisible(false);
        this.datosPacienteController.setControllerAnterior(this);
        this.datosPacienteController.setVisible(true);
    }

    private void openMedicosController() {
        this.frame.setVisible(false);
        this.datosMedicosController.setControllerAnterior(this);
        this.datosMedicosController.setVisible(true);
    }

    private void anterior() {
        this.frame.setVisible(false);
        this.controllerAnterior.setVisible(true);
    }



}
