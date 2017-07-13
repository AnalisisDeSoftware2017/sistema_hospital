package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenABM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class ListScreenMedicoABM extends AbstractListScreenABM<Medico> {

    /**
     * Create the frame.
     *
     * @param messageSource
     */
    @Autowired
    public ListScreenMedicoABM(MessageSource messageSource) {
        super(messageSource);
    }
}
