package ar.edu.unlam.analisis.software.grupo2.core.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by sbogado on 4/24/17.
 */
@Entity
public class Medico extends Persona {



    @ManyToMany
    private List<Especialidad> especialidades;

    @OneToMany(mappedBy = "medico")
    private List<SituaciondDelPaciente> situaciones;


    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public List<SituaciondDelPaciente> getSituaciones() {
        return situaciones;
    }

    public void setSituaciones(List<SituaciondDelPaciente> situaciones) {
        this.situaciones = situaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Medico medico = (Medico) o;

        if (especialidades != null ? !especialidades.equals(medico.especialidades) : medico.especialidades != null)
            return false;
        return situaciones != null ? situaciones.equals(medico.situaciones) : medico.situaciones == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (especialidades != null ? especialidades.hashCode() : 0);
        result = 31 * result + (situaciones != null ? situaciones.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return getName();
    }
}
