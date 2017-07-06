package ar.edu.unlam.analisis.software.grupo2.ui.customComponents;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

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


	public void setSelectedValues(List<T> entities) {
        if(null != entities && null != defaultListModel){
            List<Integer> indexList = new ArrayList<>();
            entities.forEach(entity -> {
                for (int i = 0; i < this.defaultListModel.getSize(); i++) {
                    if (this.defaultListModel.get(i).getId().equals(entity.getId())) {
                        indexList.add(i);
                        return;
                    }
                }
            });
            int [] array = new int[indexList.size()];
            for(int i = 0; i < indexList.size(); i ++ ){
                array[i]=indexList.get(i);
            }
            this.setSelectedIndices(array);
        } else if (null == entities || entities.isEmpty()) {
            int[] index = new int[0];
            this.setSelectedIndices(index);
        }
	}
}
