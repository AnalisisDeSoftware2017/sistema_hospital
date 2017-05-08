package ar.edu.unlam.analisis.software.grupo2.controller;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by sbogado on 5/8/17.
 */
public abstract class AbstractFrameController {

    public abstract void prepareAndOpenFrame();

    protected void registerAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }

}
