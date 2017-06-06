package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.utils.Command;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by sbogado on 5/8/17.
 */
public abstract class AbstractFrameController<T extends  JFrame> {

    protected AbstractFrameController controllerAnterior;

    protected T frame;

    public abstract void prepareAndOpenFrame();

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
        this.controllerAnterior = controllerAnterior;
    }
    protected void salir(){
        System.exit(0); // SE SALE DEL PROGRAMA.
    }
    protected void setVisible(Boolean visible){
        this.frame.setVisible(visible);
    }

    protected abstract void setTextoFrame();


}
