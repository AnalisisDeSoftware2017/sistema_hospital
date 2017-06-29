package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;

import javax.swing.*;

public abstract class AbstractFormCreate<T extends AbmEntity> extends JPanel {

	protected T entity;

	public abstract T getEntity();
	public abstract void setEntity(T entitys);

}
