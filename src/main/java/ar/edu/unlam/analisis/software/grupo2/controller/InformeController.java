package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.services.UserService;
import ar.edu.unlam.analisis.software.grupo2.ui.InformesForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 5/17/17.
 */
@Controller
public class InformeController extends AbstractFrameController<InformesForm>{


    private  MainMenuController mainMenuController;

    private UserService userService;

    @Autowired
    public InformeController(InformesForm informesForm, UserService userService, MainMenuController mainMenuController){
        this.frame = informesForm;
        this.userService = userService;
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
