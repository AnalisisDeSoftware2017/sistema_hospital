package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.PacienteService;
import ar.edu.unlam.analisis.software.grupo2.ui.SaveForm;
import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import ar.edu.unlam.analisis.software.grupo2.utils.ValidationsHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by sbogado on 6/6/17.
 */
@Controller
public class SavePacienteController extends AbstractEntitySaveController<Paciente,Long> {

    private static final int LONG_CODIGO = 20;
    private static final int LONG_NOMBRE = 40;
    private static final int LONG_APELLIDO = 40;

    @Autowired
    public SavePacienteController(AbstractServiceCRUD<Paciente, Long> service, SaveForm<Paciente> form) {
        super(service, form);
    }

    @Override
    protected void setTextoFrame() {

    }


    @Override
    protected List<String> validateData(Paciente entidad) {
        List<String> errores = new ArrayList<>();
        errores.addAll(this.validationsHelper.validarNombrePersona(entidad.getNombre()));
        errores.addAll(this.validationsHelper.validarApellidoDePersona(entidad.getApellido()));
        errores.addAll(this.validationsHelper.validarCodigoPersona(entidad.getCodigo()));
        Optional<Paciente> optPaciente =((PacienteService)service ).findPacienteByCode(entidad.getCodigo());
        if( optPaciente.isPresent() &&  optPaciente.get().getId().equals(this.frame.getEntity().getId())){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.codigoRepetidoPersona",null, AppContext.getLocale()));
        }
        return errores;
    }
}
