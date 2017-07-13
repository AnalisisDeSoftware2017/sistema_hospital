package ar.edu.unlam.analisis.software.grupo2.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ClassPathResource;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public abstract class AbstractPantalla extends JFrame implements SetTextoInterface {


    @Autowired
    protected MessageSource messageSource;

    protected ImageIcon img;
    private static final Integer HEIGHT = 1330;
    private static final Integer WIDTH  = 720;
    private JLabel label;


    @Autowired
    public AbstractPantalla(MessageSource messageSource) {
        this.messageSource = messageSource;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, HEIGHT, WIDTH);
        getContentPane().setLayout(null);
        setPanel("/img/Hospital_Laurel.jpg");
    }
    
    
    protected PanelImagen setPanel(){
    	return setPanel("/img/Hospital_Laurel.jpg");
    }
    
    protected PanelImagen setPanel(String path){
    	PanelImagen p = new PanelImagen(path);
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        setContentPane(p);
        return p;
    }
    
    
}
