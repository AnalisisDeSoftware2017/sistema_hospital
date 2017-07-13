package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.core.model.Persona;
import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public abstract class AbstractPersonaDetails<T extends Persona> extends AbstractPantalla {

    protected JLabel lblDataNumeroDeDocumento;
    protected JLabel lblDataTipoDocumento;
    protected JLabel lblDataCodigo;
    protected JLabel lblDataApellido;
    protected JLabel lblDataNombre;
    protected JTextArea taConsultas;
    private JButton btnAnterior;


    public AbstractPersonaDetails(MessageSource messageSource) {
        super(messageSource);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(55, 35, 419, 613);
        panel.setBackground(new Color(0, 0, 0, 0));
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(66, 43, 112, 16);
        panel.add(lblNombre);
        lblNombre.setForeground(Color.RED);
        lblNombre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(66, 109, 123, 16);
        panel.add(lblApellido);
        lblApellido.setForeground(Color.RED);
        lblApellido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));

        JLabel lblCodigo = new JLabel("Codigo");
        lblCodigo.setBounds(66, 176, 112, 16);
        panel.add(lblCodigo);
        lblCodigo.setForeground(Color.RED);
        lblCodigo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));

        JLabel lblTipoDocumento = new JLabel("Tipo documento:");
        lblTipoDocumento.setBounds(66, 242, 166, 16);
        panel.add(lblTipoDocumento);
        lblTipoDocumento.setForeground(Color.RED);
        lblTipoDocumento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));

        JLabel lblNumeroDocumento = new JLabel("Numero de documento:");
        lblNumeroDocumento.setBounds(66, 318, 217, 16);
        panel.add(lblNumeroDocumento);
        lblNumeroDocumento.setForeground(Color.RED);
        lblNumeroDocumento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));

        lblDataNumeroDeDocumento = new JLabel("");
        lblDataNumeroDeDocumento.setBounds(66, 356, 307, 15);
        panel.add(lblDataNumeroDeDocumento);

        lblDataTipoDocumento = new JLabel("");
        lblDataTipoDocumento.setBounds(66, 280, 307, 15);
        panel.add(lblDataTipoDocumento);

        lblDataCodigo = new JLabel("");
        lblDataCodigo.setBounds(66, 204, 307, 15);
        panel.add(lblDataCodigo);

        lblDataApellido = new JLabel("");
        lblDataApellido.setBounds(66, 137, 307, 15);
        panel.add(lblDataApellido);

        lblDataNombre = new JLabel("");
        lblDataNombre.setBounds(66, 71, 307, 15);
        panel.add(lblDataNombre);


        taConsultas = new JTextArea(500, 40);
        taConsultas.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(taConsultas);
        scrollPane.setBounds(560, 35, 726, 520);
        getContentPane().add(scrollPane);

        btnAnterior = new JButton("Anterior");
        btnAnterior.setBounds(524, 649, 114, 25);
        getContentPane().add(btnAnterior);
    }


    public void setEntity(T entity) {
        this.lblDataApellido.setText(entity.getApellido());
        this.lblDataCodigo.setText(entity.getCodigo());
        this.lblDataNombre.setText(entity.getNombre());
        this.lblDataTipoDocumento.setText(entity.getTipoDocumento().name());
        this.lblDataNumeroDeDocumento.setText(entity.getNumeroDocumento());
    }

    protected abstract void showDetails(List<SituacionDelPaciente> situacionesDelPaciente);

    public void setListaSituaciones(List<SituacionDelPaciente> situacionesDelPaciente) {
        this.showDetails(situacionesDelPaciente);
    }


    @Override
    public void setTexto() {

    }

    public JButton getBtnAnterior() {
        return this.btnAnterior;
    }

}
