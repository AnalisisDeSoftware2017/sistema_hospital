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
import java.util.List;

/**
 * Created by sbogado on 6/28/17.
 */
@Repository("reporteDao")
public class ReporteDao {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Medico> findAllMedicosByMedicoData(MedicoData medicoData) {
        Session session = entityManager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Medico.class);
        criteria.createAlias("especialidades", "especialidad");
        if (null != medicoData.getEspecialidad()) {
            criteria.add(Restrictions.eq("especialidad.id", medicoData.getEspecialidad().getId()));
        }

        if (null != medicoData.getApellido()) {
            criteria.add(Restrictions.eq("apellido", medicoData.getApellido()));
        }

        if (null != medicoData.getNombre()) {
            criteria.add(Restrictions.eq("nombre", medicoData.getNombre()));
        }

        if (null != medicoData.getTipoDocumento()) {
            criteria.add(Restrictions.eq("tipoDocumento", medicoData.getTipoDocumento()));
        }

        if (null != medicoData.getNumeroDocumento()) {
            criteria.add(Restrictions.eq("numeroDocumento", medicoData.getNumeroDocumento()));
        }

        if (null != medicoData.getCodigo()) {
            criteria.add(Restrictions.eq("codigo", medicoData.getCodigo()));
        }
        return criteria.list();

    }

    public List<Paciente> findAllPacientesByPacienteData(PacienteData pacienteData) {
        Session session = entityManager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Paciente.class);

        if (null != pacienteData.getApellido()) {
            criteria.add(Restrictions.eq("apellido", pacienteData.getApellido()));
        }

        if (null != pacienteData.getNombre()) {
            criteria.add(Restrictions.eq("nombre", pacienteData.getNombre()));
        }

        if (null != pacienteData.getTipoDocumento()) {
            criteria.add(Restrictions.eq("tipoDocumento", pacienteData.getTipoDocumento()));
        }

        if (null != pacienteData.getNumeroDocumento()) {
            criteria.add(Restrictions.eq("numeroDocumento", pacienteData.getNumeroDocumento()));
        }

        if (null != pacienteData.getCodigo()) {
            criteria.add(Restrictions.eq("codigo", pacienteData.getCodigo()));
        }
        return criteria.list();

    }

}
