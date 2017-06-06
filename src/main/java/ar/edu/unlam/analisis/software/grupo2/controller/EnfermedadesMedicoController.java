package ar.edu.unlam.analisis.software.grupo2.controller;

import ar.edu.unlam.analisis.software.grupo2.core.services.MedicoService;
import ar.edu.unlam.analisis.software.grupo2.ui.EnfermedadesMedicoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sbogado on 5/17/17.
 */
@Controller
public class EnfermedadesMedicoController extends AbstractFrameController<EnfermedadesMedicoForm>{

    private  MainMenuController mainMenuController;
    private MedicoService userService;
    private MedicoService medicoService;

    @Autowired
    public EnfermedadesMedicoController(EnfermedadesMedicoForm enfermedadesMedicoForm, MedicoService medicoService, MainMenuController mainMenuController){
        this.frame = enfermedadesMedicoForm;
        this.userService = medicoService;
        this.mainMenuController = mainMenuController;
    }

    public void prepareAndOpenFrame() {
        registerClickAction(frame.getAnterior(), (event)->anterior());
        registerClickAction(frame.getBorrarC(), (event)->borrarC());

        registerClickAction(frame.getConsultarBtn(), (event)->consultar());
        registerEnterKeyAction(frame.getAnterior(), ()->anterior());

        registerEnterKeyAction(frame.getBorrarC(), ()->borrarC());
        registerEnterKeyAction(frame.getConsultarBtn(), ()->consultar());
        frame.setVisible(true);
    }

    @Override
    protected void setTextoFrame() {

    }

    private void consultar() {

    }

    private void borrarC() {

    }

    private void anterior() {

    }


}
