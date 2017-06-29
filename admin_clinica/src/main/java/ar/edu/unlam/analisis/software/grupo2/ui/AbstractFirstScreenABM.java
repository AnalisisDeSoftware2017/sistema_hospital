package ar.edu.unlam.analisis.software.grupo2.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;

import ar.edu.unlam.analisis.software.grupo2.ui.customComponents.JListCustom;


import java.util.List;

public abstract class AbstractFirstScreenABM<T extends AbmEntity> extends JFrame {

	private JPanel contentPane;
	private  JListCustom<T> listEntity;
	private JButton btnEliminar;
	private JButton btnEditar;
	private JButton btnCrear;
	private JButton btnAnterior;

	/**
	 * Create the frame.
	 */
	public AbstractFirstScreenABM() {
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

		listEntity = new JListCustom<>();
		listEntity.setBounds(6, 4, 585, 507);
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
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(654, 444, 117, 29);
		panel.add(btnAnterior);
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


	public void cargarLista(List<T> lista) {
		listEntity.cleanAndAddAll(lista);
	}

	public void addElement(T elemento){
		listEntity.add(elemento);
	}
	
	public JButton getBtnAnterior(){
		return this.btnAnterior;
	}

	public boolean confirmEliminar(String message) {
		//TODO add title
		return JOptionPane.showConfirmDialog(this, message, "" ,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
	}

	public void showErrorMessage(String message) {
		//TODO add title
		JOptionPane.showMessageDialog(this,message, "", JOptionPane.ERROR_MESSAGE);
	}
}