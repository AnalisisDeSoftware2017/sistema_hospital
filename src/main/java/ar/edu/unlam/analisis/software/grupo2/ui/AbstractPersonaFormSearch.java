package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.core.model.Persona;
import ar.edu.unlam.analisis.software.grupo2.core.model.TipoDocumentoEnum;
import ar.edu.unlam.analisis.software.grupo2.data.PersonaData;

import javax.swing.*;

public abstract class AbstractPersonaFormSearch<T extends Persona, E extends PersonaData> extends JPanel {
    protected JTextField txtNombre;
    protected JTextField txtApellido;
    protected JTextField txtCodigo;
    protected JTextField txtNumeroDeDocumento;
    protected JComboBox<TipoDocumentoEnum> cbTipoDocumento;

    public AbstractPersonaFormSearch() {
        setLayout(null);

        txtNombre = new JTextField();
        txtNombre.setBounds(267, 63, 285, 26);
        add(txtNombre);
        txtNombre.setColumns(10);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(267, 35, 61, 16);
        add(lblNombre);

        txtApellido = new JTextField();
        txtApellido.setColumns(10);
        txtApellido.setBounds(267, 129, 285, 26);
        add(txtApellido);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(267, 101, 61, 16);
        add(lblApellido);

        txtCodigo = new JTextField();
        txtCodigo.setColumns(10);
        txtCodigo.setBounds(267, 196, 285, 26);
        add(txtCodigo);

        JLabel lblCodigo = new JLabel("Codigo");
        lblCodigo.setBounds(267, 168, 112, 16);
        add(lblCodigo);

        JLabel lblTipoDocumento = new JLabel("Tipo documento:");
        lblTipoDocumento.setBounds(267, 234, 112, 16);
        add(lblTipoDocumento);

        cbTipoDocumento = new JComboBox();
        cbTipoDocumento.setBounds(267, 262, 285, 27);
        add(cbTipoDocumento);

        txtNumeroDeDocumento = new JTextField();
        txtNumeroDeDocumento.setColumns(10);
        txtNumeroDeDocumento.setBounds(267, 338, 285, 26);
        add(txtNumeroDeDocumento);

        //TODO remove this and add in controller
        this.cbTipoDocumento.setModel(new DefaultComboBoxModel<>(TipoDocumentoEnum.values()));

        JLabel lblNumeroDocumento = new JLabel("Numero de documento:");
        lblNumeroDocumento.setBounds(267, 310, 166, 16);
        add(lblNumeroDocumento);
    }


    public abstract E getEntity();


}
