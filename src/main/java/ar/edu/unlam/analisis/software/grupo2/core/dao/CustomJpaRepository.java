package ar.edu.unlam.analisis.software.grupo2.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.Optional;

@NoRepositoryBean
public interface CustomJpaRepository<E, PK extends Serializable> extends JpaRepository<E, PK> { //, QueryDslPredicateExecutor<E> {

    Optional<E> findById(PK id);


}
