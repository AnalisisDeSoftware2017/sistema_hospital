package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import org.springframework.stereotype.Component;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class FormCreatePaciente extends AbstractFormCreate<Paciente>{

    @Override
    public Paciente getEntity() {
        return null;
    }

    @Override
    public void setEntity(Paciente entitys) {

    }
}
