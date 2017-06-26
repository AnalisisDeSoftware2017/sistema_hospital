package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerSaveForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sbogado on 6/6/17.
 */
@Controller
public class SaveEspecialidadController extends AbstractEntitySaveController<Especialidad,Long> {

    @Autowired
    public SaveEspecialidadController(AbstractServiceCRUD<Especialidad, Long> service, AbstractContainerSaveForm<Especialidad> form) {
        super(service, form);
    }

    @Override
    protected void setTextoFrame() {

    }


    @Override
    protected List<String> validateData(Especialidad entidad) {
        List<String> errores = new ArrayList<>();
        entidad.setNombreEspecialidad(entidad.getNombreEspecialidad().trim());
        errores.addAll(this.validationsHelper.validateEspecialidad(entidad.getNombreEspecialidad()));
        return errores;
    }
}
