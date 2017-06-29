package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.TipoDocumentoEnum;
import ar.edu.unlam.analisis.software.grupo2.data.MedicoData;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractPersonaFormSearch;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * Created by sbogado on 6/28/17.
 */
@Component
public class MedicoFormSearch extends AbstractPersonaFormSearch<Medico, MedicoData> {

    private JComboBox cmbEspecialidad;

    public MedicoFormSearch() {

        JLabel lblEspecialidad = new JLabel("Especialidad:");
        lblEspecialidad.setBounds(274, 403, 95, 16);
        add(lblEspecialidad);

        cmbEspecialidad = new JComboBox();
        cmbEspecialidad.setBounds(267, 431, 284, 27);
        add(cmbEspecialidad);
    }


    @Override
    public MedicoData getEntity() {
        MedicoData medicoData = new MedicoData();
        medicoData.setApellido(this.txtApellido.getText());
        medicoData.setNombre(this.txtNombre.getText());
        medicoData.setCodigo(this.txtCodigo.getText());
        medicoData.setNumeroDocumento(this.txtNumeroDeDocumento.getText());
        medicoData.setTipoDocumento(this.cbTipoDocumento.getSelectedIndex() == 0 ? null : (TipoDocumentoEnum) this.cbTipoDocumento.getSelectedItem());
        medicoData.setEspecialidad(this.cmbEspecialidad.getSelectedIndex() == 0 ? null : (Especialidad) this.cmbEspecialidad.getSelectedItem());
        return medicoData;
    }


}
