package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.UserService;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerSaveForm;
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
    protected List<String> validateData(User entidad) {
        List<String> errores = new ArrayList<>();
        errores.addAll(this.validationsHelper.validarNombrePersona(entidad.getNombre()));
        errores.addAll(this.validationsHelper.validarApellidoDePersona(entidad.getApellido()));
        errores.addAll(this.validationsHelper.validarPassword(entidad.getPassword()));
        errores.addAll(this.validationsHelper.validarUsername(entidad.getUsername()));

        Optional<User> optMedico =((UserService)service ).findUserByUsername(entidad.getUsername());
        if( optMedico.isPresent() &&  optMedico.get().getId().equals(this.frame.getEntity().getId())){
            errores.add(messageSource.getMessage("ar.edu.unlam.los.laureles.error.usernameRepetido",null, AppContext.getLocale()));
        }
        return errores;
    }
}
