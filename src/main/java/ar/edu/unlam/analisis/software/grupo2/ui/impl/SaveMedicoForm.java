package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import ar.edu.unlam.analisis.software.grupo2.ui.SaveForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class SaveMedicoForm extends SaveForm<Medico> {


    /**
     * Create the frame.
     *
     * @param form
     */
    @Autowired
    public SaveMedicoForm(AbstractFormCreate<Medico> form) {
        super(form);
    }

}
