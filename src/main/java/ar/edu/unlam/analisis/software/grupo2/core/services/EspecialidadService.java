package ar.edu.unlam.analisis.software.grupo2.core.services;

import ar.edu.unlam.analisis.software.grupo2.core.dao.EspecialidadDao;
import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sbogado on 6/6/17.
 */
@Service
public class EspecialidadService {


    @Autowired
    private EspecialidadDao especialidadDao;

    List<Especialidad> findAllEspecialidades(){
        return especialidadDao.findAll();
    }

}
