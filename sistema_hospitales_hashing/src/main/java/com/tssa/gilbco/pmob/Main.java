package com.tssa.gilbco.pmob;

import com.tssa.gilbco.pmob.utils.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by sbogado on 04/11/2016.
 */
@SpringBootApplication
public class Main {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(Main.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);

        Main app = context.getBean(Main.class);
        app.start(args);
    }

    private void start(String[] args) {
        if(args.length!= 1){
            System.out.println("Error, la cantidad de parametros debe ser 1");
            return;
        }
        if( args[0].equals("-h") ){
            imprimirAyuda();
            return;
        }
        System.out.println("La password es: \t" + userService.hashPassword(args[0]));
        return;
    }

    private void imprimirAyuda() {
        System.out.println( "Este ejecutable funciona de la siguiente forma:\n"+
                            "run 'password_a_encodear' \n"+
                            "Esto devuelve la password hasheada.");

    }
}
