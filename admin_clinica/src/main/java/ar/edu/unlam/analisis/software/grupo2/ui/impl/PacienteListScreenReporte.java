package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenReporte;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class PacienteListScreenReporte extends AbstractListScreenReporte<Paciente> {
	public PacienteListScreenReporte(MessageSource messageSource) {
		super(messageSource);
	}

}
