package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstracttSearchReporteController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.data.PacienteData;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerPersonaFormSearch;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenReporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by seeb on 6/28/2017.
 */
@Controller
public class SearchReportePacienteController extends AbstracttSearchReporteController<Paciente, PacienteData> {

    @Autowired
    public SearchReportePacienteController(AbstractContainerPersonaFormSearch<Paciente, PacienteData> pantalla, AbstractListScreenReporte<Paciente> listScreenReporte) {
        super(pantalla, listScreenReporte);
    }

    @Override
    protected void search() {
        this.cargarListaDePersonas(this.reporteDao.findAllPacientesByPacienteData(this.frame.getEntity()));
    }
}
