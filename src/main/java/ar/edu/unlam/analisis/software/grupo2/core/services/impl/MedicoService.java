package ar.edu.unlam.analisis.software.grupo2.core.services.impl;

import ar.edu.unlam.analisis.software.grupo2.core.dao.MedicoDao;
import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by sbogado on 4/24/17.
 */
@Service
public class MedicoService extends AbstractServiceCRUD<Medico,Long> {

    public Optional<Medico> findMedicoByCode(String code){
        MedicoDao dao = (MedicoDao)getDAO();
        return dao.findMedicoByCodigo(code);
    }


}
