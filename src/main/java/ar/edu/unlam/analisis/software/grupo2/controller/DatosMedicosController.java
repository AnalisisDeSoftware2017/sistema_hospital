package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.services.MedicoService;
import ar.edu.unlam.analisis.software.grupo2.ui.DatosMedicoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

/**
 * Created by sbogado on 6/6/17.
 */
@Controller
public class DatosMedicosController extends AbstractFrameController<DatosMedicoForm> {

    private MedicoService medicoService;


    @Autowired
    public DatosMedicosController(DatosMedicoForm datosMedicoForm, MedicoService medicoService){
        this.medicoService=medicoService;
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
        controllerAnterior.prepareAndOpenFrame();
    }

    private void ingresar(){
        Optional<Medico> optMedico = medicoService.findMedicoByCode(frame.getCodigoMed());
        if(optMedico.isPresent()){
            //TODO hacer que se muestren errores
        }else{
            Medico medico = new Medico();
            medico.setCodigo(frame.getCodigoMed());
            medico.setNombre(frame.getNombreMed());
            medicoService.saveMedico(medico);
        }
    }

    private void borrarCampos(){

    }
}
