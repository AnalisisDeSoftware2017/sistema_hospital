package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractABMController;
import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.ui.MainABM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 6/6/17.
 */
@Controller
public class ABMMedicoController extends AbstractABMController<Medico, Long> {


    @Autowired
    public ABMMedicoController(MainABM<Medico> pantalla, AbstractEntitySaveController<Medico, Long> entitySaveController, AbstractServiceCRUD<Medico, Long> service) {
        super(pantalla, entitySaveController,service);
    }


    @Override
    protected void setTextoFrame() {

    }
}
