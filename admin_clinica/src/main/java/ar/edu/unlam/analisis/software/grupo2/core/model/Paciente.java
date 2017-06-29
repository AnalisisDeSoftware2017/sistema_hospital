package ar.edu.unlam.analisis.software.grupo2.core.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by sbogado on 4/24/17.
 */
@Entity
public class Paciente extends Persona {

    //De aca puedo obtener los medicos que lo atienden :)
    @OneToMany(mappedBy = "paciente")
    public List<SituaciondDelPaciente> situaciones;


    public Paciente() {
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

        Paciente paciente = (Paciente) o;

        return situaciones != null ? situaciones.equals(paciente.situaciones) : paciente.situaciones == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (situaciones != null ? situaciones.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return getName();
    }
}
