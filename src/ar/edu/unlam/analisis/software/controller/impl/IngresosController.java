package ar.edu.unlam.analisis.software.controller.impl;

import ar.edu.unlam.analisis.software.controller.IController;
import ar.edu.unlam.analisis.software.model.Medico;
import ar.edu.unlam.analisis.software.model.Paciente;
import ar.edu.unlam.analisis.software.model.SituaciondDelPaciente;
import ar.edu.unlam.analisis.software.utils.AppUtils;
import ar.edu.unlam.analisis.software.utils.Menu;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static ar.edu.unlam.analisis.software.utils.AppUtils.LeerCadena;

/**
 * Created by sbogado on 4/25/17.
 */
public class IngresosController implements IController {

    private IController controllerAnterior;
    private static IngresosController instance;

    private final static String[] MENU={"1.  Datos del paciente", "2.  Situacion del paciente ", "3.  Datos del medico","4.  Anterior "};
    private final static String[] ENCABEZADO =
            {   "   ...............................................",
                "   :-: -I N G R E S O  D E  P A C I E N T E S- :-:",
                ":-:.........................................:-:"};
    private final static String DECORADOR_LINEA = ":-:";
    private final static String [] PIE ={"   .............................................."};
    private final static String DECORADOR_OPCIONES= "   :-:";
    private Menu menu;

    private IngresosController(IController controllerAnterior){
        this.controllerAnterior = controllerAnterior;
        try {
            this.menu = new Menu(MENU,ENCABEZADO,PIE,DECORADOR_LINEA, DECORADOR_OPCIONES, "\\."  );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static IngresosController getInstance(IController controllerAnterior){
        if(instance == null){
            instance = new IngresosController(controllerAnterior);
        }
        return instance;
    }

    @Override
    public void runController() {
        try {
            String opt = menu.getOptionFromMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void ingresarDatosDelPaciente() throws IOException {
        //TODO: cambiar esto y lanzar una excepcion con un mensaje conveniente
        DataOutputStream output=new DataOutputStream (new FileOutputStream("C:\\datopac.txt"));
        Boolean ingresaOtro = false;
        try{
            do{
                Paciente paciente = new Paciente();
                System.out.println("   ..............................................."+"\n");
                System.out.println("   :-:  - D A T O S  D E L  P A C I E N T E -  :-:"+"\n");
                System.out.println("   :-:.........................................:-:"+"\n");
                System.out.println("Digite el codigo del paciente: ");
                paciente.setCodigo(LeerCadena());
                System.out.println("Digite el nombre del paciente: ");
                paciente.setNombre(LeerCadena());
                //TODO ver si se puede hacer con un properties

                    output.writeUTF(paciente.toString());
                    System.out.println("Desea ingresar otro paciente? S/N"+"\n");
                    ingresaOtro = "S".equals(AppUtils.LeerCadena());
            }while(ingresaOtro);
        } catch (IOException e) {
            //TODO throw exception
            e.printStackTrace();
        }finally {
            //TODO throw exception
            output.close();
        }
    }


    private void ingresarDatosDelMedico() throws IOException {
        //TODO: cambiar esto y lanzar una excepcion con un mensaje conveniente
        DataOutputStream output=new DataOutputStream (new FileOutputStream("C:\\datopac.txt"));
        Boolean ingresaOtro = false;
        try{
            do{
                Medico medico = new Medico();
                System.out.println("   ..............................................."+"\n");
                System.out.println("   :-:  - D A T O S  D E L  M E D I C O     -  :-:"+"\n");
                System.out.println("   :-:.........................................:-:"+"\n");
                System.out.println("Digite el codigo del medico: ");
                medico.setCodigo(LeerCadena());
                System.out.println("Digite el nombre del medico: ");
                medico.setNombre(LeerCadena());
                System.out.println("Digite la especializacion del medico: ");
                medico.setEspecialidad(LeerCadena());
                //TODO ver si se puede hacer con un properties
                output.writeUTF(medico.toString());
                System.out.println("Desea ingresar otro paciente? S/N"+"\n");
                ingresaOtro = "S".equals(AppUtils.LeerCadena());
            }while(ingresaOtro);
        } catch (IOException e) {
            //TODO throw exception
            e.printStackTrace();
        }finally {
            //TODO throw exception
            output.close();
        }
    }


    private void ingresarSituacionDelPaciente() throws FileNotFoundException {
        DataOutputStream output=new DataOutputStream (new FileOutputStream("C:\\datopac.txt"));
        Boolean ingresaOtro = false;
        try {
             do{
                 SituaciondDelPaciente situaciondDelPaciente = new SituaciondDelPaciente();
                 System.out.println("   .....................................................");
                 System.out.println("   :-: - S I T U A C I O N  D E L  P A C I E N T E - :-:");
                 System.out.println("   :-:...............................................:-:");
                 System.out.println("Digite el codigo del paciente: ");
                 situaciondDelPaciente.setCodigoPaciente(LeerCadena());
                 //TODO buscar paciente
                 System.out.println("Digite el codigo del medico: ");
                 situaciondDelPaciente.setCodigoMedico(LeerCadena());
                 //TODO buscar medico
                 System.out.println("Digite el diagnostico del medico: ");
                 situaciondDelPaciente.setDiagnostico(LeerCadena());
                 //TODO ver si se puede hacer con un properties
                 output.writeUTF(situaciondDelPaciente.toString());
                 System.out.println("Desea ingresar otro diagnostico? S/N" + "\n");
                 ingresaOtro = "S".equals(AppUtils.LeerCadena());
             }while(ingresaOtro);
        }catch(IOException e){
            e.printStackTrace();

        }






    }


}
