package ar.edu.unlam.analisis.software.grupo2.core.model;

import javax.persistence.*;

/**
 * Created by sbogado on 4/25/17.
 */
@Entity
public class SituacionDelPaciente extends AbmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Especialidad especialidad;

    @ManyToOne
    private Medico medico;

    private String detalle;

    public SituacionDelPaciente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }


    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "SituacionDelPaciente{" +
                "id=" + id +
                ", paciente=" + paciente +
                ", medico=" + medico +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SituacionDelPaciente that = (SituacionDelPaciente) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (paciente != null ? !paciente.equals(that.paciente) : that.paciente != null) return false;
        return medico != null ? medico.equals(that.medico) : that.medico == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (paciente != null ? paciente.hashCode() : 0);
        result = 31 * result + (medico != null ? medico.hashCode() : 0);
        return result;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }


}
