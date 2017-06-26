package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.TipoDocumentoEnum;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import org.springframework.stereotype.Component;
import javax.swing.JTextField;
import javax.swing.JLabel;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class FormCreateMedico extends AbstractFormCreate<Medico> {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCodigo;
	private JTextField txtNumeroDeDocumento;
	private JComboBox<TipoDocumentoEnum> cbTipoDocumento;
	
	public FormCreateMedico() {
		setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(171, 84, 285, 26);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(171, 56, 61, 16);
		add(lblNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(171, 150, 285, 26);
		add(txtApellido);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(171, 122, 61, 16);
		add(lblApellido);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(171, 217, 285, 26);
		add(txtCodigo);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(171, 189, 112, 16);
		add(lblCodigo);
		
		JLabel lblTipoDocumento = new JLabel("Tipo documento:");
		lblTipoDocumento.setBounds(171, 255, 112, 16);
		add(lblTipoDocumento);
		
		cbTipoDocumento = new JComboBox();
		cbTipoDocumento.setBounds(171, 283, 285, 27);
		add(cbTipoDocumento);
		
		txtNumeroDeDocumento = new JTextField();
		txtNumeroDeDocumento.setColumns(10);
		txtNumeroDeDocumento.setBounds(171, 359, 285, 26);
		add(txtNumeroDeDocumento);

		//TODO remove this and add in controller
		this.cbTipoDocumento.setModel(new DefaultComboBoxModel<>(TipoDocumentoEnum.values()));


		JLabel lblNumeroDocumento = new JLabel("Numero de documento:");
		lblNumeroDocumento.setBounds(171, 331, 166, 16);
		add(lblNumeroDocumento);
	}

    @Override
    public Medico getEntity() {
		this.entity.setCodigo(this.txtCodigo.getText());
		this.entity.setApellido(this.txtApellido.getText());
		this.entity.setNombre(this.txtNombre.getText());
		this.entity.setNumeroDocumento(this.txtNumeroDeDocumento.getText());
		this.entity.setTipoDocumento((TipoDocumentoEnum)this.cbTipoDocumento.getSelectedItem());
		return this.entity;
    }


	@Override
	public void setEntity(Medico entity) {
		this.entity = entity==null?new Medico():entity;
		this.txtApellido.setText(this.entity.getApellido());
		this.txtCodigo.setText(this.entity.getCodigo());
		this.txtNombre.setText(this.entity.getNombre());
		this.txtNumeroDeDocumento.setText(this.entity.getNumeroDocumento());
		this.cbTipoDocumento.setSelectedItem(this.entity.getTipoDocumento()==null?TipoDocumentoEnum.DNI:this.entity.getTipoDocumento());
    }
}
