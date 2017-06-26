package ar.edu.unlam.analisis.software.grupo2.ui.customComponents;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;
import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;

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

	public void cleanAndAddAll(List<T> lista){
		this.defaultListModel.clear();
		addAll(lista);
	}

	public void add(T elemento){
		defaultListModel.add(this.defaultListModel.size(),elemento);
	}
	
	public T getSelectedElement(){
		return this.getSelectedValue();
	}


	//Seteo los indices seleccionados
    public void setSelectedItems(List<T> entidades) {
		ArrayList<Integer> indices = new ArrayList<>();
		for(T entidad : entidades){
			Boolean found = false;
			for(int  i = 0 ; i<defaultListModel.getSize() && found; i++){
				if(entidad.getId().equals(defaultListModel.get(i).getId())){
					indices.add(i);
					found = true;
				}
			}
		}
    }

    public List<T> getSelectedElements() {
		List<T> selectedElements = new ArrayList<>();
		for(Integer i : this.getSelectedIndices()){
			selectedElements.add(this.defaultListModel.get(i));
		}
		return selectedElements;
    }
}
