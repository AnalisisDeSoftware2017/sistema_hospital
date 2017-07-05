package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractABMController;
import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenABM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 6/6/17.
 */
@Controller
public class ABMSituacionDelPacienteController extends AbstractABMController<SituacionDelPaciente, Long> {

    @Autowired
    public ABMSituacionDelPacienteController(AbstractListScreenABM<SituacionDelPaciente> pantalla, AbstractEntitySaveController<SituacionDelPaciente, Long> entitySaveController, AbstractServiceCRUD<SituacionDelPaciente, Long> service) {
        super(pantalla, entitySaveController, service);
    }


}
