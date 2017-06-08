package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.ui.SaveForm;
import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by sbogado on 6/6/17.
 */
@Controller
public class SaveEspecialidadController extends AbstractEntitySaveController<Especialidad,Long> {

    @Autowired
    public SaveEspecialidadController(AbstractServiceCRUD<Especialidad, Long> service, SaveForm<Especialidad> form) {
        super(service, form);
    }

    @Override
    protected void setTextoFrame() {

    }


    @Override
    protected List<String> validateData(Especialidad entidad) {
        List<String> errores = new ArrayList<>();
        if(entidad==null || entidad.getName().isEmpty()){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.emptyEspecialidad",null, AppContext.getLocale()));
        }
        return errores;
    }
}
