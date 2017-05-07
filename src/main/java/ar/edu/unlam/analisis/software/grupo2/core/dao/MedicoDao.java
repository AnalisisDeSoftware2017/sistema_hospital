package ar.edu.unlam.analisis.software.grupo2.core.dao;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by sbogado on 07/05/17.
 */
public interface MedicoDao extends JpaRepository<Medico, Long> {
    Optional<Medico> findMedicoById(Long id);

}
