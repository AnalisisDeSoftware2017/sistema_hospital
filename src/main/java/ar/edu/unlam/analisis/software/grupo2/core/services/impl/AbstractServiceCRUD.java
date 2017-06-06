package ar.edu.unlam.analisis.software.grupo2.core.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import ar.edu.unlam.analisis.software.grupo2.core.dao.CustomJpaRepository;
import ar.edu.unlam.analisis.software.grupo2.core.services.IServiceCRUD;

public abstract class AbstractServiceCRUD<E, PK extends Serializable> implements IServiceCRUD<E, PK> {

	@Autowired
    private CustomJpaRepository<E, PK> dao;

    protected CustomJpaRepository<E, PK> getDAO() {
        return dao;
    }
	
	@Override
	public Optional<E> findById(PK id) {
		
		return dao.findById(id);
	}

	@Override
	public List<E> findAll() {
		return dao.findAll();
	}

	@Override
	public E save(E entity) {
		return dao.save(entity);
	}

	@Override
	public void delete(E entity) {
		dao.delete(entity);
	}

	@Override
	public void deleteById(PK id) {
		dao.delete(id);
	}

}
