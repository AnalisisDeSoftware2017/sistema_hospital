package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenABM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class ListScreenSituacionDelPacienteABM extends AbstractListScreenABM<SituacionDelPaciente> {

    /**
     * Create the frame.
     *
     * @param messageSource
     */
    @Autowired
    public ListScreenSituacionDelPacienteABM(MessageSource messageSource) {
        super(messageSource);
    }
}
