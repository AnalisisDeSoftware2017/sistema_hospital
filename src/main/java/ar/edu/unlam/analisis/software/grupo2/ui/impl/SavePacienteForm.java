package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import ar.edu.unlam.analisis.software.grupo2.ui.SaveForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class SavePacienteForm extends SaveForm<Paciente> {


    /**
     * Create the frame.
     *
     * @param form
     */
    @Autowired
    public SavePacienteForm(AbstractFormCreate<Paciente> form) {
        super(form);
    }

    @Override
    public void setEntity(Paciente entity) {
        this.entity = entity;
    }

    @Override
    public Paciente getEntity() {
        return null;
    }
}
