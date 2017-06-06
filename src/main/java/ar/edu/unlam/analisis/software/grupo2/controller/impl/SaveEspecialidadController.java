package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.ui.SaveForm;

import java.util.List;

/**
 * Created by sbogado on 6/6/17.
 */
public class SaveEspecialidadController extends AbstractEntitySaveController<Paciente,Long> {


    public SaveEspecialidadController(AbstractServiceCRUD<Paciente, Long> service, SaveForm<Paciente> form) {
        super(service, form);
    }

    @Override
    protected void setTextoFrame() {

    }


    @Override
    protected List<String> validateData() {
        return null;
    }
}
