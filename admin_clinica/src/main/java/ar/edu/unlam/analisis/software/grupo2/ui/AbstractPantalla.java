package ar.edu.unlam.analisis.software.grupo2.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.swing.*;

public abstract class AbstractPantalla extends JFrame implements SetTextoInterface {

    @Autowired
    protected MessageSource messageSource;


    public AbstractPantalla() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1330, 720);
    }

}
