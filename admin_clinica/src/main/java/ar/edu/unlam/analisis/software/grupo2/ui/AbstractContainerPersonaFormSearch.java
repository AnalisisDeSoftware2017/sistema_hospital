package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.core.model.Persona;
import ar.edu.unlam.analisis.software.grupo2.data.PersonaData;
import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.context.MessageSource;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractContainerPersonaFormSearch<T extends Persona, E extends PersonaData> extends AbstractPantalla {

    protected AbstractPersonaFormSearch<T, E> searchForm;
    private JButton btnAnterior;
    private JButton btnBuscar;


    public AbstractContainerPersonaFormSearch(AbstractPersonaFormSearch<T, E> form,MessageSource messageSource) {
        super(messageSource);
        getContentPane().setLayout(null);

        this.searchForm = form;

        JPanel formContainer = new JPanel();
        formContainer.setBounds(22, 20, 1040, 530);
        formContainer.setBackground(new Color(0,0,0,0));
        searchForm.setBounds(0, 0, 1020, 510);
        searchForm.setBackground(new Color(0,0,0,0));
        formContainer.add(searchForm);
        getContentPane().add(formContainer);
        formContainer.setLayout(null);

        JPanel botonera = new JPanel();
        botonera.setBounds(22, 562, 1040, 101);
        botonera.setBackground(new Color(0,0,0,0));
        getContentPane().add(botonera);
        botonera.setLayout(null);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(307, 47, 117, 29);
        botonera.add(btnBuscar);

        btnAnterior = new JButton("Anterior");
        btnAnterior.setBounds(755, 47, 117, 29);
        botonera.add(btnAnterior);


    }

    public E getEntity() {
        return this.searchForm.getEntity();
    }

    public JButton getBtnAnterior() {
        return btnAnterior;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }


    @Override
    public void setTexto() {
        // TODO Auto-generated method stub
    }

    public void showEmptyPersonaMessage() {
        JOptionPane.showMessageDialog(this, getMessage("ar.edu.unlam.los.laureles.noElementsToShow", null, AppContext.getLocale()));
    }

    public void clearFiltros() {
        this.searchForm.clearFiltros();
    }
}
