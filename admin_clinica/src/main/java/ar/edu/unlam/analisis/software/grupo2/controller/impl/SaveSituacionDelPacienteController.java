package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
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
public class SaveSituacionDelPacienteController extends AbstractEntitySaveController<SituacionDelPaciente, Long> {

    @Autowired
    public SaveSituacionDelPacienteController(AbstractServiceCRUD<SituacionDelPaciente, Long> service, AbstractContainerSaveForm<SituacionDelPaciente> form) {
        super(service, form);
    }


    @Override
    protected List<String> validateData(SituacionDelPaciente entidad) {
        List<String> errores = new ArrayList<>();
        //TODO
        return errores;
    }
}
