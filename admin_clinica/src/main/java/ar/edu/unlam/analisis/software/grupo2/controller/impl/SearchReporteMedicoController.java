package ar.edu.unlam.analisis.software.grupo2.controller.impl;

import ar.edu.unlam.analisis.software.grupo2.controller.AbstracttSearchReporteController;
import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.EspecialidadService;
import ar.edu.unlam.analisis.software.grupo2.data.MedicoData;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractContainerPersonaFormSearch;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractListScreenReporte;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractPersonaDetails;
import ar.edu.unlam.analisis.software.grupo2.ui.impl.ContainerMedicoFormSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by seeb on 6/28/2017.
 */
@Controller
public class SearchReporteMedicoController extends AbstracttSearchReporteController<Medico, MedicoData> {


    private EspecialidadService especialidadService;

    @Autowired
    public SearchReporteMedicoController(AbstractContainerPersonaFormSearch<Medico, MedicoData> pantalla, AbstractListScreenReporte<Medico> listScreenReporte, EspecialidadService especialidadService, AbstractPersonaDetails<Medico> details) {
        super(pantalla, listScreenReporte, details);
        this.especialidadService = especialidadService;
        ((ContainerMedicoFormSearch) frame).setEspecialidades(especialidadService.findAll());
    }

    @Override
    protected List<SituacionDelPaciente> findListaDeSituaciones(Medico entity) {
        return situacionDelPacienteService.findAllByMedico(entity);
    }

    @Override
    protected void search() {
        this.cargarListaDePersonas(this.reporteDao.findAllMedicosByMedicoData(this.frame.getEntity()));
    }
}
