package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenABM;
import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public abstract class AbstractABMController<T extends AbmEntity, PK extends Serializable> extends AbstractFrameController<AbstractListScreenABM<T>>{


    private AbstractEntitySaveController<T,PK> entitySaveController;
    private AbstractServiceCRUD<T,PK> service;
    @Autowired
    public AbstractABMController(AbstractListScreenABM<T> pantalla, AbstractEntitySaveController<T,PK> entitySaveController, AbstractServiceCRUD<T,PK> service){
        this.frame=pantalla;
        this.entitySaveController=entitySaveController;
        this.service = service;
    }

    @Override
    public void prepareAndOpenFrame() {
        this.frame.setVisible(true);
        registerClickAction(frame.getBtnCrear(),(event)->crear());
        registerEnterKeyAction(frame.getBtnCrear(),()->crear());
        registerClickAction(frame.getBtnEditar(),(event)->editar());
        registerEnterKeyAction(frame.getBtnEditar(),()->editar());
        registerClickAction(frame.getBtnEliminar(),(event)->eliminar());
        registerEnterKeyAction(frame.getBtnEliminar(),()->eliminar());
        registerClickAction(frame.getBtnAnterior(),(event)->anterior());
        registerEnterKeyAction(frame.getBtnAnterior(),()->anterior());
        cargarLista();

    }

    private void cargarLista() {
        this.frame.cargarLista(service.findAll());
    }

    private void anterior() {
        this.setVisible(false);
        //TODO change the another prepateAndOpenFrame for this
        this.controllerAnterior.setVisible(true);
    }

    private void eliminar() {
        T entity = this.frame.getSelectedItem();
        if(entity != null ){
            if(this.frame.confirmEliminar(messageSource.getMessage("ar.edu.unlam.los.laureles.confirmar.eliminar",new String[]{entity.getName()},  AppContext.getLocale()))){
                this.service.delete(entity);
                this.cargarLista();
            }
        }else{
            this.frame.showErrorMessage(messageSource.getMessage("ar.edu.unlam.los.laureles.nada.seleccionado", null, AppContext.getLocale()));
        }
    }

    private void editar() {
        T entity = this.frame.getSelectedItem();
        if(entity != null ){
            this.frame.setVisible(false);
            this.entitySaveController.setEntity(this.frame.getSelectedItem());
            this.entitySaveController.setControllerAnterior(this);
            this.entitySaveController.setVisible(true);
        }else{
            this.frame.showErrorMessage(messageSource.getMessage("ar.edu.unlam.los.laureles.nada.seleccionado", null, AppContext.getLocale()));
        }
    }

    private void crear() {
        this.frame.setVisible(false);
        this.entitySaveController.setEntity(null);
        this.entitySaveController.setControllerAnterior(this);
        this.entitySaveController.setVisible(true);
    }


    @Override
    public void setVisible(Boolean visible){
        super.setVisible(visible);
        if(visible){
            this.frame.cargarLista(service.findAll());
        }
    }
}
