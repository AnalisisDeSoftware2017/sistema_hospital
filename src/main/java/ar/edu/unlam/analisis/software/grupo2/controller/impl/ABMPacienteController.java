package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractABMController;
import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFirstScreenABM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 6/6/17.
 */
@Controller
public class ABMPacienteController extends AbstractABMController<Paciente, Long> {


    @Autowired
    public ABMPacienteController(AbstractFirstScreenABM<Paciente> pantalla, AbstractEntitySaveController<Paciente, Long> entitySaveController, AbstractServiceCRUD<Paciente, Long> service) {
        super(pantalla, entitySaveController,service);
    }
}
