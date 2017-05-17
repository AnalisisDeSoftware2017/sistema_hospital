package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstractFrameController;
import ar.edu.unlam.analisis.software.grupo2.core.exception.UserNotFindException;
import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import ar.edu.unlam.analisis.software.grupo2.core.services.UserService;
import ar.edu.unlam.analisis.software.grupo2.ui.LoginJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by sbogado on 5/8/17.
 */
@Controller
public class MainMenuController extends AbstractFrameController {

    private LoginJFrame loginJFrame;

    private UserService userService;

    @Autowired
    public MainMenuController(LoginJFrame loginJFrame, UserService userService){
        this.loginJFrame = loginJFrame;
        this.userService = userService;
    }

    public void prepareAndOpenFrame() {
        loginJFrame.setVisible(true);
        registerClickAction(loginJFrame.getButtonIngresar(), (e)->login());
        registerKeyAction(loginJFrame.getPasswordBox(), keyListenerPressedEnter());
        registerKeyAction(loginJFrame.getUserNameBox(), keyListenerPressedEnter());
    }


    private KeyAdapter keyListenerPressedEnter() {
        return new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char cTeclaPresionada=e.getKeyChar();
                // da click al detectar la tecla ENTER.
                if(cTeclaPresionada==KeyEvent.VK_ENTER){
                    login();
                }
            }
        };
    }

    public void login(){
        User user = new User();
        user.setUsername(loginJFrame.getUsuario());
        user.setPassword(loginJFrame.getPass());
        try {
            userService.loginUser(user);
            System.out.println("Existe el usuario");
        } catch (UserNotFindException e) {
            e.printStackTrace();
        }
    }






}
