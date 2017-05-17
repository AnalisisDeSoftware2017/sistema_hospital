package ar.edu.unlam.analisis.software.grupo2.controller;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;

/**
 * Created by sbogado on 5/8/17.
 */
public abstract class AbstractFrameController {

    public abstract void prepareAndOpenFrame();

    protected void registerClickAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }
    protected void registerKeyAction(JTextField component, KeyAdapter keyAdapter){component.addKeyListener(keyAdapter);}

}
