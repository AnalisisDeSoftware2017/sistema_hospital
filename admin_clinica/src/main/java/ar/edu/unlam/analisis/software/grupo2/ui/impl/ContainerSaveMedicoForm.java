package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerSaveForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class ContainerSaveMedicoForm extends AbstractContainerSaveForm<Medico> {


    public void  setEspecialidadList(List<Especialidad> especialidades){
        ((FormCreateMedico)this.form).setEspecialidadList(especialidades);
    }

    /**
     * Create the frame.
     *
     * @param form
     */
    @Autowired
    public ContainerSaveMedicoForm(AbstractFormCreate<Medico> form, MessageSource messageSource) {
        super(form, messageSource);
    }

}
