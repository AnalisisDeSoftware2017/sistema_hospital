package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class FormCreateEspecialidad extends AbstractFormCreate<Especialidad> {
	private JTextField txtEspecialidad;
	@Autowired
	public FormCreateEspecialidad(MessageSource messageSource) {
		super(messageSource);
		setLayout(null);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setBounds(219, 150, 297, 26);
		add(txtEspecialidad);
		txtEspecialidad.setColumns(10);
		
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setBounds(219, 128, 100, 16);
		add(lblEspecialidad);
	}

    @Override
    public Especialidad getEntity() {
        this.entity.setNombreEspecialidad(this.txtEspecialidad.getText());
		return entity;
    }

    @Override
    public void setEntity(Especialidad entitys) {
		this.entity = entitys == null ? new Especialidad():entitys;
		this.txtEspecialidad.setText(entity.getNombreEspecialidad());
    }

    @Override
    public void setTexto() {

    }
}
