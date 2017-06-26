package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractABMController;
import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.ui.ListScreenABM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 6/6/17.
 */
@Controller
public class ABMEspecialidadController extends AbstractABMController<Especialidad, Long> {

    @Autowired
    public ABMEspecialidadController(ListScreenABM<Especialidad> pantalla, AbstractEntitySaveController<Especialidad, Long> entitySaveController, AbstractServiceCRUD<Especialidad, Long> service) {
        super(pantalla, entitySaveController, service);
    }


    @Override
    protected void setTextoFrame() {

    }
}
