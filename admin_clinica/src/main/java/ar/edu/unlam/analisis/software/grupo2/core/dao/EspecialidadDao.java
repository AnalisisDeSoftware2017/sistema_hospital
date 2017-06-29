package ar.edu.unlam.analisis.software.grupo2.core.dao;

import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sbogado on 6/6/17.
 */
@Repository
public interface EspecialidadDao extends CustomJpaRepository<Especialidad, Long>{
}
