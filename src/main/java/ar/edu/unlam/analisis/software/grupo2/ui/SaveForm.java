package ar.edu.unlam.analisis.software.grupo2.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.util.List;

public abstract class SaveForm<T extends AbmEntity> extends JFrame {

	private JPanel contentPane;
	
	private JButton btnGuardar;
	private JButton btnCancelar;
	
	protected AbstractFormCreate<T> form;


	/**
	 * Create the frame.
	 */

	public SaveForm(AbstractFormCreate<T> form) {	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 676);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel botoneraPane = new JPanel();
		botoneraPane.setBounds(39, 580, 769, 68);
		contentPane.add(botoneraPane);
		botoneraPane.setLayout(null);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(154, 19, 117, 29);
		botoneraPane.add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(498, 19, 117, 29);
		botoneraPane.add(btnCancelar);


		this.form = form;
		this.form.setBounds(39, 30, 769, 530);
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


}
