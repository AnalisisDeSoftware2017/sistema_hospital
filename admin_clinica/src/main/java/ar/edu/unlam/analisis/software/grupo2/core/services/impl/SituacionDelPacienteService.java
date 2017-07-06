package ar.edu.unlam.analisis.software.grupo2.core.services.impl;

import ar.edu.unlam.analisis.software.grupo2.core.dao.SituacionDelPacienteDao;
import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sbogado on 6/6/17.
 */
@Service
public class SituacionDelPacienteService extends AbstractServiceCRUD<SituacionDelPaciente, Long> {

    public List<SituacionDelPaciente> findAllByMedico(Medico entity) {
        return ((SituacionDelPacienteDao) getDAO()).findAllByMedico_Id(entity.getId());
    }

    public List<SituacionDelPaciente> findAllByPaciente(Paciente entity) {
        return ((SituacionDelPacienteDao) getDAO()).findAllByPaciente_Id(entity.getId());
    }
}
