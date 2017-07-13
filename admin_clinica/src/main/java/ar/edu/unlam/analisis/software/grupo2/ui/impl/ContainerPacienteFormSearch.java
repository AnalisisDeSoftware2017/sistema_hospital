package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.data.PacienteData;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerPersonaFormSearch;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractPersonaFormSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

/**
 * Created by sbogado on 6/28/17.
 */
@Component
public class ContainerPacienteFormSearch extends AbstractContainerPersonaFormSearch<Paciente, PacienteData> {


    @Autowired
    public ContainerPacienteFormSearch(AbstractPersonaFormSearch<Paciente, PacienteData> form,MessageSource messageSource) {

        super(form, messageSource);
    }


}
