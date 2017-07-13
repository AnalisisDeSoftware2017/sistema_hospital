package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.core.model.Persona;
import ar.edu.unlam.analisis.software.grupo2.ui.customComponents.JListCustom;
import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;

public abstract class AbstractListScreenReporte<T extends Persona> extends AbstractPantalla {

    private JPanel contentPane;
    private JListCustom<T> listEntity;
    private JButton btnVerDetalle;
    private JButton btnAnterior;

    /**
     * Create the frame.
     */
    @Autowired
    public AbstractListScreenReporte(MessageSource messageSource) {
        super(messageSource);
        contentPane = this.setPanel("/img/Atencion_Pacientes.jpg");
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0, 0));
        panel.setBounds(21, 63, 809, 517);
        contentPane.add(panel);
        panel.setLayout(null);

        listEntity = new JListCustom<>();
        listEntity.setBounds(28, 73, 585, 507);
        panel.add(listEntity);

        btnVerDetalle = new JButton(getMessage("ui.AbstractListScreenReporte.verDetalle", null, AppContext.getLocale()));
        btnVerDetalle.setBounds(654, 141, 117, 29);
        panel.add(btnVerDetalle);

        btnAnterior = new JButton(getMessage("ui.AbstractListScreenReporte.text.anterior", null, AppContext.getLocale()));
        btnAnterior.setBounds(654, 329, 117, 29);
        panel.add(btnAnterior);
    }


    public T getSelectedItem() {
        return this.listEntity.getSelectedElement();

    }

    public JButton getBtnVerDetalle() {
        return this.btnVerDetalle;
    }

    public JButton getBtnAnterior() {
        return this.btnAnterior;
    }

    public void cargarLista(List<T> lista) {
        listEntity.cleanAndAddAll(lista);
    }

    public boolean confirmEliminar(String message) {
        //TODO add title
        return JOptionPane.showConfirmDialog(this, message, "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public void showErrorMessage(String message) {
        //TODO add title
        JOptionPane.showMessageDialog(this, message, "", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void setTexto() {
        // TODO Auto-generated method stub

    }
}
