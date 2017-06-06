package ar.edu.unlam.analisis.software.grupo2.core.dao;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CustomJpaRepository <E,PK extends Serializable> extends JpaRepository<E,PK> {
	
	Optional<E> findById(PK id);

}
