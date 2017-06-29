package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerSaveForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sbogado on 6/6/17.
 */
@Controller
public class SaveUserController extends AbstractEntitySaveController<User, Long> {


    @Autowired
    public SaveUserController(AbstractServiceCRUD<User, Long> service, AbstractContainerSaveForm<User> form) {
        super(service, form);
    }


    @Override
    public void setEntity(User entity) {
        this.frame.setEntity(entity);
    }

    @Override
    protected List<String> validateData(User entity) {
        return new ArrayList<>();
    }

  /*  @Override
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
    }*/

}
