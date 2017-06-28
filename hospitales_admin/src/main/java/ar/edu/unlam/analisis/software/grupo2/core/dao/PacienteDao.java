package ar.edu.unlam.analisis.software.grupo2.core.dao;

import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by sbogado on 6/6/17.
 */
@Repository
public interface PacienteDao extends CustomJpaRepository<Paciente, Long>{

    Optional<Paciente> findPacienteById(Long id);
    Optional<Paciente> findPacienteByCodigo(String codigo);


}
