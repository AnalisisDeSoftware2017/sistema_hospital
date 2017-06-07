package ar.edu.unlam.analisis.software.grupo2.ui.customComponents;

import java.util.List;

import javax.swing.*;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;

public class JListCustom<T extends AbmEntity > extends JList<T>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6217263232018824029L;

	private DefaultListModel<T> defaultListModel;

	public JListCustom(){
		super();
		defaultListModel=new DefaultListModel<>();
		super.setModel(defaultListModel);
	}

	public JListCustom(List<T> elements){
		super((T[])elements.toArray());
	}

	public void addAll(List<T> lista){
		for(T elemento : lista){
			defaultListModel.add(this.defaultListModel.size(),elemento);
		}
	}

	public void add(T elemento){
		defaultListModel.add(this.defaultListModel.size(),elemento);
	}
	
	public T getSelectedElement(){
		return this.getSelectedValue();
	}


}
