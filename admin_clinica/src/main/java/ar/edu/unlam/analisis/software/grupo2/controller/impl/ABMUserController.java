package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractABMController;
import ar.edu.unlam.analisis.software.grupo2.controller.AbstractEntitySaveController;
import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.AbstractServiceCRUD;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenABM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 6/6/17.
 */
@Controller
public class ABMUserController extends AbstractABMController<User, Long> {

    @Autowired
    public ABMUserController(AbstractListScreenABM<User> pantalla, AbstractEntitySaveController<User, Long> entitySaveController, AbstractServiceCRUD<User, Long> service) {
        super(pantalla, entitySaveController, service);
    }


}
