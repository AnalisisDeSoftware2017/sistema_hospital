package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.TipoDocumentoEnum;
import ar.edu.unlam.analisis.software.grupo2.data.MedicoData;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractPersonaFormSearch;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sbogado on 6/28/17.
 */
@Component
public class MedicoFormSearch extends AbstractPersonaFormSearch<Medico, MedicoData> {

    private JComboBox cmbEspecialidad;

    public MedicoFormSearch() {
        super();
        JLabel lblEspecialidad = new JLabel("Especialidad:");
        lblEspecialidad.setForeground(Color.RED);
        lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
        lblEspecialidad.setBounds(481, 454, 178, 16);
        add(lblEspecialidad);

        cmbEspecialidad = new JComboBox();
        cmbEspecialidad.setBounds(482, 481, 284, 27);
        add(cmbEspecialidad);

        this.setVisible(true);
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


    @Override
    public void setTexto() {
        super.setTexto();

    }


}
