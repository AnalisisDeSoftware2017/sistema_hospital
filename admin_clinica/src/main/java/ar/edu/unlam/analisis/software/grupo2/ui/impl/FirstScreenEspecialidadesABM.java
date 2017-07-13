package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFirstScreenABM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class FirstScreenEspecialidadesABM extends AbstractFirstScreenABM<Especialidad> {

    /**
     * Create the frame.
     *
     * @param messageSource
     */
    @Autowired
    public FirstScreenEspecialidadesABM(MessageSource messageSource) {
        super(messageSource);
    }
}
