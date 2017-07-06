package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.dao.ReporteDao;
import ar.edu.unlam.analisis.software.grupo2.core.model.Persona;
import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.SituacionDelPacienteService;
import ar.edu.unlam.analisis.software.grupo2.data.PersonaData;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerPersonaFormSearch;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenReporte;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractPersonaDetails;
import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sbogado on 6/28/17.
 */
public abstract class AbstracttSearchReporteController<T extends Persona, E extends PersonaData> extends AbstractFrameController<AbstractContainerPersonaFormSearch<T, E>> {


    @Autowired
    protected ReporteDao reporteDao;

    @Autowired
    protected SituacionDelPacienteService situacionDelPacienteService;

    private AbstractListScreenReporte<T> listScreen;

    private AbstractPersonaDetails<T> personaDetails;


    public AbstracttSearchReporteController(AbstractContainerPersonaFormSearch<T, E> pantalla, AbstractListScreenReporte<T> listScreenReporte, AbstractPersonaDetails<T> details) {
        this.frame = pantalla;
        this.listScreen = listScreenReporte;
        this.personaDetails = details;
    }

    @Override
    protected void prepareAndOpenFrame() {
        registerClickAction(this.frame.getBtnAnterior(), (event) -> anterior());
        registerEnterKeyAction(this.frame.getBtnAnterior(), () -> anterior());
        registerClickAction(this.frame.getBtnBuscar(), (event) -> search());
        registerEnterKeyAction(this.frame.getBtnBuscar(), () -> search());

        registerClickAction(this.listScreen.getBtnAnterior(), (event) -> showSearchForm());
        registerEnterKeyAction(this.listScreen.getBtnAnterior(), () -> showSearchForm());

        registerClickAction(this.listScreen.getBtnVerDetalle(), (event) -> showPersonaDetails());
        registerEnterKeyAction(this.listScreen.getBtnVerDetalle(), () -> showPersonaDetails());

        registerClickAction(this.personaDetails.getBtnAnterior(), (event) -> showListScreen());
        registerEnterKeyAction(this.personaDetails.getBtnAnterior(), () -> showListScreen());
        
        
        this.frame.setVisible(true);
    }


    private void showPersonaDetails() {
        T entity = this.listScreen.getSelectedItem();
        if (null == entity) {
            this.listScreen.showErrorMessage(messageSource.getMessage("ar.edu.unlam.los.laureles.nada.seleccionado", null, AppContext.getLocale()));
        } else {
            this.personaDetails.setEntity(entity);
            this.personaDetails.setListaSituaciones(this.findListaDeSituaciones(entity));
            this.personaDetails.setVisible(true);
            this.listScreen.setVisible(false);
        }
    }

    protected abstract List<SituacionDelPaciente> findListaDeSituaciones(T entity);

    private void showListScreen() {
        this.personaDetails.setVisible(false);
        this.listScreen.setVisible(true);
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
