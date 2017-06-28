package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.model.Persona;
import ar.edu.unlam.analisis.software.grupo2.data.PersonaData;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerPersonaFormSearch;

/**
 * Created by sbogado on 6/28/17.
 */
public class AbstracttSearchReporteController<T extends Persona, E extends PersonaData> extends AbstractFrameController<AbstractContainerPersonaFormSearch<T, E>> {


    @Override
    protected void prepareAndOpenFrame() {
        registerClickAction(this.frame.getBtnAnterior(), (event) -> anterior());
        registerEnterKeyAction(this.frame.getBtnAnterior(), () -> anterior());
        registerClickAction(this.frame.getBtnBuscar(), (event) -> search());
        registerEnterKeyAction(this.frame.getBtnBuscar(), () -> search());
        this.frame.setVisible(true);
    }

    private void search() {
    }

    private void anterior() {


    }

    @Override
    protected void setTextoFrame() {

    }
}
