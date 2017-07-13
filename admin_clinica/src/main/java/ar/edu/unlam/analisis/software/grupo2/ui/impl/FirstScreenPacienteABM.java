package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFirstScreenABM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class FirstScreenPacienteABM extends AbstractFirstScreenABM<Paciente> {

    /**
     * Create the frame.
     *
     * @param messageSource
     */
    @Autowired
    public FirstScreenPacienteABM(MessageSource messageSource) {
        super(messageSource);
    }
}
