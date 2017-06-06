package ar.edu.unlam.analisis.software.grupo2.core.services;

import ar.edu.unlam.analisis.software.grupo2.core.dao.PacienteDao;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by sbogado on 4/24/17.
 */
@Service
public class PacienteService {

    @Autowired
    private PacienteDao pacienteDao;

    public Paciente savePaciente(Paciente paciente) {
        return pacienteDao.save(paciente);
    }

    public Optional<Paciente> findPacienteByCode(String codigoMed) {
        return pacienteDao.findPacienteByCodigo(codigoMed);
    }
}
