package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerSaveForm;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class ContainerSaveEspecialidadForm extends AbstractContainerSaveForm<Especialidad> {
	

	@Autowired
    public ContainerSaveEspecialidadForm(AbstractFormCreate<Especialidad> form) {
		super(form);
	}

}
