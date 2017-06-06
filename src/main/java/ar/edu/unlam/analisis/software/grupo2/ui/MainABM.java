package ar.edu.unlam.analisis.software.grupo2.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.stereotype.Component;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;

import ar.edu.unlam.analisis.software.grupo2.core.model.Persona;
import ar.edu.unlam.analisis.software.grupo2.ui.customComponents.JListCustom;


import javax.swing.JButton;

public abstract class MainABM<T extends AbmEntity> extends JFrame {

	private JPanel contentPane;
	private  JListCustom<T> listEntity;
	private JButton btnEliminar;
	private JButton btnEditar;
	private JButton btnCrear;

	/**
	 * Create the frame.
	 */
	public MainABM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 63, 809, 517);
		contentPane.add(panel);
		panel.setLayout(null);
		
		listEntity = new JListCustom<T>();
		listEntity.setBounds(6, 507, 585, -503);
		panel.add(listEntity);
		
		btnCrear = new JButton("Crear");
		btnCrear.setBounds(654, 74, 117, 29);
		panel.add(btnCrear);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(654, 204, 117, 29);
		panel.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(654, 355, 117, 29);
		panel.add(btnEliminar);
	}
	
	
	public T getSelectedItem(){
		return this.listEntity.getSelectedElement();
	}
	
	public JButton getBtnEliminar(){
		return this.btnEliminar;
	}
	
	public JButton getBtnEditar(){
		return this.btnEditar;
	}
	public JButton getBtnCrear(){
		return this.btnCrear;
	}
	
	
	
}
