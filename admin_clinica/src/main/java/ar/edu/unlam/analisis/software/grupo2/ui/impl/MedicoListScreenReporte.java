package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenReporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MedicoListScreenReporte extends AbstractListScreenReporte<Medico> {


    /**
     * Create the frame.
     *
     * @param messageSource
     */
    @Autowired
    public MedicoListScreenReporte(MessageSource messageSource) {
        super(messageSource);
    }
}
