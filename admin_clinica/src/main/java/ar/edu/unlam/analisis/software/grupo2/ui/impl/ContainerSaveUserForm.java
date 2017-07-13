package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerSaveForm;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class ContainerSaveUserForm extends AbstractContainerSaveForm<User> {


    /**
     * Create the frame.
     *
     * @param form
     */
    @Autowired
    public ContainerSaveUserForm(AbstractFormCreate<User> form, MessageSource messageSource) {
        super(form, messageSource);
    }

}
