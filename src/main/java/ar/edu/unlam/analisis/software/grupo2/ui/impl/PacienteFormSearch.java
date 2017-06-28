package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.model.TipoDocumentoEnum;
import ar.edu.unlam.analisis.software.grupo2.data.PacienteData;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractPersonaFormSearch;
import org.springframework.stereotype.Component;

/**
 * Created by sbogado on 6/28/17.
 */
@Component
public class PacienteFormSearch extends AbstractPersonaFormSearch<Paciente, PacienteData> {
    @Override
    public PacienteData getEntity() {
        PacienteData pacienteData = new PacienteData();
        pacienteData.setApellido(this.txtApellido.getText());
        pacienteData.setNombre(this.txtNombre.getText());
        pacienteData.setCodigo(this.txtCodigo.getText());
        pacienteData.setNumeroDocumento(this.txtNumeroDeDocumento.getText());
        pacienteData.setTipoDocumento(this.cbTipoDocumento.getSelectedIndex() == 0 ? null : (TipoDocumentoEnum) this.cbTipoDocumento.getSelectedItem());
        return pacienteData;
    }
}
