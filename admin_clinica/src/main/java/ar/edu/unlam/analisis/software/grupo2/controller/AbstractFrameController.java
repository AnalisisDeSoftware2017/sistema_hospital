package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.ui.AbstractPantalla;
import ar.edu.unlam.analisis.software.grupo2.utils.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by sbogado on 5/8/17.
 */
public abstract class AbstractFrameController<T extends AbstractPantalla> {

    protected AbstractFrameController controllerAnterior;

    @Autowired
    protected MessageSource messageSource;

    protected T frame;

    private Boolean frameWasInit=false;

    protected abstract void prepareAndOpenFrame();

    protected void registerClickAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }
    protected void registerKeyAction(JComponent component, KeyAdapter keyAdapter){component.addKeyListener(keyAdapter);}
    protected void registerEnterKeyAction(JComponent component, Command command){
        component.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar()==KeyEvent.VK_ENTER){
                    command.execute();
                }
            }
        });
    }
    protected void setControllerAnterior(AbstractFrameController abstractFrameController){
        this.controllerAnterior = abstractFrameController;
    }
    protected void salir(){
        System.exit(0); // SE SALE DEL PROGRAMA.
    }

    public void setVisible(Boolean visible){
        if(!frameWasInit){
            prepareAndOpenFrame();
            frameWasInit=true;
        }
        this.frame.setVisible(visible);
    }

    protected final void setTextoFrame() {
        this.frame.setTexto();
    }


}
