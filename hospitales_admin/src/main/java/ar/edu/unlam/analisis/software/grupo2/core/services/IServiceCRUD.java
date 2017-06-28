package ar.edu.unlam.analisis.software.grupo2.core.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface IServiceCRUD<E, PK extends Serializable >{
	
	public Optional<E> findById(PK id);
	public List<E> findAll();
	public E save(E entity);
	public void delete(E entity);
	public void deleteById(PK id);

}
