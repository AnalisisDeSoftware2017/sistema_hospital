package ar.edu.unlam.analisis.software.grupo2.core.services;

import ar.edu.unlam.analisis.software.grupo2.core.dao.MedicoDao;
import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by sbogado on 4/24/17.
 */
@Service
public class MedicoService {


    @Autowired
    private MedicoDao medicoDao;


    public Medico saveMedico(Medico medico){
        return medicoDao.save(medico);
    }

    public Optional<Medico> findMedicoByCode(String code){
        return medicoDao.findMedicoByCodigo(code);
    }


}
