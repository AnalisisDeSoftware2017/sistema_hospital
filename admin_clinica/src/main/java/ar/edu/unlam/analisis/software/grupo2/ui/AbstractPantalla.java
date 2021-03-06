package ar.edu.unlam.analisis.software.grupo2.ui;

import org.springframework.context.MessageSource;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Locale;

public abstract class AbstractPantalla extends JFrame implements SetTextoInterface {



    private static final Integer HEIGHT = 1330;
    private static final Integer WIDTH  = 720;
    protected ImageIcon img;
    private MessageSource messageSource;
    private JLabel label;


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


    public String getMessage(String code, String[] args, Locale locale) {
        return this.messageSource.getMessage(code, args, locale);
    }


    public String getMessage(String code, Locale locale) {
        return this.messageSource.getMessage(code, null, locale);
    }

    
    
}
