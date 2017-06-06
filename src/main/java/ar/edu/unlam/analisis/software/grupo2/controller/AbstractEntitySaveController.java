package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.ui.SaveForm;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by sbogado on 6/6/17.
 */
public abstract class AbstractEntitySaveController<T extends AbmEntity, PK extends Serializable> extends AbstractFrameController<SaveForm<T>>{

    @Autowired
    private AbstractServiceCRUD<T,PK> service;

    @Autowired
    public AbstractEntitySaveController(AbstractServiceCRUD<T,PK> service, SaveForm<T> form){
        this.service=service;
        this.frame=form;
    }


    @Override
    public void prepareAndOpenFrame(){
        registerClickAction(this.frame.getBtnCancelar(), (event)->cancelar());
        registerEnterKeyAction(this.frame.getBtnCancelar(), ()->cancelar());
        registerClickAction(this.frame.getBtnGuardar(), (event)->createEntity());
        registerEnterKeyAction(this.frame.getBtnGuardar(), ()->createEntity());
    }

    private void createEntity() {
        List<String> camporErroneos = validateData();
        if(camporErroneos.isEmpty()){
            this.service.save(this.frame.getEntity());
            this.frame.setVisible(false);
            this.controllerAnterior.prepareAndOpenFrame();
        }else{
            mostrarMensajeDeError(camporErroneos);
        }
    }

    protected void mostrarMensajeDeError(List<String> camposErroneos){
        String messageError = "";
        for(String errores: camposErroneos)
            messageError= messageError +errores+"\n";
        JOptionPane.showMessageDialog(this.frame,
                messageError,
                "Error",
                JOptionPane.WARNING_MESSAGE);
    }

    protected void cancelar(){
        this.frame.setVisible(false);
        this.controllerAnterior.prepareAndOpenFrame();
    }

    protected abstract List<String> validateData();


}
