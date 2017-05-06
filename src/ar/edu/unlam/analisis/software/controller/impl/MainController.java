package ar.edu.unlam.analisis.software.controller.impl;

import ar.edu.unlam.analisis.software.controller.IController;
import ar.edu.unlam.analisis.software.utils.Menu;
import ar.edu.unlam.analisis.software.views.Login;

import java.awt.EventQueue;
import java.io.IOException;

/**
 * Created by sbogado on 4/25/17.
 */
public class MainController implements IController {

    //private static final Logger logger = Logger.getLogger(String.valueOf(MainController.class));
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

    @Override
    public void runController() throws Exception {
        /*try {
            String option = this.menu.getOptionFromMenu();

            switch (option){

                case "1": runIngresoDatos(); break;
                case "2": runInformes(); break;
                case "3": salir(); break;
                default: break;
            }

        } catch (IOException e) {
            System.out.println("Error al leer la opcion ingresada. Intentelo nuevamente, En caso de persistir el error. Reinicie la aplicacion");
            System.exit(1);
        }*/
    	
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true); //Hace visible el login.
			}
		});
    }

    private void salir() {
        System.out.println("Muchas gracias poir utilizar el sistema");
        System.exit(0);
    }

    private void runInformes() throws Exception {
        InformesController.getInstance(this).runController();
    }

    private void runIngresoDatos() {
        IngresosController.getInstance(this).runController();
    }
}
