package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.EspecialidadService;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.MedicoService;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerSaveForm;
import ar.edu.unlam.analisis.software.grupo2.ui.impl.ContainerSaveMedicoForm;
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
public class SaveMedicoController extends AbstractEntitySaveController<Medico,Long> {

    @Autowired
    private EspecialidadService especialidadService;

    @Autowired
    public SaveMedicoController(AbstractServiceCRUD<Medico, Long> service, AbstractContainerSaveForm<Medico> form) {
        super(service, form);
    }


    @Override
    public void setEntity(Medico entity){
        this.frame.setEntity(entity);
        ((ContainerSaveMedicoForm)this.frame).setEspecialidadList(this.especialidadService.findAll());
    }

    @Override
    protected List<String> validateData(Medico entidad) {
        List<String> errores = new ArrayList<>();
        errores.addAll(this.validationsHelper.validarNombrePersona(entidad.getNombre()));
        errores.addAll(this.validationsHelper.validarApellidoDePersona(entidad.getApellido()));
        errores.addAll(this.validationsHelper.validarCodigoPersona(entidad.getCodigo()));
        Optional<Medico> optMedico =((MedicoService)service ).findMedicoByCode(entidad.getCodigo());
        if( optMedico.isPresent() &&  optMedico.get().getId().equals(this.frame.getEntity().getId())){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.codigoRepetidoPersona",null, AppContext.getLocale()));
        }
        return errores;
    }

}
