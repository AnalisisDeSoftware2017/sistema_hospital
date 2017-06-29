package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.exception.FailedLoginException;
import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.UserService;
import ar.edu.unlam.analisis.software.grupo2.ui.LoginJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 5/8/17.
 */
@Controller
public class LoginController extends AbstractFrameController<LoginJFrame> {

    private  MainMenuController mainMenuController;

    private UserService userService;

    @Autowired
    public LoginController(LoginJFrame loginJFrame, UserService userService, MainMenuController mainMenuController){
        this.frame = loginJFrame;
        this.userService = userService;
        this.mainMenuController = mainMenuController;
    }

    public void prepareAndOpenFrame() {
        frame.setVisible(true);
        registerClickAction(frame.getButtonIngresar(), (e)->login());
        registerEnterKeyAction(frame.getPasswordBox(), ()->login());
        registerEnterKeyAction(frame.getUserNameBox(), ()->login());
    }


    public void login(){
        User user = new User();
        user.setUsername(frame.getUsuario());
        user.setPassword(frame.getPass());
        try {
            userService.loginUser(user);
            mainMenuController.setControllerAnterior(this);
            mainMenuController.setVisible(true);
            this.setVisible(false);
        } catch (FailedLoginException e) {
            e.printStackTrace();
        }
    }

}
