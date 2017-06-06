package ar.edu.unlam.analisis.software.grupo2.ui.customComponents;

import java.util.List;

import javax.swing.JList;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;

public class JListCustom<T extends AbmEntity > extends JList<T>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6217263232018824029L;
	
	public void add(List<T> lista){
		for(T elemento : lista){
			super.add(elemento.getName(),elemento);
		}
	}
	
	public T getSelectedElement(){
		return this.getSelectedElement();
	}


}
