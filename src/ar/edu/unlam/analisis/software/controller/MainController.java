package ar.edu.unlam.analisis.software.controller;

import ar.edu.unlam.analisis.software.utils.Menu;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by sbogado on 4/25/17.
 */
public class MainController implements IController{

    private static final Logger logger = Logger.getLogger(String.valueOf(MainController.class));
    private final static String[] MENU={"1-  Ingreso de datos", "2-  Informes", "3-  Salir"};
    private final static String[] ENCABEZADO =
                                                {
                                                "   ..............................................",
                                                "   :-:        C E N T R O  M E D I C O        :-:",
                                                "   :-:   >>>> L O S  L A U R E L E S <<<<     :-:",
                                                "   :-:  C O N T R O L  D E  P A C I E N T E S :-:",
                                                "   :-:........................................:-:"};
    private final static String DECORADOR_LINEA = ":-:";
    private final static String [] PIE ={"   .............................................."};
    private final static String DECORADOR_OPCIONES= "   :-:";


    private static MainController instance;
    private Menu menu;

    private MainController(){
        try {
            this.menu = new Menu(MENU,ENCABEZADO,PIE,DECORADOR_LINEA, DECORADOR_OPCIONES, "-"  );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MainController getInstance(){
        if(instance==null){
            instance=new MainController();
        }
        return instance;
    }

    public void runController() {
        try {
            String option = this.menu.getOptionFromMenu();
        } catch (IOException e) {
            System.out.println("Error al leer la opcion ingresada. Intentelo nuevamente, En caso de persistir el error. Reinicie la aplicacion");
            System.exit(1);
        }
    }
}
