package ar.edu.unlam.analisis.software.grupo2.ui.customComponents;

import ar.edu.unlam.analisis.software.grupo2.core.model.AbmEntity;

import javax.swing.*;
import java.util.List;

public class JComboBoxCustom<T extends AbmEntity> extends JComboBox<T> {

    /**
     *
     */
    private static final long serialVersionUID = 6217263232018824029L;

    private ComboBoxModel<T> defaultListModel;

    public JComboBoxCustom() {
        super();
        defaultListModel = new DefaultComboBoxModel<T>();
        super.setModel(defaultListModel);
    }

    @SuppressWarnings("unchecked")
    public JComboBoxCustom(List<T> elements) {
        super((T[]) elements.toArray());
    }

    public void addAll(List<T> lista) {
        for (T elemento : lista) {
            this.add(elemento);
        }
    }

    public void cleanAndAddAll(List<T> lista) {
        this.defaultListModel = new DefaultComboBoxModel<T>();
        addAll(lista);
    }

    public void add(T elemento) {
        super.add(elemento);
    }

    @SuppressWarnings("unchecked")
    public T getSelectedElement() {
        return (T) this.defaultListModel.getSelectedItem();
    }


    public void setSelectedValue(T element) {
        this.defaultListModel.setSelectedItem(element);
    }
}
