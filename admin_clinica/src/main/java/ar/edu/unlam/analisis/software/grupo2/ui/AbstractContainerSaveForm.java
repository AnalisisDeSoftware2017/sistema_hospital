package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public abstract class AbstractContainerSaveForm<T extends AbmEntity> extends AbstractPantalla {

	private JPanel contentPane;
	
	private JButton btnGuardar;
	private JButton btnCancelar;
	
	protected AbstractFormCreate<T> form;
	private JPanel panel;
	
	/**
	 * Create the frame.
	 */

	public AbstractContainerSaveForm(AbstractFormCreate<T> form) {

		super();
		contentPane = this.setPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel botoneraPane = new JPanel();
		botoneraPane.setBackground(new Color(0,0,0,0));
		botoneraPane.setBounds(161, 573, 725, 68);
		contentPane.add(botoneraPane);
		botoneraPane.setLayout(null);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(116, 19, 117, 29);
		botoneraPane.add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(502, 19, 117, 29);
		botoneraPane.add(btnCancelar);
		
		this.form = form;
		this.form.setBounds(161, 0, 725, 570);
		contentPane.add(this.form);
	}


	public final void setEntity(T entity){
		this.form.setEntity(entity);
	}

	public final T getEntity(){
		return this.form.getEntity();
	}
	
	public JButton getBtnGuardar(){
		return this.btnGuardar;
	}
	
	public JButton getBtnCancelar(){
		return this.btnCancelar;
	}

	@Override
	public void setTexto() {
		// TODO Auto-generated method stub

	}

}
