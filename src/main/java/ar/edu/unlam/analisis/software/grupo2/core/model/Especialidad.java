package ar.edu.unlam.analisis.software.grupo2.core.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by sbogado on 07/05/17.
 */
@Entity
public class Especialidad extends AbmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    @Size
    private String nombreEspecialidad;

    @ManyToMany
    //TODO ver como joinear la tabla
    private List<Medico> medicos;

	@Override
	public String getName() {
		return nombreEspecialidad;
	}


    public Especialidad() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Especialidad that = (Especialidad) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nombreEspecialidad != null ? !nombreEspecialidad.equals(that.nombreEspecialidad) : that.nombreEspecialidad != null)
            return false;
        return medicos != null ? medicos.equals(that.medicos) : that.medicos == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombreEspecialidad != null ? nombreEspecialidad.hashCode() : 0);
        result = 31 * result + (medicos != null ? medicos.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "id=" + id +
                ", nombreEspecialidad='" + nombreEspecialidad + '\'' +
                ", medicos=" + medicos +
                '}';
    }
}
