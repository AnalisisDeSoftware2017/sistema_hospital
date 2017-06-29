package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstracttSearchReporteController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.data.MedicoData;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerPersonaFormSearch;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenReporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by seeb on 6/28/2017.
 */
@Controller
public class SearchReporteMedicoController extends AbstracttSearchReporteController<Medico, MedicoData> {

    @Autowired
    public SearchReporteMedicoController(AbstractContainerPersonaFormSearch<Medico, MedicoData> pantalla, AbstractListScreenReporte<Medico> listScreenReporte) {
        super(pantalla, listScreenReporte);
    }

    @Override
    protected void search() {
        this.cargarListaDePersonas(this.reporteDao.findAllMedicosByMedicoData(this.frame.getEntity()));
    }
}
