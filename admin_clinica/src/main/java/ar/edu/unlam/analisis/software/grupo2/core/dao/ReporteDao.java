package ar.edu.unlam.analisis.software.grupo2.core.dao;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.data.MedicoData;
import ar.edu.unlam.analisis.software.grupo2.data.PacienteData;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by sbogado on 6/28/17.
 */
@Repository("reporteDao")
@Transactional
public class ReporteDao {

    @PersistenceContext
    private EntityManager entityManager;



    public List<Medico> findAllMedicosByMedicoData(MedicoData medicoData) {
        Session session = entityManager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Medico.class);
        if (null != medicoData.getEspecialidad()) {
            criteria.createAlias("especialidades", "e1");
            criteria.add(Restrictions.eq("e1.id", medicoData.getEspecialidad().getId()));
        }

        if (null != medicoData.getApellido() && !medicoData.getApellido().isEmpty()) {
            criteria.add(Restrictions.eq("apellido", medicoData.getApellido()));
        }

        if (null != medicoData.getNombre() && !medicoData.getNombre().isEmpty()) {
            criteria.add(Restrictions.eq("nombre", medicoData.getNombre()));
        }

        if (null != medicoData.getTipoDocumento()) {
            criteria.add(Restrictions.eq("tipoDocumento", medicoData.getTipoDocumento()));
        }

        if (null != medicoData.getNumeroDocumento() && !medicoData.getNumeroDocumento().isEmpty()) {
            criteria.add(Restrictions.eq("numeroDocumento", medicoData.getNumeroDocumento()));
        }

        if (null != medicoData.getCodigo() && !medicoData.getCodigo().isEmpty()) {
            criteria.add(Restrictions.eq("codigo", medicoData.getCodigo()));
        }
        return criteria.list();

    }

    public List<Paciente> findAllPacientesByPacienteData(PacienteData pacienteData) {
        Session session = entityManager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Paciente.class);

        if (null != pacienteData.getApellido() && !pacienteData.getApellido().isEmpty()) {
            criteria.add(Restrictions.eq("apellido", pacienteData.getApellido()));
        }

        if (null != pacienteData.getNombre() && !pacienteData.getNombre().isEmpty()) {
            criteria.add(Restrictions.eq("nombre", pacienteData.getNombre()));
        }

        if (null != pacienteData.getTipoDocumento()) {
            criteria.add(Restrictions.eq("tipoDocumento", pacienteData.getTipoDocumento()));
        }

        if (null != pacienteData.getNumeroDocumento() && !pacienteData.getNumeroDocumento().isEmpty()) {
            criteria.add(Restrictions.eq("numeroDocumento", pacienteData.getNumeroDocumento()));
        }

        if (null != pacienteData.getCodigo() && !pacienteData.getCodigo().isEmpty()) {
            criteria.add(Restrictions.eq("codigo", pacienteData.getCodigo()));
        }
        return criteria.list();

    }

}
