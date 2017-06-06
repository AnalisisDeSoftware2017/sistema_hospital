package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;
import ar.edu.unlam.analisis.software.grupo2.ui.MainABM;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public abstract class AbstractABMController<T extends AbmEntity, PK extends Serializable> extends AbstractFrameController<MainABM<T>>{


    private AbstractEntitySaveController<T,PK> entitySaveController;

    @Autowired
    public AbstractABMController(MainABM<T> pantalla, AbstractEntitySaveController<T,PK> entitySaveController){
        this.frame=pantalla;
        this.entitySaveController=entitySaveController;
    }

    @Override
    public void prepareAndOpenFrame() {
        registerClickAction(frame.getBtnCrear(),(event)->crear());
        registerEnterKeyAction(frame.getBtnCrear(),()->crear());
        registerClickAction(frame.getBtnEditar(),(event)->editar());
        registerEnterKeyAction(frame.getBtnEditar(),()->editar());
        registerClickAction(frame.getBtnEliminar(),(event)->eliminar());
        registerEnterKeyAction(frame.getBtnEliminar(),()->eliminar());
        /*registerClickAction(frame.getBtnAnterior(),(event)->anterior());
        registerEnterKeyAction(frame.getBtnAnterior(),()->anterior());*/
        this.frame.setVisible(true);
    }

    private void anterior() {
        this.setVisible(false);
        //TODO change the another prepateAndOpenFrame for this
        this.controllerAnterior.setVisible(true);
    }

    private void eliminar() {

    }

    private void editar() {
        this.frame.setVisible(false);
        this.entitySaveController.setControllerAnterior(this);
    }

    private void crear() {
        this.frame.setVisible(false);
        this.entitySaveController.setControllerAnterior(this);
    }

    @Override
    protected void setTextoFrame() {

    }
}
