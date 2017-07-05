package ar.edu.unlam.analisis.software.grupo2.core.dao;

import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import org.springframework.stereotype.Repository;

/**
 * Created by sbogado on 7/5/17.
 */
@Repository
public interface SituacionDelPacienteDao extends CustomJpaRepository<SituacionDelPaciente, Long> {

}
