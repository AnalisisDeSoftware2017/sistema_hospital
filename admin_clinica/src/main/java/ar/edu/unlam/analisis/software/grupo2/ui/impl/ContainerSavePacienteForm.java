package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerSaveForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class ContainerSavePacienteForm extends AbstractContainerSaveForm<Paciente> {


    /**
     * Create the frame.
     *
     * @param form
     */
    @Autowired
    public ContainerSavePacienteForm(AbstractFormCreate<Paciente> form, MessageSource messageSource) {
        super(form,messageSource);
    }

}
