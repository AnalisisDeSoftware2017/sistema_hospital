package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.model.TipoDocumentoEnum;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import org.springframework.stereotype.Component;
import javax.swing.JPanel;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class FormCreatePaciente extends AbstractFormCreate<Paciente>{
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCodigo;
	private JTextField txtNumeroDeDocumento;
	private JComboBox<TipoDocumentoEnum> cbTipoDocumento;
	
	public FormCreatePaciente() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 633, 500);
		panel.setLayout(null);
		add(panel);
		
		
		txtNombre = new JTextField();
		txtNombre.setBounds(98, 49, 441, 26);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(98, 21, 441, 16);
		panel.add(lblNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(98, 115, 441, 26);
		panel.add(txtApellido);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(98, 87, 441, 16);
		panel.add(lblApellido);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(98, 182, 441, 26);
		panel.add(txtCodigo);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(98, 154, 441, 16);
		panel.add(lblCodigo);
		
		JLabel lblTipoDocumento = new JLabel("Tipo documento:");
		lblTipoDocumento.setBounds(98, 220, 441, 16);
		panel.add(lblTipoDocumento);
		
		cbTipoDocumento = new JComboBox();
		cbTipoDocumento.setBounds(98, 248, 441, 27);
		panel.add(cbTipoDocumento);
		
		txtNumeroDeDocumento = new JTextField();
		txtNumeroDeDocumento.setColumns(10);
		txtNumeroDeDocumento.setBounds(98, 324, 441, 26);
		panel.add(txtNumeroDeDocumento);

		//TODO remove this and add in controller
		this.cbTipoDocumento.setModel(new DefaultComboBoxModel<>(TipoDocumentoEnum.values()));
		
		JLabel lblNumeroDocumento = new JLabel("Numero de documento:");
		lblNumeroDocumento.setBounds(98, 296, 441, 16);
		panel.add(lblNumeroDocumento);
		
		JLabel lblEspecialidades = new JLabel("Especialidades en las que se atiende");
		lblEspecialidades.setBounds(98, 361, 441, 16);
		panel.add(lblEspecialidades);
		
		JList list = new JList();
		list.setBounds(98, 388, 441, 88);
		panel.add(list);
		
	}


	
    @Override
    public Paciente getEntity() {
    	this.entity.setCodigo(this.txtCodigo.getText());
		this.entity.setApellido(this.txtApellido.getText());
		this.entity.setNombre(this.txtNombre.getText());
		this.entity.setNumeroDocumento(this.txtNumeroDeDocumento.getText());
		this.entity.setTipoDocumento((TipoDocumentoEnum)this.cbTipoDocumento.getSelectedItem());
        return this.entity;
    }

	@Override
	public void setEntity(Paciente entity) {
		this.entity = entity==null?new Paciente():entity;
		this.txtApellido.setText(this.entity.getApellido());
		this.txtCodigo.setText(this.entity.getCodigo());
		this.txtNombre.setText(this.entity.getNombre());
		this.txtNumeroDeDocumento.setText(this.entity.getNumeroDocumento());
		this.cbTipoDocumento.setSelectedItem(this.entity.getTipoDocumento()==null?TipoDocumentoEnum.DNI:this.entity.getTipoDocumento());
	}

}
