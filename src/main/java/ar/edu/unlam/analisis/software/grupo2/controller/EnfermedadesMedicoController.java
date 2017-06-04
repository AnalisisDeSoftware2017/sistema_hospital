package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.exception.FailedLoginException;
import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import ar.edu.unlam.analisis.software.grupo2.core.services.MedicoService;
import ar.edu.unlam.analisis.software.grupo2.core.services.UserService;
import ar.edu.unlam.analisis.software.grupo2.ui.EnfermedadesMedicoForm;
import ar.edu.unlam.analisis.software.grupo2.ui.LoginJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 5/17/17.
 */
@Controller
public class EnfermedadesMedicoController extends AbstractFrameController<EnfermedadesMedicoForm>{

    private  MainMenuController mainMenuController;
    private MedicoService userService;
    private MedicoService medicoService;

    @Autowired
    public EnfermedadesMedicoController(EnfermedadesMedicoForm enfermedadesMedicoForm, MedicoService medicoService, MainMenuController mainMenuController){
        this.frame = enfermedadesMedicoForm;
        this.userService = medicoService;
        this.mainMenuController = mainMenuController;
    }

    public void prepareAndOpenFrame() {
        frame.setVisible(true);
        /*registerClickAction(frame.getButtonIngresar(), (e)->login());
        registerEnterKeyAction(frame.getPasswordBox(), ()->login());
        registerEnterKeyAction(frame.getUserNameBox(), ()->login());*/
    }

    /*public void login(){
        User user = new User();
        user.setUsername(frame.getUsuario());
        user.setPassword(frame.getPass());
        try {
            userService.loginUser(user);
            mainMenuController.setControllerAnterior(this);
            mainMenuController.prepareAndOpenFrame();
            this.setVisible(false);
        } catch (FailedLoginException e) {
            e.printStackTrace();
        }
    }*/



}
