package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.PacienteService;
import ar.edu.unlam.analisis.software.grupo2.ui.SaveForm;
import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
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
        if(entidad.getNombre()==null || entidad.getNombre().isEmpty()){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.nombrePersona", null, AppContext.getLocale()));
        }
        if(entidad.getApellido()==null || entidad.getApellido().isEmpty()){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.apellidoPersona",null,AppContext.getLocale()));
        }
        if(entidad.getCodigo()==null || entidad.getCodigo().isEmpty()){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.codigoPersona",null,AppContext.getLocale()));
        }
        if(entidad.getNumeroDocumento()==null || entidad.getNumeroDocumento().isEmpty()){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.codigoRepetidoPersona",null,AppContext.getLocale()));
        }else{
            if(!documentValid()){
                errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.numeroDocumentoNoValido",null, AppContext.getLocale()));
            }
        }
        Optional<Paciente> optPaciente =((PacienteService)service ).findPacienteByCode(entidad.getCodigo());
        if( optPaciente.isPresent() &&  optPaciente.get().getId().equals(this.frame.getEntity().getId())){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.codigoRepetidoPersona",null, AppContext.getLocale()));
        }
        return errores;
    }

    private boolean documentValid() {
        return true;
    }
}
