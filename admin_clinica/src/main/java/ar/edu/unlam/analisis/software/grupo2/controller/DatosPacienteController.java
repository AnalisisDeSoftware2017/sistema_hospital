package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.PacienteService;
import ar.edu.unlam.analisis.software.grupo2.ui.DatosMedicoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

/**
 * Created by sbogado on 6/6/17.
 */
@Controller
public class DatosPacienteController extends AbstractFrameController<DatosMedicoForm> {

    private PacienteService pacienteService;


    @Autowired
    public DatosPacienteController(DatosMedicoForm datosMedicoForm, PacienteService pacienteService){
        this.pacienteService =pacienteService;
        this.frame=datosMedicoForm;
    }


    @Override
    public void prepareAndOpenFrame() {

        registerClickAction(frame.getAnterior(), (e)->irAPantallaAnterior());
        registerEnterKeyAction(frame.getAnterior(), ()->irAPantallaAnterior());

        registerClickAction(frame.getBorrarC(), (e)->borrarCampos());
        registerEnterKeyAction(frame.getBorrarC(), ()->borrarCampos());

        registerClickAction(frame.getIngresarBtn(), (e)->ingresar());
        registerEnterKeyAction(frame.getIngresarBtn(), ()->ingresar());

        frame.setVisible(true);

    }



    private void irAPantallaAnterior() {
        frame.setVisible(false);
        controllerAnterior.setVisible(true);
    }

    private void ingresar(){
        Optional<Paciente> optPaciente = pacienteService.findPacienteByCode(frame.getCodigoMed());
        if(optPaciente.isPresent()){
            //TODO hacer que se muestren errores
        }else{
            Paciente paciente = new Paciente();
            paciente.setCodigo(frame.getCodigoMed());
            paciente.setNombre(frame.getNombreMed());
            pacienteService.savePaciente(paciente);
        }
    }

    private void borrarCampos(){

    }
}
