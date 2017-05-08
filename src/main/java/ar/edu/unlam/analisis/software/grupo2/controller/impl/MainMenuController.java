package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.ui.LoginJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 5/8/17.
 */
@Controller
public class MainMenuController {

    private LoginJFrame loginJFrame;

    @Autowired
    public MainMenuController(LoginJFrame loginJFrame){
        this.loginJFrame = loginJFrame;
    }

    public void prepareAndOpenFrame() {
        loginJFrame.setVisible(true);
    }

}
