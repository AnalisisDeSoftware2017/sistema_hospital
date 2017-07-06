package ar.edu.unlam.analisis.software.grupo2.core.dao;

import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sbogado on 7/5/17.
 */
@Repository
public interface SituacionDelPacienteDao extends CustomJpaRepository<SituacionDelPaciente, Long> {

    List<SituacionDelPaciente> findAllByMedico_Id(Long id);

    List<SituacionDelPaciente> findAllByPaciente_Id(Long id);


}
