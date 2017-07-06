package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerSaveForm;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class ContainerSaveSituacionDelPacienteForm extends AbstractContainerSaveForm<SituacionDelPaciente> {


    /**
     * Create the frame.
     *
     * @param form
     */
    @Autowired
    public ContainerSaveSituacionDelPacienteForm(AbstractFormCreate<SituacionDelPaciente> form) {
        super(form);
    }


    public void setMedicoList(List<Medico> medicoList) {
        ((FormCreateSituacionDelPaciente) this.form).setMedicoList(medicoList);
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        ((FormCreateSituacionDelPaciente) this.form).setPacienteList(pacienteList);
    }


}
