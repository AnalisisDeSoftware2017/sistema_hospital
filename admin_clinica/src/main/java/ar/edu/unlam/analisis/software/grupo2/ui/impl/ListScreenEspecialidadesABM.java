package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenABM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class ListScreenEspecialidadesABM extends AbstractListScreenABM<Especialidad> {

    /**
     * Create the frame.
     *
     * @param messageSource
     */
    @Autowired
    public ListScreenEspecialidadesABM(MessageSource messageSource) {
        super(messageSource);
    }
}
