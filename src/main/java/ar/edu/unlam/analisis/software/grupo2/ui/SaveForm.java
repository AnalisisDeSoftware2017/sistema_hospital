package ar.edu.unlam.analisis.software.grupo2.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;
import javax.swing.JButton;

public abstract class SaveForm<T extends AbmEntity> extends JFrame {

	private JPanel contentPane;
	
	private JButton btnGuardar;
	private JButton btnCancelar;
	protected T entity;
	
	private AbstractFormCreate<T> form;
	private JPanel panel;
	
	/**
	 * Create the frame.
	 */

	public SaveForm(AbstractFormCreate<T> form) {
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel botoneraPane = new JPanel();
		botoneraPane.setBounds(111, 488, 725, 68);
		contentPane.add(botoneraPane);
		botoneraPane.setLayout(null);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(116, 19, 117, 29);
		botoneraPane.add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(404, 19, 117, 29);
		botoneraPane.add(btnCancelar);
		
		this.form = form;
		this.form.setBounds(111, 21, 725, 434);
		contentPane.add(this.form);
	}


	public abstract void setEntity(T entity);

	public abstract T getEntity();
	
	public JButton getBtnGuardar(){
		return this.btnGuardar;
	}
	
	public JButton getBtnCancelar(){
		return this.btnCancelar;
	}

}
