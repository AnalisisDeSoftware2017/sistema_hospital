package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractFormCreate<T extends AbmEntity> extends JPanel implements SetTextoInterface {

    protected MessageSource messageSource;

    protected AbstractFormCreate(MessageSource messageSource){
    	this.messageSource = messageSource;
		this.setBackground(new Color(0,0,0,0));
	}

	protected T entity;

	public abstract T getEntity();
	public abstract void setEntity(T entitys);

}
