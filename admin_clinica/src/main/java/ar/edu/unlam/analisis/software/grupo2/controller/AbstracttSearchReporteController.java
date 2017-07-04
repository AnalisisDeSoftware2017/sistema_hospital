package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.dao.ReporteDao;
import ar.edu.unlam.analisis.software.grupo2.core.model.Persona;
import ar.edu.unlam.analisis.software.grupo2.data.PersonaData;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerPersonaFormSearch;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenReporte;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sbogado on 6/28/17.
 */
public abstract class AbstracttSearchReporteController<T extends Persona, E extends PersonaData> extends AbstractFrameController<AbstractContainerPersonaFormSearch<T, E>> {


    @Autowired
    protected ReporteDao reporteDao;

    private AbstractListScreenReporte<T> listScreen;

    public AbstracttSearchReporteController(AbstractContainerPersonaFormSearch<T, E> pantalla, AbstractListScreenReporte<T> listScreenReporte) {
        this.frame = pantalla;
        this.listScreen = listScreenReporte;
    }

    @Override
    protected void prepareAndOpenFrame() {
        registerClickAction(this.frame.getBtnAnterior(), (event) -> anterior());
        registerEnterKeyAction(this.frame.getBtnAnterior(), () -> anterior());
        registerClickAction(this.frame.getBtnBuscar(), (event) -> search());
        registerEnterKeyAction(this.frame.getBtnBuscar(), () -> search());

        registerClickAction(this.listScreen.getBtnAnterior(), (event) -> showSearchForm());
        registerEnterKeyAction(this.listScreen.getBtnAnterior(), () -> showSearchForm());
        this.frame.setVisible(true);
    }

    protected void showSearchForm() {
        this.listScreen.setVisible(false);
        this.frame.setVisible(true);
    }

    protected abstract void search();


    private void anterior() {
        this.frame.clearFiltros();
        this.setVisible(false);
        this.controllerAnterior.setVisible(true);
    }

    protected void cargarListaDePersonas(List<T> personas) {
        if(null == personas || personas.isEmpty()){
            this.frame.showEmptyPersonaMessage();
        }else{
            this.frame.clearFiltros();
            this.frame.setVisible(false);
            this.listScreen.cargarLista(personas);
            this.listScreen.setVisible(true);
        }
    }

}
