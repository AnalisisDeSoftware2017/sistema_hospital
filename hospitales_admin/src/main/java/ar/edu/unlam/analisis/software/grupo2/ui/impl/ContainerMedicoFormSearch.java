package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.data.MedicoData;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerPersonaFormSearch;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractPersonaFormSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sbogado on 6/28/17.
 */


@Component
public class ContainerMedicoFormSearch extends AbstractContainerPersonaFormSearch<Medico, MedicoData> {


    @Autowired
    public ContainerMedicoFormSearch(AbstractPersonaFormSearch<Medico, MedicoData> form) {
        super(form);
    }

}
