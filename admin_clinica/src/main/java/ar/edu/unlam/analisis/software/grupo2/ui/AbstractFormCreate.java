package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.swing.*;

public abstract class AbstractFormCreate<T extends AbmEntity> extends JPanel implements SetTextoInterface {

    @Autowired
    protected MessageSource messageSource;

	protected T entity;

	public abstract T getEntity();
	public abstract void setEntity(T entitys);

}
