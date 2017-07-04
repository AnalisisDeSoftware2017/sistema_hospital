package com.tssa.gilbco.pmob;

import com.tssa.gilbco.pmob.ui.Pantalla;
import com.tssa.gilbco.pmob.utils.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

/**
 * Created by sbogado on 04/11/2016.
 */
@SpringBootApplication
public class Main {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Main.class)
                .headless(false)
                .web(false)
                .run(args);
        JFrame pantalla = context.getBean(Pantalla.class);
        pantalla.setVisible(true);
    }
}
