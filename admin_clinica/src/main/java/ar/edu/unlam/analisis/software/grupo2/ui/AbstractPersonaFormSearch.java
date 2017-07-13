package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.core.model.Persona;
import ar.edu.unlam.analisis.software.grupo2.core.model.TipoDocumentoEnum;
import ar.edu.unlam.analisis.software.grupo2.data.PersonaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public abstract class AbstractPersonaFormSearch<T extends Persona, E extends PersonaData> extends JPanel implements SetTextoInterface {
    protected JTextField txtNombre;
    protected JTextField txtApellido;
    protected JTextField txtCodigo;
    protected JTextField txtNumeroDeDocumento;
    protected JComboBox<TipoDocumentoEnum> cbTipoDocumento;
    private MessageSource messageSource;

    @Autowired
    public AbstractPersonaFormSearch(MessageSource messageSource) {
        super();
        this.messageSource= messageSource;
        setLayout(null);
        txtNombre = new JTextField();
        txtNombre.setBounds(481, 127, 285, 26);
        add(txtNombre);
        txtNombre.setColumns(10);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setForeground(Color.RED);
        lblNombre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
        lblNombre.setBounds(481, 99, 112, 16);
        add(lblNombre);

        txtApellido = new JTextField();
        txtApellido.setColumns(10);
        txtApellido.setBounds(481, 193, 285, 26);
        add(txtApellido);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setForeground(Color.RED);
        lblApellido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
        lblApellido.setBounds(481, 165, 123, 16);
        add(lblApellido);

        txtCodigo = new JTextField();
        txtCodigo.setColumns(10);
        txtCodigo.setBounds(481, 260, 285, 26);
        add(txtCodigo);

        JLabel lblCodigo = new JLabel("Codigo");
        lblCodigo.setForeground(Color.RED);
        lblCodigo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
        lblCodigo.setBounds(481, 232, 112, 16);
        add(lblCodigo);

        JLabel lblTipoDocumento = new JLabel("Tipo documento:");
        lblTipoDocumento.setForeground(Color.RED);
        lblTipoDocumento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
        lblTipoDocumento.setBounds(481, 298, 166, 16);
        add(lblTipoDocumento);

        cbTipoDocumento = new JComboBox();
        cbTipoDocumento.setBounds(481, 326, 285, 27);
        add(cbTipoDocumento);

        txtNumeroDeDocumento = new JTextField();
        txtNumeroDeDocumento.setColumns(10);
        txtNumeroDeDocumento.setBounds(481, 402, 285, 26);
        add(txtNumeroDeDocumento);

        //TODO remove this and add in controller
        this.cbTipoDocumento.setModel(new DefaultComboBoxModel<>(TipoDocumentoEnum.values()));

        JLabel lblNumeroDocumento = new JLabel("Numero de documento:");
        lblNumeroDocumento.setForeground(Color.RED);
        lblNumeroDocumento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
        lblNumeroDocumento.setBounds(481, 374, 217, 16);
        add(lblNumeroDocumento);
    }


    public abstract E getEntity();


    @Override
    public void setTexto() {

    }

    public void clearFiltros() {
        this.txtApellido.setText("");
        this.txtCodigo.setText("");
        this.txtNombre.setText("");
        this.txtNumeroDeDocumento.setText("");
    }
}
